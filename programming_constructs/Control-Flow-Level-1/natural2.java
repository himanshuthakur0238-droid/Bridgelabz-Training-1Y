import java.util.Scanner;
class natural2{
public static void main(String[]args){
	Scanner sc =new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	int n=a;
	int sum=n*(n+1)/2;
	int total=0;
	while(n>0){
	total=total+n;
	n--;
	}
	System.out.println("sum is " +sum);
	System.out.println("total is "+total);
	if (sum==total){
		System.out.println("it is correct");
	}
	else{
		System.out.println("not");
	}
}
}
	