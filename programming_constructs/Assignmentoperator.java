import java.util.Scanner;
class Assignmentoperator{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a:");
		int a=sc.nextInt();
		System.out.println("enter value of b:");
		int b=sc.nextInt();
		a+=b;
		System.out.println("+= :"+a);
		a-=b;
		System.out.println("-=:"+a);
		a/=b;
		System.out.println("/=:"+a);
		a%=b;
		System.out.println("%=:"+a);
		
	}
}
	