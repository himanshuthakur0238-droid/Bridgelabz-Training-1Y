import java.util.Scanner;
class relationaloperator{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("enter value of a:");
		int age=sc.nextInt();
		if(age>=18){
			System.out.println("allowed:");
		}
		else{
			System.out.println("not allowed:");
		}
	}
}