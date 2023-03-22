class Reverse{
    public static void main(String[] args) {
        Reverse r = new Reverse();
        int arr[] ={1,2,3,4};
        r.ReverseArray(arr);
    }
    int m =0;
    public void  ReverseArray(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
         arr[i] = arr[i];
         System.out.println(arr[i]+" ");
        }
    }
}