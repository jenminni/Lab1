package Main;

import java.util.Scanner;


public class retirement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Ask user for years they plan to work
		System.out.print("Enter number of years you plan to work:");
		double years_worked = input.nextDouble();
		
		//Ask user for expected average return on investment
		System.out.print("Enter expected average return on investment:");
		double i_return = input.nextDouble();
		
		//Ask user number of years retired 
		System.out.print("Enter number of years retired:");
		double years_retired = input.nextDouble();
		
		//Ask user for required income
		System.out.print("Enter required income:");
		double income = input.nextDouble();
		
		//Ask user for expected SSI income
		System.out.print("Enter expected SSI income:");
		double ssi = input.nextDouble();
		
		//Ask user for expected average pay back return on investment
		System.out.print("Enter expected average pay back return on investment:");
		double p_return = input.nextDouble();
		
		
		double fv = income - ssi;
		double i = p_return / 12;
		double n = years_retired * 12;
		double pv = fv * ((1 - Math.pow(1+i, -n)) / i);
		
		System.out.println("What you need saved is: " + pv);
		
		i = i_return / 12;
		n = years_worked * 12;
		double pmt;
		
		pmt = -pv * i / (1 - Math.pow(1+i, n));
		
		System.out.println("What you need to save each month is: " + pmt);			
				
	}
	
}
