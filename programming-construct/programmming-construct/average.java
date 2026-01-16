import java.util.Scanner;
class average{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a:");
		int a=sc.nextInt();
		System.out.println("enter value of b:");
		int b=sc.nextInt();
		System.out.println("enter value of c:");
		int c=sc.nextInt();
		int avg=(a+b+c)/3;
		System.out.println("avg of two number:"+avg);
	}
}