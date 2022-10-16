
public class Search {
    //O(log n)
    public static boolean binarySearch(int element, int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            int guss = arr[mid];
            if (guss == element)
                return true;
            if (guss < element)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }

    //O(n)
    public static boolean linearSearch(int element, int[] arr) {
        for (int j : arr) {
            if (j == element)
                return true;
        }
        return false;
    }
}
