import java.util.Scanner;
class OneToTwoArray{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Row: ");
		int row = input.nextInt();
		System.out.print("Enter Column: ");
		int column = input.nextInt();
		int[][] array2d = new int[row][column];
		int[] array1d = new int[row*column];
		int k=0;
		System.out.print("Enter Array:-\n");
		for(int i=0;i<array2d.length;i++){
			for(int j=0;j<array2d.length;j++){
				array2d[i][j]=input.nextInt();
				array1d[k++]=array2d[i][j];
			}
		}
		for( k=0;k	<array1d.length;k++){
			System.out.print(array1d[k] + " ");
		}
		
	}
}