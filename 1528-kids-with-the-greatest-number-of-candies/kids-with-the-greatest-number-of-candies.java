class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }
        for(int i = 0;i<candies.length;i++){
            int sum=candies[i] + extraCandies;
            if(sum>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}