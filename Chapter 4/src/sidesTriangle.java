import javax.swing.JOptionPane;
public class sidesTriangle {
	
	int a;
	int b;
	int c;
	
	public sidesTriangle(int side1, int side2, int side3) {
		
		a=side1;
		b=side2;
		c=side3;
		
	}
	
	public void setSides()
	{
		//futja e brinjeve te trekendeshit
		
		String input= JOptionPane.showInputDialog("Vendos brinjen e pare");
		
		a=Integer.parseInt(input);
		
		//fut brinjen e dyte te trekendeshit
		
		input=JOptionPane.showInputDialog("Vendos brinjen e dyte");
		
		b=Integer.parseInt(input);
		
		//fut brinjen e trete
		
		
		input= JOptionPane.showInputDialog("Vendos brinjen e trete");
		c=Integer.parseInt(input);
				
		
	}
	
	
	public boolean isTriangle()
	{
		if((a<b+c)&&(b<a+c)&&(c<a+b))
			return true;
		
		else 
			return false;
	}
	
	
	public boolean isRightTriangle()
	{
		//gjejme cila eshte brinja me e gjate
		
		if ((a>b)&&(a>c))
			//a eshte brinja me e gjate
			if(a*a==b*b+c*c)
				return true;
			else
				return false;
		else
			//b eshte brinja me e gjate
			if((b>a)&&(b>c))
				
				if(b*b==a*a+c*c)
					return true;
				else
					return false;
			else
				//c eshte brinja me gjate
				if((c>a)&&(c>b))
					
					if(c*c==a*a+b*b)
						return true;
					else 
						return false;
				else
					return false;// te treja brinjet mund te jene te te njejta
			
	}

}
