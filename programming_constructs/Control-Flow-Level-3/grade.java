import java.util.Scanner;
class grade{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter math marks");
		int a=sc.nextInt();
		System.out.println("enter chemistry marks");
		int b=sc.nextInt();
		System.out.println("enter physics marks");
		int c=sc.nextInt();
		int avg=(a+b+c)/3;
		int percent=avg*100/100;
		if(percent>=80){
			System.out.println("grade A");
		}
		else if(percent>=70 && percent<=79){
			System.out.println("grade B");
		}
		else if(percent>=60 && percent<=69){
			System.out.println("grade C");
		}
		else if(percent>=50 && percent<=59){
			System.out.println("grade D");
		}
		else if(percent>=40 && percent<=49){
			System.out.println("grade E");
		}
		else {
			System.out.println("grade R");
		}
	}
}
		