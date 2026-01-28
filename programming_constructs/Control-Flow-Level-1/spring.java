import java.util.Scanner;
class spring{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of month");
		int a=sc.nextInt();
		System.out.println("enter date");
		int b=sc.nextInt();
		if(a==3&&b>=21||a==4||a==5||a==6&&b<20){
			System.out.println("spring season");
		}
		else {
			System.out.println("not");
		}
	}
}