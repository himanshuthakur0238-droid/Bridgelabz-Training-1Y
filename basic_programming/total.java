import java.util.Scanner;
class total{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter unit price:");
		int a=sc.nextInt();
		System.out.println("enter Quantity:");
		int b=sc.nextInt();
		int total=a*b;
		System.out.println("total price:"+total);
	}
}