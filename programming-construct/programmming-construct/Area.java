import java.util.Scanner;
class Area{
	public static void main(String []args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of r:"); 
		int r=sc.nextInt();
		double Area=3.14*r*r;
		System.out.println("Area of circle :"+Area);
	}
}