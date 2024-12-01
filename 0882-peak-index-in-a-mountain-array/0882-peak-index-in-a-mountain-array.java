class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2; // Prevents integer overflow
            
            if (arr[mid] > arr[mid + 1]) {
                // If current element is greater than the next, the peak is on the left side or at mid
                right = mid;
            } else {
                // If current element is smaller than the next, the peak is on the right side
                left = mid + 1;
            }
        }

        // left and right converge to the peak index
        return left;
    }
}
