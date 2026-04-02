class Solution {
    private int fn(int[] arr , int m ){
        int load=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=m){
                load++;
                last=arr[i];
            }
        
        }
        return load;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1;
        int high=position[position.length-1 ]-position[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int to=fn(position,mid);
            if(to>=m){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            }
            return ans;
    }
}