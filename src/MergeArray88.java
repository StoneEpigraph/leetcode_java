public class MergeArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length; i > 0; i--) {
            if (m < 1) {
                nums1[i - 1] = nums2[n - 1];
                n--;
            } else if (n < 1) {
                nums1[i - 1] = nums1[m - 1];
                m--;
            } else if (nums1[m - 1] > nums2[n - 1]) {
                nums1[i - 1] = nums1[m - 1];
                m--;
            } else {
                nums1[i - 1] = nums2[n - 1];
                n--;
            }
        }
    }
}
