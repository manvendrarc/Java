public class linearsearch {
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int linearSearch(String dish[],String key){
        for(int i=0;i<dish.length;i++){
            if(dish[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int numbers[]={2,3,4,6,8,10,14,16};
//        int key=20;
//        int index=linearSearch(numbers,key);
        String dish[]={"Samosa","Pepsi","Pizza","Pasta"};
        String key="Pepsi";
        int index=linearSearch(dish,key);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("key is at "+ index);
        }
    }
}
