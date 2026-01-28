import java.util.Scanner;
class factorial2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int a=sc.nextInt();
		int fact=1;
		int i=1;
		for(i=1;i<=a;i++){
			fact=fact*i;
		}
		System.out.println("factorial is :"+fact);
	}
}
			
