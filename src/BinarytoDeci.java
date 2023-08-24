public class BinarytoDeci {
    public static void bintodec(int binNum){
        int temp=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int lastDigit=binNum%10; // we'll get remainder
            decNum=decNum+ (lastDigit*(int)(Math.pow(2,pow)));
            pow++;
            binNum=binNum/10; // we'll get qoutient
        }
        System.out.println("Decimal of "+temp+" is "+decNum);
    }
    public static void main(String[] args) {
        bintodec(10011);
    }
}
