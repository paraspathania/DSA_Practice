package Arrays;

// You are provided with an integer matrix; you need to perform the following operation and return the final matrix.
//Whenever you find a zero in an original matrix, convert its entire row and column into a zero.


 class Matrix {
   
    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,0,78,0,56,23,0,85,0};
	
	System.out.print("Elements before move all the zeros: ");
	for (int num1 : arr){
	System.out.print(num1 + " ");
	}

	System.out.println();
	System.out.println();

        moveZerosToEnd(arr);

        System.out.print("Result: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
