class Solution {
    private int pos(int[] nums,int m,int k,int val){
        int f=0;
        int b=0;
        for(int num:nums){
            if(num<=val){
                f++;
                if(f==k){
                    b++;
                    f=0;
                }
                
            }
            else{
                f=0;
            }
        }
        return b;
     
    }
    public int minDays(int[] bloomday, int m, int k) {
        long n=(long)m*k;
        if(n>bloomday.length)return -1;

        int low=0;
        int high=Arrays.stream(bloomday).max().getAsInt();
        while(low<=high){
            int mid=low+(high-low)/2;
            int to=pos(bloomday,m,k,mid);
            if(to<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return low;
    }
}