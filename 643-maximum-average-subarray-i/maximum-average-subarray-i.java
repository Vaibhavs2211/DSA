class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0;
        int high = k-1;
        int avg  =0;
     
        int n = nums.length;
        for(int i = 0;i<=high;i++){
               avg = avg+ nums[i];
        }
           double res = avg;
        while(high<n){
            res = Math.max(res,avg);
            low++;
            high++;

             if(high == n) break;
            avg = avg -nums[low-1];
            avg = avg + nums[high];
        }
        return res/k;
    }
}