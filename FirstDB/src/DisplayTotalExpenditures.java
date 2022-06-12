import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DisplayTotalExpenditures {

	public static void main(String[] args) {
		
		final String DATABASE_URL="jdbc:mysql://localhost/publicbudget";
		final String SELECT_QUERY= "SELECT UnitName, programName, TotalBudgetedExpenditure FROM expenditurebudgeted";
		
		try (
			Connection lidhje=DriverManager.getConnection(DATABASE_URL, "root","");
			Statement statement=lidhje.createStatement();
			ResultSet resultSet=statement.executeQuery(SELECT_QUERY))
		{
			ResultSetMetaData metadata=resultSet.getMetaData();
			int nrKolonave=metadata.getColumnCount();
			
			System.out.printf("Expenditures for Units and Program:%n%n");
			//shfaq emrat e kolonave
			for(int i=1; i<=nrKolonave; i++) 
			{
				System.out.printf("%-50s\t", metadata.getColumnName(i));
				
			}
			
			System.out.println();
			
			//te shfaqen rezultate e query
			while(resultSet.next()) 
			{
				for(int i=1; i<=nrKolonave; i++)
				{
					System.out.printf("%-50s\t", resultSet.getObject(i));
				}
				
				System.out.println();
			}
			
		}
		
		catch(SQLException sqlE)
		{
			sqlE.printStackTrace();
		}
	}

}
