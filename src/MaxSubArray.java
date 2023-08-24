// max sub array ka sum humne PrintSubbarrayAndSum m kiya hua h ... ye thoda better hai
public class MaxSubArray {
    public static void MaxSub(int[] arr) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int[] prefix=new int[arr.length];

        prefix[0]=arr[0];
        //for calculating prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++) { //i is start of array
            for (int j = i; j < arr.length; j++) { //j is end of array which will be updated
                currsum= i ==0?prefix[j]:prefix[j]-prefix[i-1]; // explanation in notes

                if(maxsum<currsum){
                    maxsum=currsum;
                }

            }
        }
        System.out.println("max sum is "+maxsum);
    }

    public static void kadanes(int arr[]) {
        int maxSum=Integer.MIN_VALUE;
        int temp=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum,currSum);
        }
        //this condition is applied as a special case for all negative array.
        if(maxSum==0){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>temp){
                    temp=arr[i];
                }
            }
            maxSum=temp;
        }
        System.out.println("max sum is "+maxSum);
    }

    public static void main(String[] args) {
        int[] num={-2,-3,-4,-1,-2,-1,-5,-3};
        MaxSub(num);
        kadanes(num);


    }
}
