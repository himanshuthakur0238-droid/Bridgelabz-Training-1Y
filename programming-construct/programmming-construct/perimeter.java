import java.util.Scanner;
class perimeter{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of l:");
		int l=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		int p=2*(l+b);
		System.out.println("perimeter of rectangle:"+p);
	}
}