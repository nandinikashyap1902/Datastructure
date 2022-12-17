public class selection {
    public static void main(String[] args) {
        int[]arr ={78,90,23,45,3,6};
        int size = arr.length;
        for(int i =0;i<size-1;i++){
            int min=i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
