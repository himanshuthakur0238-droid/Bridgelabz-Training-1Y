import java.util.Scanner;
class count{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:");
		int i = sc.nextInt();
		while(true){
			System.out.println(i);
			i--;
			if(i==0){
				break;
			}
		}
	}
}