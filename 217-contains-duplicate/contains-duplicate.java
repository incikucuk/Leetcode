class Solution {
    public boolean containsDuplicate(int[] nums) {
        
            int n = nums.length; // Step 1: Initialize variable to store length of nums
            Set<Integer> set = new HashSet<>(); // Step 2: Create HashSet to store unique elements
            for(int num : nums){
                set.add(num); // Step 3: Add elements of nums to the HashSet
            }
            int m = set.size(); // Step 4: Get the size of the HashSet
            if(n==m){    //Step 5: Compare lengths and return result
                return false; //Return false if there were  no duplicates, true otherwise
            }
            return true;   
    }
}

/*class Solution {
    public boolean containsDuplicate(int[] nums) {
         Arrays.sort(nums); 
        for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i+1]) {
                    return true;
                }
        }
        return false;
    }
}
*/