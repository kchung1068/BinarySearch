public class BinarySearch {
    public static void main(String[] args) {

    }

    public static int sequential(int[] hi, int a) {
        for (int x = 0; x < hi.length; x += 1) {
            if (hi[x] == a) {
                return x;//Find position in array of a by starting at the beginning.
            }
        }
        return -1;
    }
     public static int binary(int[] a, int k) {
        int low = 0, high = a.length - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (a[mid] > k) {
                high = mid - 1;
            } else if (a[mid] < k) {
                low = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;

        //Find position in array of a by starting at the MIDDLE
     } //Binary Searches have to work with arrays in NUMERICAL ORDER


}
