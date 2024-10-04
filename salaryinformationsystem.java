import java.util.*;
import java.text.DecimalFormat;
class salaryinformationsystem{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		DecimalFormat decor = new DecimalFormat("0.00");
		
		
		
		System.out.println("\t\t\t------------------------------------------------------------------------");
		System.out.println("\t\t\t| \t\t\tSALARY INFORMATION SYSTEM                      |");
		System.out.println("\t\t\t------------------------------------------------------------------------");
		
		System.out.println();
		
		System.out.println("\t\t\t\t[1] Calculatte Income Tax ");
				
		System.out.println("\t\t\t\t[2] Calculate Annual Bonus ");
		
		System.out.println("\t\t\t\t[3] Calculatte Loan Amount ");
		
		System.out.println();
		
		System.out.print("\t\t\tEnter an option to continue > ");
		int a = input.nextInt();
		
		
		
		System.out.println();
		
		
		if (a==1){
			System.out.println("\t\t\t------------------------------------------------------------------------");
			System.out.println("\t\t\t| \t\t\tCalculate Income Tax                           |");
			System.out.println("\t\t\t------------------------------------------------------------------------");
			
			
			System.out.println();
			
			System.out.print("\t\t\tInput Employee Name\t- ");
			String name = input.nextLine();
			
			input.nextLine();
			
			System.out.print("\t\t\tInput Employee Salary\t- ");
			double salary = input.nextDouble();
			
			System.out.println();
			
			double tax=0;
			
			if (salary<=100000){
				tax = 0;
				System.out.println("\t\t\tYou have to pay Income tax per month: "+Math.round(tax));
				
			} else if (salary<141667){
				salary-=100000;
				
				salary=salary*0.06;
				tax+=salary;
				System.out.println("\t\t\tYou have to pay Income tax per month: "+Math.round(tax));
				
			} else if (salary<=183333){
				salary-=100000;
				
				double secondsal = 41667*0.06;
				salary = (salary - 41667) * 0.12;
			
				
				tax+=salary+secondsal;
				System.out.println("\t\t\tYou have to pay Income tax per month: "+Math.round(tax));
				
			} else if (salary<=225000){
				salary-=100000;
				
				double thirdsal = 41667*0.06;
				double thirdsal2 =  41667 * 0.12;
				salary = (salary - 41667 - 41667) * 0.18;
				
				tax+=salary+thirdsal+thirdsal2;
				System.out.println("\t\t\tYou have to pay Income tax per month: "+Math.round(tax));
				
			} else if (salary<=266667){
				salary-=100000;
				
				double fourthsal1 = 41667 * 0.06;
				double fourthsal2 = 41667 * 0.12;
				double fourthsal3 = 41667 * 0.18;
				salary = (salary - 41667 - 41667 - 41667) * 0.24;
				
				tax+= salary+fourthsal1 + fourthsal2 + fourthsal3;
				System.out.println("\t\t\tYou have to pay Income tax per month: "+Math.round(tax));
				
			} else if (salary<=308333){
				salary-=100000;
				
				double fifthsal1 = 41667 * 0.06;
				double fifthsal2 = 41667 * 0.12;
				double fifthsal3 = 41667 * 0.18;
				double fifthsal4 = 41667 * 0.24;
				salary = (salary - 41667 - 41667 - 41667 - 41667 - 41667) * 0.30;
				
				tax+=salary + fifthsal1 + fifthsal2 + fifthsal3 + fifthsal4;
				System.out.println("\t\t\tYou have to pay Income tax per month: "+Math.round(tax));
				
			} else{
				salary-=100000;
				
				double msal1 = 41667 * 0.06;
				double msal2 = 41667 * 0.12;
				double msal3 = 41667 * 0.18;
				double msal4 = 41667 * 0.24;
				double msal5 = 41667 * 0.30;
				salary = (salary - 41667 - 41667 - 41667 - 41667 - 41667) * 0.36;
				
				tax += salary + msal1 + msal2 + msal3 + msal4 + msal5;
				System.out.println("\t\t\tYou have to pay Income tax per month: "+Math.round(tax));
			}		
		}
		if (a==2){
			System.out.println("\t\t\t------------------------------------------------------------------------");
			System.out.println("\t\t\t| \t\t\tCalculate Annual Bonus                         |");
			System.out.println("\t\t\t------------------------------------------------------------------------");
			
			
			System.out.println();
			
			System.out.print("\t\t\tInput Employee Name\t- ");
			String name = input.nextLine();
			
			input.nextLine();
			
			System.out.print("\t\t\tInput Employee Salary\t- ");
			double salary = input.nextDouble();
			
			System.out.println();
			
			
			double bonus;
			
			if (salary<100000){
				
				bonus = salary+5000;
				
			} else if (salary<=199999){
				
				bonus = salary*0.10;
				
			} else if (salary<=299999){
				
				bonus = salary*0.15;
			
			} else if (salary<=399999){
				
				bonus = salary * 0.20;
			
			} else {
				
				bonus = salary * 0.35;
				
			}			
			
			System.out.print("\t\t\tAnnual Bonus\t - "+decor.format(bonus));		
			
		}
		
							
	}
}
			
				
		
