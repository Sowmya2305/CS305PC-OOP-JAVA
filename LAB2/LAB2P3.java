import java.util.Scanner;
class Array{
	public static void main(String []a) {
		int Arr[][]=new int[2][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements into the array");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				Arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Array elements are:");	
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
