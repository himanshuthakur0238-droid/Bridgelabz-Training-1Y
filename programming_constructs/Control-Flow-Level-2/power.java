import java.util.Scanner;
class power{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int number=sc.nextInt();
		System.out.println("enter power:");
		int power=sc.nextInt();
		int result=1;
		for(int i=1;i<=power;i++){
			result=result*number;
		}
		System.out.println(result);
	}
}
		
			