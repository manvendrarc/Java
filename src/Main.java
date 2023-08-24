// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    // normal version
//    public static boolean isPrime(int n){
//        if (n==2){
//            return true;
//        }
//        for(int i=2;i<n-1;i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }

    // optimised version of the above function
    public static boolean isPrime(int n){
        if (n==2) {return true;}
        for(int i=2;i<=Math.sqrt(n);i++){ // in this for example n=6, the loop will run till 2 which is nearly half of it
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
}