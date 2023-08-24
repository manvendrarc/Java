public class PrintSubarrayAndSum {
    public static void SubArray(int arr[]) {
        int ts=0;
        int largest=Integer.MIN_VALUE; //-infinity
        int smallest=Integer.MAX_VALUE;//+infinity
        for(int i=0;i<arr.length;i++){ //i is start of array
            for(int j=i;j<arr.length;j++){ //j is end of array which will be updated
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                    int temp=sum;
                    if(largest<temp){
                        largest=temp;
                    }
                    if(smallest>temp){
                        smallest=temp;
                    }
                }
                ts++;
//                System.out.print("_____The sum of subarray is : "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of Sub-Arrays: "+ts);
        System.out.println("Max sum among Sub-Arrays is : "+largest);
        System.out.println("Min sum among Sub-Arrays is : "+smallest);
    }
    public static void main(String[] args) {
        int []n={2,4,6,8,10};
        SubArray(n);

    }
}
