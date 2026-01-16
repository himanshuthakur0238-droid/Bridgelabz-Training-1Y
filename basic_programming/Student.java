import java.util.Scanner;
class Student{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.println("enter pens:");
		int a=sc.nextInt();
		System.out.println("enter student:");
		int b=sc.nextInt();
		int q=a/b;
		int r=a%b;
		System.out.println("quitiont:"+q);
		System.out.println("remainder:"+r);
	}
}