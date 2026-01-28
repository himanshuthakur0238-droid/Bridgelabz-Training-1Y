import java.util.Scanner;
class compare{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int a=sc.nextInt();
		System.out.println("enter second number:");
		int b=sc.nextInt();
		System.out.println("enter third number:");
		int c=sc.nextInt();
		if(a<b&&a<c){
			System.out.println("a is smaller than both b and c");
		}
		else{
			System.out.println("a is not smaller than both b and c");
		}
	}
}
		