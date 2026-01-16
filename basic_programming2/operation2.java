import java.util.Scanner;
class operation2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a:");
		int a=sc.nextInt();
		System.out.println("enter value of b:");
		int b=sc.nextInt();
		System.out.println("enter value of c:");
		int c=sc.nextInt();
		double d=a+b*c;
		double e=a*b+c;
		double f=a%b+c;
		System.out.println("value of d:"+d);
		System.out.println("value of e:"+e);
		System.out.println("value of f:"+f);
	}
}