import java.util.Scanner;
class Addition{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		int sub=a-b;
		System.out.println("Addition of two number: "+sub);
	}
}