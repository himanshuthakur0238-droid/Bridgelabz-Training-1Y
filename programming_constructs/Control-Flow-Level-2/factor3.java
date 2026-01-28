import java.util.Scanner;
class factor3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int a=sc.nextInt();
		int i=1;
		int count=0;
		if(a>0)
			while(i<=a){
				if(a%i==0){
					count++;
				}
				i++	;	
			}
			System.out.println(count);
	}
}