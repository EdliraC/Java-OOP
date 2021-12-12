import javax.swing.JOptionPane;
//Te gjendet Nota Mesatare duke futur notat e klases nga nje Dritare Dialogu me Input
public class NotaMesatare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//te gjendet nota mesatare ne provimin Matematikes se studenteve te EEL2
		
		//deklarojme variablat
		 int numerStudentesh=0;
		 int noteShuma=0;
		 int nota=0;
		 float noteMesatare=0;
		 
		 JOptionPane.showMessageDialog(null, "Mireserdhet ne kete program te vogel");
		 
		 //Lajmeroj perdoruesin te fuse noten e pare
		 String VarInput=JOptionPane.showInputDialog("Fusni noten ose -1 per te ndaluar");
		 nota=Integer.parseInt(VarInput);
		 
		 while(nota!=-1)
		 {
			 //Numero noten e futur dhe mblidh me shumen e notave
			 numerStudentesh+=1;
			 noteShuma+=nota;
			 //Lajmero perdoruesin te fuse noten tjeter ose te ndaloje hedhjen e notave
			 VarInput=JOptionPane.showInputDialog("Fusni noten ose -1 per te ndaluar");
			 nota=Integer.parseInt(VarInput);
			 
					 			 
		 }
		 
				 
		 if(numerStudentesh!=0)
		 {
			 noteMesatare=(float)noteShuma/numerStudentesh;
			 String mesazhMesatare=String.format("Ju keni futur %d studente dhe nota mesatare e kesaj klase eshte %.2f",
					 numerStudentesh,noteMesatare);
			 JOptionPane.showMessageDialog(null, mesazhMesatare);
		 }
		 else
			 JOptionPane.showMessageDialog(null, "Ju nuk keni futur ndonje note");
		 
	}

}
