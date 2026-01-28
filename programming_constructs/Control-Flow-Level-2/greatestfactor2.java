import java.util.Scanner;
class greatestfactor2{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int number=sc.nextInt();
int gif=1;
int counter=number-1;
while(counter==1){
if(number%counter==0){
gif=counter;
break;
}
}
System.out.println("greatest integer is:"+gif);
}
}
