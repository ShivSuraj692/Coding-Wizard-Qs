public class Q5 {
	
	public static int inversion(int arr[]) {
		
        int count = 0;		
		
		for(int i = 0; i < arr.length-1 ; i++ ) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					System.out.println("Inversion arrays: "+arr[i]+" "+arr[j]);
					count++;
					}
			}
		}
		
		if(count == 0) {
			
			System.out.println(0);
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {3,1,2};
		int arr2[] = {1,2};
		System.out.println("Inversion count: "+inversion(arr));
		System.out.println("Inversion count: "+inversion(arr2));
	}

}
