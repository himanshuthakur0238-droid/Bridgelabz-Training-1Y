import java.util.Scanner;
class checkevenodd{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int a=sc.nextInt();
		int i;
		int count=0;
		int temp=0;
		for(i=1;i<=a;i++){
			if(i%2==0){
				count++;
			}
			else{
				temp++;
			}
		}
				System.out.println("even number is:"+count);
				System.out.println("odd number is:"+temp);
	}
	}
			