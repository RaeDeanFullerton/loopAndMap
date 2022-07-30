import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class HelloWorld1 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.print("Please give me a number.");
		Integer a = input.nextInt();
		System.out.print("Please give me a  second number.");
		Integer b = input.nextInt();
		System.out.print("Please give me a third number.");
		Integer c = input.nextInt();
		System.out.print("Please give me a fourth number.");
		Integer d = input.nextInt();
		System.out.print("Please give me a fifth number.");
		Integer e = input.nextInt();
		ArrayList<Integer> arl = new ArrayList<Integer>();
			arl.add(a);
			arl.add(b);
			arl.add(c);
			arl.add(d);
			arl.add(e);
		System.out.println("Your collection of numbers are " + arl.toString());
		Collections.sort(arl);
		System.out.println("Your numbers in ascending order: "+ arl);
		Collections.sort(arl, Collections.reverseOrder());
		System.out.println("Your numbers in descending order: "+ arl);
		Integer sum= a+b+c+d+e;
		System.out.println(sum + " is the total of your given numbers.");
		Integer product= a*b*c*d*e;
		System.out.println(product + " is the product of your given numbers.");
		
		
		
		
		
		
		
	}

}
