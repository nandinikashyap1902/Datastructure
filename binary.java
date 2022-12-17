public class binary{
    public void binary_search(int arr[],int start,int end,int mid,int key){
        while(start<=end){
         if(arr[mid]==key){
            System.out.println("element present at index ,i");
         }
         else if(arr[mid]<key){
           start=mid+1;
         }

         else{
            end=mid-1;
         }
         mid=(start+mid)/2;
        } 
    if(start>end){
        System.out.println("element not found");  
    }
    public void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int [] arr = {2,3,4,5,6,7};
        int start=0;
        int end=arr.length-1;
        int mid = (start+end)/2;
        int key=5;
        binary bi = new binary();
        bi.binary_search(arr,start,end,mid,key);
        bi.print(arr);
}
}
}