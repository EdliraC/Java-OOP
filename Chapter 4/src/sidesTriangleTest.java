import javax.swing.JOptionPane;

public class sidesTriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sidesTriangle trekendesh=new sidesTriangle(0,0,0);
		
		trekendesh.setSides();
		
		if (trekendesh.isTriangle())
			
			JOptionPane.showMessageDialog(null, "Brinjet i perkasin nje trekendeshi");
		
		else 
			JOptionPane.showMessageDialog(null, "Brinjet nuk i perkasin nje trekendeshi");
		
		
		//testojme nese trekendeshi eshte kenddrejte
		
		if (trekendesh.isRightTriangle())
			
			JOptionPane.showMessageDialog(null, "\nTrekendeshi eshte kenddrejte");
		
		else 
			JOptionPane.showMessageDialog(null, "\nTrekendeshi nuk eshte kenddrejte");

	}

}
