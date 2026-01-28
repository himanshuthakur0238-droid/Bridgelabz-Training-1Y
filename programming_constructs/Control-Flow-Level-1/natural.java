import java.util.Scanner;
class natural{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("natural number:");
			int sum=a*(a+1)/2;
			System.out.println("sum="+sum);
		
			}
		else {
			System.out.println("not natural number:");
		}
	}
}

