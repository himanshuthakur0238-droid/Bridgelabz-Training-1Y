import java.util.Scanner;
class power2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int number=sc.nextInt();
		System.out.println("enter power:");
		int power=sc.nextInt();
		int result;
		int counter=0;
		while(counter==power){
			result=result*number;
			counter++;
		}
		System.out.println("result="+result);
	}
}