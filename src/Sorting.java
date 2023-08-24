public class Sorting {
    public static void BubbleSort(int[] arr) {
        for(int turn=0;turn<arr.length-1;turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){ // for decreasing order use - <
                    minPos=j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    public static void InsertionSort(int[] arr){
        for(int i=0;i< arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out correct pos to insert
            while(prev>=0&&arr[prev]>curr){ // use < for descending order
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void countingSort(int[] arr) {
        int largest= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]); // here we find largest in the array arr
        }
        int count[]=new int[largest+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++; // isme arr[i] as a index liya h to count frequency of arr[i] at count'th index mtlb ki jaise niche arr m 5 ek element h to 5 count array ka ek index hojayega
        }

        //sorting
        int j=0;
        for(int i=0; i< count.length;i++){
            while (count[i]>0){ // idhr jis index pr value hogi jo ki frequency hogi vo bar bar update hoti rhegi niche jb tk zero na hojaye
                arr[j]=i; // idhr index of count which was element save hota rhega original array arr mey
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr={5,4,1,3,2,2,3,4};
//        BubbleSort(arr);
//        selectionSort(arr);
//        InsertionSort(arr);
        countingSort(arr);
        printArr(arr);
    }

}
