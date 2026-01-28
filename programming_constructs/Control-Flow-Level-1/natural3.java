import java.util.Scanner;
class natural3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int sum=n*(n+1)/2;
		int total=0;
		for(int i=n;i>0;i--){
			total=total+i;
		}
		System.out.println("sum is :"+sum);
		System.out.println("total is:"+total);
		if(sum==total){
			System.out.println("it is correct:");
		}
		else{
			System.out.println("it is wrong:");
	}
	}
}
			