import java.util.Scanner;
class youngest{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amar age:");
		int amarage=sc.nextInt();
		System.out.println("enter amar height:");
		int amarheight=sc.nextInt();
		System.out.println("enter akbar age:");
		int akbarage=sc.nextInt();
		System.out.println("enter akbar height:");
		int akbarheight=sc.nextInt();
		System.out.println("enter enthony age:");
		int enthonyage=sc.nextInt();
		System.out.println("enter enthony height:");
		int enthonyheight=sc.nextInt();
		int youngestage=amarage;
		if(akbarage<youngestage){
			youngestage=akbarage;
		}
		if(enthonyage<youngestage){
			youngestage=enthonyage;
		}
		int tallestheight=amarheight;
		if(akbarheight>tallestheight){
			tallestheight=akbarheight;
		}
		if(enthonyheight>tallestheight){
			tallestheight=enthonyheight;
		}
		System.out.println("younger age is:"+youngestage);
		System.out.println("taller height is:"+tallestheight);
	}
}
		
			
		
	
		