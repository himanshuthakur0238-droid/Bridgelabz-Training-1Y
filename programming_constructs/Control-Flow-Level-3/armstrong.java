import java.util.Scanner;
class armstrong{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		int l=n;
		int r;
		int result=0;
		while(n>0){
			r=n%10;
			result=result+(r*r*r);
			n=n/10;
		}
		if(result==l){
			System.out.println("armstrong number");
		}
		else{
			System.out.println("not");
		}
	}
}