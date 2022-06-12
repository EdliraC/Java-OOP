package application;
//import i te gjitha klasave qe ka ne perberje
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;//ku perdoret kjo klase?
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

//Cfare do beje kjo klase??
//Klase e perbere nga klasa te tjera Connection, Statement, ResultSet, ResultSetMetaData
//Nje klase qe trashegon (is-a) AbstractTableModel dhe kjo e fundit implementon nderfaqen TableModel
//Klasa ResultSetTableModel mbishkruan disa metoda te TableModel dhe nuk mbishkruan metoda te tjera si isCellEditable() dhe setValueAt()
public class ResultSetTableModel extends AbstractTableModel {
	
	//fusha te klases 
	private final Connection lidhja;
	private final Statement predikati;
	private ResultSet pergjigje;
	private ResultSetMetaData pergjigjeMetaData;
	private int nrRreshta;
	private boolean eLidhurMeDB=false;//mban gjurme te lidhjes me DB
	
	public ResultSetTableModel(String url, String perdorues, String fjalekalim, String query) throws SQLException
	{
		//inicializimi i fushes lidhja
		lidhja=DriverManager.getConnection(url, perdorues, fjalekalim);
		//inicializim i fushes predikati
		predikati=lidhja.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		//perditesim i fushes eLidhurMeDB
		eLidhurMeDB=true;
		
		//vendos query dhe ekzekutimi i tij
		setQuery(query);
	}

	//eshte e nevojshme te gjendet klasa e kolonave te rezultatit ne menyre qe te shfaqen sakte te dhenat e saj ne JTable
	public Class getColumnClass(int kolona) throws IllegalStateException
	{
		if(!eLidhurMeDB)
			throw new IllegalStateException("There is no connection to DB");
		
		//te percaktohet klasa e nje kolone
		try
		{
			String emerKlase=pergjigjeMetaData.getColumnClassName(kolona + 1);
			return Class.forName(emerKlase);
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//nese nuk ka lidhje me DB atehere kthen class te Object
		return Object.class;
	}
	
	public int getColumnCount() throws IllegalStateException{
		
		if(!eLidhurMeDB)
			throw new IllegalStateException("Not Connected to DB");
		try {
			
			return pergjigjeMetaData.getColumnCount();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return 0;
	}
	
	//te gjendet emrin i kolones
 public String getColumnName(int nrKolone) throws IllegalStateException
 {
	 if(!eLidhurMeDB)
			throw new IllegalStateException("Not Connected to DB");
	 
	 try {
		 return pergjigjeMetaData.getColumnName(nrKolone+1);
		 
	 }
	 catch(SQLException sqlE ){
		 sqlE.printStackTrace();
	 }
	 
	 return "";
 }
 
 public int getRowCount() throws IllegalStateException
 {
	 if(!eLidhurMeDB)
		 throw new IllegalStateException("Not Connected to DB");
	 
	
		 return nrRreshta;
	 
 }
 
 public Object getValueAt(int rresht, int shtylle) throws IllegalStateException
 {
	 if(!eLidhurMeDB)
		 throw new IllegalStateException("Not connected to database");
	 
	 try {
		 pergjigje.absolute(rresht+1);
		 return pergjigje.getObject(shtylle+1);
	 }
	 
	 catch(SQLException SQLe){
		 SQLe.printStackTrace();
		 
	 }
	 
	 return "";
	 
 }
 
 
 public void setQuery(String query) throws IllegalStateException, SQLException
 {
	 //sigurojme qe jemi te lidhur me db
	 if(!eLidhurMeDB)
		 throw new IllegalStateException("Not connected to database");
	 //ruaj pergjigjen e querit
	pergjigje=predikati.executeQuery(query);
	//merr metadata nga pergjigjia si kolonat, tipet e te dhenave ne to
	pergjigjeMetaData=pergjigje.getMetaData();
	
	//percakto nr e rreshtave ne rezultat
	pergjigje.last();//kjo metode leviz kursorin e objektit ResultSet nga pozicioni i tij fillestar tek rreshti i fundit
	nrRreshta=pergjigje.getRow();//kjo metode gjen numrin e rreshtit ku ndodhet aktualisht kursori
	
	 fireTableStructureChanged();//metode e AbstractTableModel
	 
 }
 
 
 //mbyll lidhjet e Statement dhe Connection
 public void disconnectFromDatabase()
 {
	 if(eLidhurMeDB)
		 
		 try {
			 pergjigje.close();
			 predikati.close();
			 lidhja.close();
			 
		 }
	 catch(SQLException sqlE)
	 {
		 sqlE.printStackTrace();
	 }
		 
	 
	 finally {
		 
		 eLidhurMeDB=false;
	 }
 }
 
 
 
 
 
 
 
 
 
}

