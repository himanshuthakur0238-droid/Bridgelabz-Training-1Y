import java.util.Scanner;
class armstrong{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		int q=num;
		int result=0;
		while(num!=0){
			rem=num%10;
			result=result+(rem*rem*rem);
			num=num/10;
		}
		if(result==q){
			System.out.println("armstrong:");
		}
		else{
			System.out.println("not:");
		}
	}
}