import java.util.Scanner;
class total2{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		int sum=0;
		while(true){
				System.out.println("enter number");
				int a=sc.nextInt();
				if(a<=0){
				break;
			}
			sum=sum+a;
		}
		System.out.println("sum:"+sum);
}
}