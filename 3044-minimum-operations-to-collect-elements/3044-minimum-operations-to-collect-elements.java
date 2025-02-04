class Solution {
    public int minOperations(List<Integer> nums, int k) {
             Set<Integer> collected = new HashSet<>();
        int operations = 0;
        
        // Start removing elements from the end
        for (int i = nums.size() - 1; i >= 0; i--) {
            operations++;
            int num = nums.get(i);
            
            // Collect the number if it's between 1 and k
            if (num <= k) {
                collected.add(num);
            }
            
            // Stop if we have collected all numbers from 1 to k
            if (collected.size() == k) {
                return operations;
            }
        }
        
        return operations; // This will always be reached since k is within nums
    }
    
}