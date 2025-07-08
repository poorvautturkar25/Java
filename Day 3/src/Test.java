import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Enter The Number :");
		int num = sc.nextInt();
		
		System.out.println("Given Number :" + num);
		System.out.println("Binary Eqivalent is :" + Integer.toBinaryString(num) );
		System.out.println("Octal Equivalent is :" + Integer.toOctalString(num) );
		System.out.println("Hexadecimal Eqivalent is :" + Integer.toHexString(num) );
		
		
	}

}
