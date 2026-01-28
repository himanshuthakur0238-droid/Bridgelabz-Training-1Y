import java.util.Scanner;
class BMI{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter weight(kg):");
		double a=sc.nextInt();
		System.out.println("enter height(cm):");
	    double heightcm=sc.nextInt();
		
		double BMI,heightm;
		heightm=heightcm/100;
		BMI=a/(heightm*heightm);
		System.out.println("bmi is:"+BMI);
		if(BMI<=18.4){
			System.out.println("underweight");
		}
		else if(BMI<=24.9 && BMI>=18.5){
			System.out.println("normal");
		}
		else if(BMI<=39.9 && BMI>=25.0){
			System.out.println("overweight");
		}
		else {
			System.out.println("obese");
		}
	}
}
		