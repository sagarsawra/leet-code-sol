class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
               if(map.get(n) <= 2 ){
                nums[max++]=n;
            }
        }
        
        return max;
    }
}