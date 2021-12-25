
public class PitagoreanTriples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Brinja1  Brinja2  Hipotenuze \n");
		for(int z=1; z<=500; z++)
		{
			for(int y=1; y<=500; y++)
			{
				for(int x=1; x<=500; x++)
				{
					if((x*x+ y*y)==z*z)
						System.out.printf("%7d  %7d  %10d \n", x, y, z);
				}
			}
		}
		

	}

}
