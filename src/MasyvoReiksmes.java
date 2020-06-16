import java.util.Arrays;

        public class MasyvoReiksmes {

    public static void main(String args[]) {
    largestAndSmallest(new int[]{-20, 34, 21, -87, 92,
            Integer.MAX_VALUE});
    largestAndSmallest(new int[]{10, Integer.MIN_VALUE, -2});
    largestAndSmallest(new int[]{Integer.MAX_VALUE, 40,
            Integer.MAX_VALUE});
    largestAndSmallest(new int[]{1, -1, 0});
}
public static void largestAndSmallest(int[] numbers) {
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for (int number : numbers) {
        if (number > largest) {
            largest = number;
        } else if (number < smallest) {
            smallest = number;
        }
    }
    System.out.println("Given integer array : " + Arrays.toString(numbers));
    System.out.println("Largest number in array is : " + largest);
    System.out.println("Smallest number in array is : " + smallest);
    }
}


       /*     public static void (String[]args){

            }

            int[] arr1 = new int[5];
            int[] arr2 = {10, 20, 30, 40};

        System.out.println("arr1 Before Swapping " + Arrays.toString(arr1));
                System.out.println("arr2 Before Swapping " + Arrays.toString(arr2));

                int temp[];
                arr1[3] = 5;
                arr1[0] = 2;
                arr1[1] = 3;
                arr1[2] = 6;
                arr1[4] = 10;

                temp = arr1;
                arr1 = arr2;
                arr2 = temp;
                System.out.println("arr1 after Swapping " + Arrays.toString(arr1));
                System.out.println("arr2 after Swapping " + Arrays.toString(arr2));
                }

           }

        */