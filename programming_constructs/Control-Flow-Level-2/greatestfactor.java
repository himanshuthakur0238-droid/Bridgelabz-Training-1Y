import java.util.Scanner;
class greatestfactor{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		int gif=1;
		for(int i=num-1;i>=1;i--){
			if(num%i==0){
				gif=i;
			break;
		}
		}
			System.out.println("greatest factor is:"+gif);

}
}

