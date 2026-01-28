import java.util.Scanner;
class pallindrome{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int rem;
		int rev=0;
		int q=num;
		while(q!=0){
			rem=q%10;
			rev=rev*10+rem;
			q=q/10;
		}
		if(rev==num){
			System.out.println("Pallindrome");
		}
		else{
			System.out.println("not");
		}
	}
}
			