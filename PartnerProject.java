import java.util.Scanner;
public class PartnerProject{
    public static void main (String[]args){

    }
    public static void rid(){
		Scanner input= new Scanner(System.in);
		int size=input.nextInt();
		System.out.println("How many nums do u want in the array?");
		int[] arr= new int[size];

		for(int i=0; i<size; i++){
			arr[i]= (int)(Math.random()*10)+1;
		}

	}
	public int trish(int[][] array){
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length-1; j++){
				if(array[i][j] % 2 == 0){
					return array[i][j];
				}
				else{
					return 0;
				}
			}
		}
		return 0;
	}
}