import java.util.Scanner;
	public class NegativePositiveAndZeroValues{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter firt number: ");
	int num1 = input.nextInt();

	System.out.print("Enter second number: ");
	int num2 = input.nextInt ();

	System.out.print("Enter third number: ");
	int num3 = input.nextInt ();

	System.out.print("Enter fourth number: ");
	int num4 = input.nextInt ();
	
	System.out.print("Enter fifth number: ");
	int num5 = input.nextInt ();

	int negative = 0;
	int positive = 0;
	int zero = 0;

	if (num1 < 0)
		negative++;
	
	if (num1 > 0)
		positive++;

	if (num1 == 0)
		zero++;		
		
	if (num2 < 0)
		negative++;
	
	if (num2 > 0)
		positive++;

	if (num2 == 0)
		zero++;			
	
	if (num3 < 0)
		negative++;
	
	if (num3 > 0)
		positive++;
	
	if (num3 == 0)
		zero++;			
	
	if (num4 < 0)
		negative++;
	
	if (num4 > 0)
		positive++;

	if (num4 == 0)
		zero++;			
	
	if (num5 < 0)
		negative++;
	
	if (num5 > 0)
		positive++;

	if (num5 == 0)
		zero++;		
	
	System.out.println(negative);
	System.out.println(positive);
	System.out.println(zero);
	

}





}