package sort;

public class Main {
	
	public static void sort(int[] arr){

	    for (int i = 0; i < arr.length; i++) {

	        int min = arr[i];
	        int min_i = i; 

	        for (int j = i+1; j < arr.length; j++) {

	            if (arr[j] < min) {
	                min = arr[j];
	                min_i = j;
	            }
	        }

	        if (i != min_i) {
	            int tmp = arr[i];
	            arr[i] = arr[min_i];
	            arr[min_i] = tmp;
	        }
	     }
	}

	public static void main(String[] args) {
		int[] mass = {5,6,3,2,5,1,4,9};
		
		Main.sort(mass);
		for(Integer i : mass) {
			System.out.print(i + " ");
		}
	}
	
}
