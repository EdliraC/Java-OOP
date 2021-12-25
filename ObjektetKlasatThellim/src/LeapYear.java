
public class LeapYear {

	public static void main(String[] args) {

		//te printojme vitet e brishta nga viti 1900-3000
		
		
		for(int year=1900; year<=3000; year++ )
		{
			 if ((year % 400 == 0 || ( year % 4 == 0 &&  year % 100 != 0)))
				 System.out.println(year);
		}

	}

}
