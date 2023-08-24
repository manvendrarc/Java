public class test1 {
    public static int differenceOfSum(int[] nums) {
        int x = 0;
        for(int i=0; i<nums.length; i++){
            x+=nums[i];
        }
        int y = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<=9){
                y+=nums[i];
            }
            else if(nums[i]%9==0){
                y+=9;
            }
            else{
                int rem = nums[i]%9;
                y+=rem;
            }
        }

        return y;
    }
    public static void main(String[] args) {
        int[] arr= {2,7,16,19,12,2,15,1,8,6,20,1,12,3,1,17,11,17,3,3};
        System.out.println(differenceOfSum(arr));

    }
}
