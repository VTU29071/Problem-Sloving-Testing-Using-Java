public class BinarySearchIterative {
   
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
           
            int mid = low + (high - low) / 2;

           
            if (arr[mid] == target) {
                return mid;
            }

            
            if (arr[mid] < target) {
                low = mid + 1;
            } 
            
            else {
                high = mid - 1;
            }
        }

        
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        
        int result = binarySearch(sortedArray, target);
        
        if (result == -1) {
            System.out.println("Element not present in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}