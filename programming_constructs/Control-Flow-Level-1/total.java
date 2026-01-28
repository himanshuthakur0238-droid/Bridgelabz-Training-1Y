import java.util.Scanner;
class total{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double total=0.0;
		double sum=0;
		double a=1;
		while(a!=0){
		System.out.println("enter value");
		double b = sc.nextInt();
		
			a = b;
		    sum=sum+a;
		}
			System.out.println("sum:"+sum);
		
	}
}