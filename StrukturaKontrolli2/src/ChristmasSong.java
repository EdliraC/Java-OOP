
public class ChristmasSong {

	public static void main(String[] args) {
	
		String kengaHead="";
		String kengaVargje="";
		String dayS="";
		
		for(int day=1; day<=12;day ++)
		{
			
			switch(day)
			{
				case 1:
					dayS="first";
					
					break;
				
				
				case 2:
					dayS="second";
					break;
				
				case 3:
					dayS="third";
					break;	
					
				case 4:
					dayS="fourth";
					break;
					
				case 5:
					dayS="fifth";
					break;
					
				case 6:
					dayS="sixth";
					break;
					
				case 7:
					dayS="seventh";
					break;
					
				case 8:
					dayS="eighth";
					break;
					
				case 9:
					dayS="ninth";
					break;
				case 10:
					dayS="tenth";
					break;
				case 11:
					dayS="eleventh";
					break;
				case 12:
					dayS="twelfth";
					break;
					
				default:
					dayS="";
									
			}
		
			switch(day)
			{
				case 1:
					kengaHead= String.format("On the %s day of Christmas\n My true love gave to me\n", dayS);
							
					kengaVargje=String.format("%s \n %s\n", "A partridge in a pear tree.", kengaVargje);
							
					
					break;
				
				
				case 2:
					kengaHead= String.format("On the %s day of Christmas\n My true love gave to me\n", dayS);
					kengaVargje=String.format("%s \n %s\n", "Two turtle doves", kengaVargje);
					
					break;
				
				case 3:
					kengaHead= String.format("On the %s day of Christmas\n My true love gave to me\n", dayS);
					kengaVargje=String.format("%s \n %s\n", "Three French hens,", kengaVargje);
					break;		
					
				case 4:
					kengaHead= String.format("On the %s day of Christmas\n My true love gave to me\n", dayS);
					kengaVargje=String.format("%s \n %s\n", "Four calling birds,", kengaVargje);
					break;
				
				case 5:
					kengaHead= String.format("On the %s day of Christmas\n My true love gave to me\n", dayS);
					kengaVargje=String.format("%s \n %s\n", "Five golden rings,", kengaVargje);
					break;
					
				case 6:
					kengaHead= String.format("On the %s day of Christmas\n My true love gave to me\n", dayS);
					kengaVargje=String.format("%s \n %s\n", "Six geese a-laying,", kengaVargje);
					break;
					
				case 7:
					kengaHead= String.format("On the %s day of Christmas\n My true love gave to me\n", dayS);
					kengaVargje=String.format("%s \n %s\n", "Seven swans a-swimming,,", kengaVargje);
					break;
					
				case 8:
					kengaHead= String.format("On the %s day of Christmas\n My true love gave to me\n", dayS);
					kengaVargje=String.format("%s \n %s\n", "Eight maids a-milking,", kengaVargje);
					break;
					
				case 9:
					kengaHead= String.format("On the %s day of Christmas\n My true love gave to me\n", dayS);
					kengaVargje=String.format("%s \n %s\n", "Nine ladies dancing,", kengaVargje);
					break;
					
				case 10:
					kengaHead= String.format("On the %s day of Christmas\n My true love gave to me\n", dayS);
					kengaVargje=String.format("%s \n %s\n", "Ten lords a-leaping,", kengaVargje);
					break;
					
				case 11:
					kengaHead= String.format("On the %s day of Christmas\n My true love gave to me\n", dayS);
					kengaVargje=String.format("%s \n %s\n", "Eleven pipers piping,", kengaVargje);
					break;
					
				case 12:
					kengaHead= String.format("On the %s day of Christmas\n My true love gave to me\n", dayS);
					kengaVargje=String.format("%s \n %s\n", "Twelve drummers drumming,", kengaVargje);
					break;
					
			default:
				kengaHead="";
				kengaVargje="";
									
			}
			
		
			System.out.printf("%s %s", kengaHead, kengaVargje);
		
		}

	}

}
