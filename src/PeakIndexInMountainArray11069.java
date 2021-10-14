public class PeakIndexInMountainArray11069 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length;
        while (left < right - 1) {
            int middle = (left + right) / 2;
            if (arr[middle] > arr[middle - 1]) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return left;
    }
}
