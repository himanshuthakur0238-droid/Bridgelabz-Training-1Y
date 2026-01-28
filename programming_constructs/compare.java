import java.util.Scanner;
class compare{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
			int first=sc.nextInt();
		System.out.println("enter second number");
		int second=sc.nextInt();
		System.out.println("enter third number");
		int third=sc.nextInt();
		if(first>second&&second>third)
		{
		System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
		