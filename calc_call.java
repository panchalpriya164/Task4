import java.util.*;
public class calc_call {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Calculator c1=new Calculator();
		System.out.print("Enter Number 1:");
		int num1 = s1.nextInt();
		c1.setN1(num1);
		System.out.print("Enter Number 2:");
		int num2 = s1.nextInt();
		c1.setN2(num2);
		c1.setSname("ABC");

		System.out.println(c1.toString());
		System.out.println("addition:"+c1.getadd());
		System.out.println("Substraction:"+c1.getsub());
		System.out.println("Multiplication:"+c1.getmul());
		System.out.println("Division:"+c1.getdiv());
		}
}
