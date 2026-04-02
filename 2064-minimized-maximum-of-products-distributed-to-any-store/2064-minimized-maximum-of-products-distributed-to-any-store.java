class Solution {
    private int fn(int n, int[] arr){
        int store=0;
        for(int num:arr){
            store+=(num+n-1)/n;
        }
        return store;

    } 
    public int minimizedMaximum(int n, int[] quantities) {
        int low=1;
        int high=Arrays.stream(quantities).max().getAsInt();
        int ans=0;
        while(low<=high){

            int mid=low+(high-low)/2;
            int to=fn(mid,quantities);
            if(to>n){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}