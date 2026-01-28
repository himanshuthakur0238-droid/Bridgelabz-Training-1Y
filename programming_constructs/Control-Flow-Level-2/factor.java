import java.util.Scanner;
class factor{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int a=sc.nextInt();
		if(a>0)
			for(int i=1;i<a;i++){
				if(a%i==0){
					System.out.println(i);
				}
			}
	}
}
			