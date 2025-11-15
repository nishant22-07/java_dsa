// max length of sub array whos sum is less than k
public class MaxlengthOfSubArr {

    public static void main(String[] args) {
        int[] arr ={2,5,10,1,1,7,10,1,1,1,11,1,11,1,1,1,1,1,1,1,1};
        longestSubarr(arr,14);
        longestSubarrbetter(arr,14);
        longestSubarrOptimal(arr,14);

    }

    private static void longestSubarrOptimal(int[] arr, int k) {
        int l = 0;
        int sum = 0;
        int maxLength = 0;

        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];

            // shrink until the window is valid
            while (sum > k) {
                sum -= arr[l];
                l++;
            }

            // now the sum is <= k, safe to update
            maxLength = Math.max(maxLength, r - l + 1);
        }

        System.out.println(maxLength);
    }

    //better solution
    private static void longestSubarrbetter(int[] arr, int k) {
        int l = 0;
        int r = 0;
        int maxLength = 0;
        int sum = 0;
        while(r< arr.length){
            sum = sum +arr[r];
            while(sum>k){
                sum = sum - arr[l];
                l++;
            }
            if(sum<=k){
                maxLength =Math.max(maxLength,r-l+1);
                r++;
            }

        }
        System.out.println(maxLength);

    }

    //brute force -> generate all subarrays
    private static void longestSubarr(int[] arr,int k) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length ; j++) {
                sum = sum+arr[j];
                if(sum<=k){
                    maxLength = Math.max(maxLength,j-i+1);
                } else if (sum>k) {
                    break;

                }

            }

        }
        System.out.println(maxLength);
    }





}
