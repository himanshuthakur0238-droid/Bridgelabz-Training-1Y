import java.util.Scanner;
class miles{
	public static void main(String []args){
		Scanner sc=new Scanner (System.in);
		System.out.println("enter distance in km:");
		int a=sc.nextInt();
		double miles=0.625*a;
		System.out.println("distance in miles:"+miles);
	}
}