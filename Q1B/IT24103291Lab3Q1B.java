import java.util.Scanner;
public class IT24103291Lab3Q1B{
	public static void main(String []args){

	Scanner input =new Scanner (System.in); 

	System.out.println("Enter the price of 1kg of rice: ");
	double price = input.nextDouble();

	System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

	double amount = price * kilograms;
	System.out.println("Amount you have to pay: Rs. " + amount);

	double totalAmount=(amount-amount*0.1);
	System.out.println("total Amount with 10% discount is = " + totalAmount);


		
  	input.close();

	}
}