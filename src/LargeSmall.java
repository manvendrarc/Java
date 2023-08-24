public class LargeSmall {
    public static int LargestSmallest(int numbers[]){
        int largest=Integer.MIN_VALUE; //-infinity
        int smallest=Integer.MAX_VALUE;//+infinity

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest value is : "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={2,5,8,19,45,3,7};
        System.out.println("highest is: "+LargestSmallest(numbers));
    }
}
