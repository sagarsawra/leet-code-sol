class Solution {
    private long fn(int[] nums, int vals){
        long store=0;
        for(int num:nums){
            store+=(num-1)/vals;
        }
        return store;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        while(low<=high){
            int mid=low+(high-low)/2;
            long to=fn(nums,mid);
            if(to>maxOperations){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}