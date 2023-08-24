import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static int addDigits(int num) {
        if(num==0){
            return 0;
        }
        while(num>9){
            num=(num/10)+(num%10);
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int m= sc.nextInt();
            arr[i]=addDigits(m);
        }
//        int m = addDigits(n);
        System.out.println(Arrays.toString(arr));

    }
}
