import java.util.Scanner;
class discount{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter fee:");
		int fee=sc.nextInt();
		System.out.println("enter discount percent:");
		int d=sc.nextInt();
		int discount=fee*d/100;
		int pay =fee-discount;
		System.out.println("fees:"+discount);
		System.out.println("pay:"+pay);
	}
}
		
		
		
		
		
		
		
		
		
		