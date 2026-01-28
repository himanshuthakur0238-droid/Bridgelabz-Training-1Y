import java.util.Scanner;
class bonus{
	public static void main(String[]ars){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary:");
		int a=sc.nextInt();
		System.out.println("enter year of service:");
		int b=sc.nextInt();
		int bonus=a*5/100;
		if(b>5){
			System.out.println("bonus of employee:"+bonus);
		}
		else{
			System.out.println("not eligible for bonus");
		}
	}
}
			