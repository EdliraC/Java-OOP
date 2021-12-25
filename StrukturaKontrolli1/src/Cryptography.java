
public class Cryptography {
	
	
	
	
	public int ndajShifra1(int n)
	{
		int s4=n%10;
		
		return s4;
	}
	
	public int ndajShifra10(int n)
	{
		int s3=(n/10)%10;
		
		return s3;
	}
	
	
	public int ndajShifra100(int n)
	{
		int s2=(n/100)%10;
		
		return s2;
	}
	
	public int ndajShifra1000(int n)
	{
		int s1=(n/1000)%10;
		
		return s1;
	}
	
		
			
	
	public String encrypt(int n)
	{
		
		int s11=(ndajShifra1000(n)+7)%10;
		int s21=(ndajShifra100(n)+7)%10;
		int s31=(ndajShifra10(n)+7)%10;
		int s41=(ndajShifra1(n)+7)%10;
		
		//nderro vendet
		int temp=s11;
		s11=s31;
		s31=temp;
		
		temp=s21;
		s21=s41;
		s41=temp;
		
		//kthehet numri i ri
		return String.format("%d%d%d%d", s11,s21,s31,s41);
		
		
		
	}
	
	
	 public String decrypt(int n)
	 {
		 
		 //ndaj ne shifra n
		 	int s11=ndajShifra1000(n);
			int s21=ndajShifra100(n);
			int s31=ndajShifra10(n);
			int s41=ndajShifra1(n);
			
		//nderro vendet
			int temp=s11;
			s11=s31;
			s31=temp;
			
			temp=s21;
			s21=s41;
			s41=temp;
		//llogarit shifren e re
			
			s11=((s11+10)-7)%10;
			s21=((s21+10)-7)%10;
			s31=((s31+10)-7)%10;
			s41=((s41+10)-7)%10;
			
		//afisho nr e ri
		
			return String.format("%d%d%d%d", s11,s21,s31,s41);
		 
	 }

}
	
	