class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ll=new ArrayList<>();
         List<String> operations = new ArrayList<>();
        int num = 1, i = 0; 

        while (num <= n && i < target.length) {
            operations.add("Push"); 

            if (num == target[i]) {
                i++; 
            } else {
                operations.add("Pop"); 
            }

            num++;
        }

        return operations;
    }
    

}