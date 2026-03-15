import java.util.Scanner;
class vote{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int[]age=new int[10];
		for(int i=0;i<age.length;i++){
		    System.out.println("enter age");
		    age[i]=sc.nextInt();
		}
			System.out.println("voting eligibility result");
			for(int i=0;i<age.length;i++){
				if(age[i]<0){
					System.out.println("invalid age");
				}
				else if(age[i]>=18){
					System.out.println("the student with the age"+age[i]+"can vote");
				}
				else{
					System.out.println("the student with the age"+age[i]+"cannot vote");
				}
			}
		}

}
		
			
			
			