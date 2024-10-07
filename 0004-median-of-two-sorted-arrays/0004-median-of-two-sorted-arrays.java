class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x = nums1.length;
        int y = nums2.length;
        int z = x + y;
        int[] nums3 = new int[z];

        for (int i = 0; i < x; i++) {
            nums3[i] = nums1[i];
        }

        for (int i = 0; i < y; i++) {
            nums3[x + i] = nums2[i];
        }

        int a = nums3.length;
        Arrays.sort(nums3);
          if (a % 2 == 0) {
            // If the total number of elements is even, return the average of the middle two
            int mid1 = nums3[a / 2 - 1];
            int mid2 = nums3[a / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            // If the total number of elements is odd, return the middle element
           int mid3 = nums3[a / 2];
           
            return (double) mid3;
        }
    }
}
