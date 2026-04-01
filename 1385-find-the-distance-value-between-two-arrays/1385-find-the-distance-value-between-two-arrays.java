class Solution {
    private boolean fn(int[] arr,int target , int d){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(Math.abs(arr[mid]-target)<=d){
                return false;
            }
            else if(arr[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return true;

    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        Arrays.sort(arr2);
        for(int num:arr1){
            if(fn(arr2,num,d)){
                count++;
            }
        }
        return count;
    }
}