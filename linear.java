public class linear {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int size = arr.length;
        int key=4;
        int i;
        for( i=0;i<arr.length-1;i++){
            if(arr[i]==i){
                System.out.println("present");
                break;
            }
        }
        if(i==size)
    System.out.println("not present");
    }
}