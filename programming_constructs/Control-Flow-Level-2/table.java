import java.util.Scanner;
class table{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value which table to print:");
		int a=sc.nextInt();
		int temp;
		int result;
		for(int i=1;i<=10;i++){
			System.out.println(a + " * " + i + " = " + (a * i));
		}
	}
}
		
		