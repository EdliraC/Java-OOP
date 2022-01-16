//4.17 (Student Grades) A group of five students earned the following grades: Student 1, ‘A’; student
//2, ‘C’; student 3,‘B’; student 4, ‘A’and student 5, ‘B’. Write an application that reads a series
//of pairs of numbers as follows:
//a) student name
//b) student letter grade
//Your program should use a switch statement to determine how many students got a grade of ‘A’,
//how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
//loop as needed to input the five student grades, and then finally display the results.
import java.util.Scanner;
public class StudentsGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//te numerohen se sa studente kane marre nota A, B, C, D 
		
		//te futet emri i studentit
		//te futet germa e notes se tij
		//te numerohet nr i studenteve te kesaj note
		
		//te inicializohet variablat nrNotaA, nrNotaB, nrNotaC, nrNotaD
		int nrNotaA=0;
		int nrNotaB=0;
		int nrNotaC=0;
		int nrNotaD=0;
		//te inicializohet nje numrator cikli me vlera nga 1 tek 5
		int nrStudente=1;
	
		//te inicializohet nje variabel qe mban notenGerme
		String notaGerme;
		Scanner input=new Scanner(System.in);
	
		while(nrStudente<6)
		{
			
			//te lajmerohet te futet nota e studentit
			System.out.println("Te futet nota e studentit");
			notaGerme=input.next();
			// nese nota ka germen A, te rritet me 1 nrNotaA
						//nese nota ka germen B, te rritet me 1 nrNotaB...
			switch(notaGerme)
			{
			case "A":
				nrNotaA++;
				break;
				
			case "B":
				nrNotaB++;
				break;
			
			case "C":
				nrNotaC++;
				break;
				
			case "D":
				nrNotaC++;
				break;
			default:
				System.out.println("Nuk keni futur ndonje germe te vlefshem");
				
			}
						
			//te rritet me 1 nrCikli
			nrStudente++;
		}
		
		System.out.printf("Studente me A\t %d%nStudente me B\t %d%nStudente me C\t %d%nStudente me D\t %d%n", nrNotaA, nrNotaB, nrNotaC, nrNotaD);
			//nese nrCikli<6 vazhdo me studentit tjeter
			//Ne fund te afishohen nr e notava A, B,C, dhe D
			
		}
	
	}


