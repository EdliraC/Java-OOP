
public class VleraPI {

	public static void main(String[] args) {
		//inicializojme variablat Seri=0, perpjesetuesTermi=1 dhe numerator te termave te serise i=1
		double Seri=4;
		double perpjesetuesTermi=1;
		int i=2;
		
		//ndersa numerTermi eshte <20000
		
	while(i<=400000)	
	{
		//atehere
		//nese numerTermi eshte cift,
		if(i%2==0)
		{

			//llogarisim perpjesetuesTermi si PerpjesetuesTermi +2
			 perpjesetuesTermi+=2;
			//Llogarisim seri=seri -4/perpjesetuesTermi
			Seri=Seri-4/perpjesetuesTermi;
		}
		else
		{
//			perndryshe 
					//llogarisim perpjesetuesTermi si PerpjesetuesTermi +2
					 perpjesetuesTermi+=2;
					//	llogarisim seri=seri+4/perpjesetuesTermi
					Seri=Seri+4/perpjesetuesTermi;	
		}
		//	rrisim numeratorin e termave te serise i me 1
		i++;
		


	}
		
	//afishojme Seri
	
	System.out.printf("Numri Pi me %d terma eshte %.6f", i, Seri);
		
		
		
	}

}
