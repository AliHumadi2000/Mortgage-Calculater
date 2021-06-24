//mortgage calculator
import java.util.Scanner;//import scanner class
import java.text.NumberFormat;//import formating number java.text.NumberFormat;
class Mortgage
	{
	public static void main(String[] args)
		{
		Scanner input=new Scanner(System.in);//taking the input from the user 
		final int precent=100;
		final int month=12;
		System.out.print("Enter the principle / the amount of loan: ");
		int prin=input.nextInt();
		System.out.print("Enter the annual interest rate :");
		float ann=input.nextFloat();
		float MonthlyInterst=ann/precent/month;
		System.out.print("Period (years) :");
		int year=input.nextInt();
		//calculate the number of payment
		int y=year*month;
		double result=prin*(MonthlyInterst*Math.pow((1+MonthlyInterst),y))/(Math.pow((1+MonthlyInterst),y)-1);
		String mortag=NumberFormat.getCurrencyInstance().format(result);
		System.out.println("Mortagage is : "+mortag);
		
		
	
		}
	}
	