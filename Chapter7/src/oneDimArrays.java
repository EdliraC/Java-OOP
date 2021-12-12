//Write statements that perform the following one-dimensional-array operations:

//b) Add one to each of the 15 elements of integer array bonus.
//c) Display the five values of integer array bestScores in column format.

public class oneDimArrays {
	
	public static void main(String [] args)
	{
		//a) Set the 10 elements of integer array counts to zero.
		int [] v1=new int[10];
		
		for(int index=0; index<v1.length; index++)
			v1[index]=0;
		//b) Add one to each of the 15 elements of integer array bonus.
		
		int [] bonus=new int[15];
		
		for(int i=0; i<bonus.length; i++)
			bonus[i]+=1;
		
		//c) Display the five values of integer array bestScores in column format.
		int [] bestScores=new int[5];
		
		for(int sc: bestScores)
			System.out.println(sc);
		
		
	}

}
