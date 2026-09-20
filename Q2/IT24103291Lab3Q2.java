import java.util.Scanner;
public class IT24103291Lab3Q2{

	public static void main(String []args){
	Scanner input =new Scanner (System.in); 
	
	System.out.println("Enter the monthly salary: ");
	double mSalary = input.nextDouble();
	
	System.out.println("Enter the Number of OT hours: ");
	int otHours = input.nextInt();

	System.out.println("Enter the OT hourly rate: ");
	double otRate = input.nextDouble();

	double otAmount = (otHours*otRate);
	
	System.out.println("The Total salary including OT is: "+(mSalary + otAmount));

	}
}