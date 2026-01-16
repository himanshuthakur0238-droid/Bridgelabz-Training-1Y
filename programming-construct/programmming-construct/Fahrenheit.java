import java.util.Scanner;
class Fahrenheit{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value in celcius:");
		int celcius=sc.nextInt();
		int Fahrenheit=(celcius*9/5)+32;
		System.out.println("temperature in Fahrenheit:"+Fahrenheit);
	}
}
		
		