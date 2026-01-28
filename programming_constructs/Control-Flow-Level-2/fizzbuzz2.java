import java.util.Scanner;
class fizzbuzz2{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any integer");
		int a = sc.nextInt();
		int i= 0;
		while (i <= a){
			i++; 
			if (i%3 ==0 && i%5 == 0 ){
				System.out.println("FizzBuzz");
			}	
			else if (i%3 ==0 ){
				System.out.println("Fizz");
			}
			else if (i%5 == 0 ){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
			
		}
	}
}