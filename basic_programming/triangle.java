import java.util.Scanner;
class triangle{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of height:");
	int a=sc.nextInt();
	System.out.println("enter value of base:");
	int b=sc.nextInt();
	int area=1*a*b/2;
	double areainch=0.394*area;
	System.out.println("area of triangle in cm:"+area);
	System.out.println("area of triangle in inches:"+areainch);
	}
}
	
