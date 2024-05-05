class Solution {
    public int removeElement(int[] nums, int val) {
    int nums1 =0;
     for(int i=0;i<nums.length;i++){
         if(nums[i]!=val){
        nums[nums1++]=nums[i];
         }
     }
         return nums1;
    }
}