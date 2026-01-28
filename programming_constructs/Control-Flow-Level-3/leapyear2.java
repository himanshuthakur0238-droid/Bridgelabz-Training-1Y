import java.util.Scanner;
class leapyear2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year:");
		int year=sc.nextInt();
		if(year<1582){
			System.out.println("year is greater than 1582 then leap year");
		}
		else{
			if(year%4==0){
				System.out.println("year is leap year");
			}
			else if(year%100!=0){
				System.out.println("year is leap year");
			}
			else if(year%400==0){
				System.out.println("year is leap year");
			}
			else{
				System.out.println("year is not leap year");
			}
		}
	}
}
				
					
				
				