package Demo;
import java.util.Scanner;
public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter Name:");
		String a = sc.nextLine();
		
		System.out.println("enter id:");
		int b = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("enter Address:");
		String c = sc.nextLine();
		
		System.out.println("enter Department:");
		String d = sc.nextLine();
		
		System.out.println("phone no:");
		int e = sc.nextInt();
		
		System.out.println("STUDENTS DETAILS");
		System.out.println("==================");


		
		System.out.println("Name:"+a);
		System.out.println("----------------");
		
		System.out.println("id:"+b);
		System.out.println("----------------");
		System.out.println("Address:"+c);
		System.out.println("----------------");
		System.out.println("Department:"+d);
		System.out.println("----------------");
		System.out.println("phone no:"+e);
		 
		
		
		

	}

}
