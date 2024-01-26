public class Main {
    // Написать метод, возвращающий количество чётных элементов массива.
    // countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

    private static int countEvens(int[] arr) {
        int counter = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    // Написать функцию, возвращающую разницу между самым большим и
    // самым маленьким элементами переданного не пустого массива.

    private static int subMinAndMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]) { min = arr[i]; continue; }
            if(max < arr[i]) { max = arr[i]; }
        }
        return max - min;
    }

    // Написать функцию, возвращающую истину,
    // в переданном массиве есть два соседних элемента, с нулевым значением.

    private static boolean twoZeroAround(int[] arr){
        boolean flag = false;
        for (int i = 1; i < arr.length - 1; i++) {

            if(arr[i - 1] == 0 && arr[i + 1] == 0){
                return flag = true;
            }

            if(arr[i] != 0){
                i++;
            }
        }
        return flag;
    }

    public static void main(String[] args){
        // Task 1
        {
            System.out.println("Task 1: ");
            int[] arr = {1,2,3,4,5};
            System.out.println(countEvens(arr));
        }
        // Task 2
        {
            System.out.println("Task 2: ");
            int[] arr = {1,2,3,4,10};
            System.out.println(subMinAndMax(arr));
        }

        // Task 3
        {
            System.out.println("Task 3: ");
            int[] arr = {0,1,0,3,3,3};
            System.out.println("First example: " + twoZeroAround(arr));

            int[] arr2 = {1,1,0,1,0};
            System.out.println("Second example: " + twoZeroAround(arr2));

            int[] arr3 = {1,1,1,1,0};
            System.out.println("Third example: " + twoZeroAround(arr3));
        }
    }
}
