import java.util.Scanner;
class harshad{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		int sum=0;
		int r;
		while(num>0){
			r=num%10;
		    sum=sum+r;
			num=num/10;
		}
		if(num%sum==0){
				System.out.println("harshad number");
			}
			else{
				System.out.println("not");
			}
	}
}
				
			
		