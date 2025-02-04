class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ll=new ArrayList<>();
         List<String> operations = new ArrayList<>();
        int num = 1, i = 0; // Start i from 0 to correctly index the target array

        while (num <= n && i < target.length) {
            operations.add("Push"); // Always push

            if (num == target[i]) {
                i++; // Move to the next element in target when there's a match
            } else {
                operations.add("Pop"); // If num is not in target, pop it
            }

            num++; // Move to the next number
        }

        return operations;
    }
    

}