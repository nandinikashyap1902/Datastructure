public class Peak {
    public static void main(String[] args) {
        Peak p = new Peak();
        int arr[] = {6,7,8,10,7};
        int n = arr.length;
        p.peakElement(arr,n);
    }
    public int peakElement(int[] arr,int n){
        
        int left=0, right = n-1;

       while(left<=right){

           int mid=right+(left-right)>>1;

           if(mid > 0 && mid < n-1){

               if(arr[mid]>arr[mid-1] && arr[mid]> arr[mid+1]) return mid;

               else if(arr[mid-1]>arr[mid]) right=mid-1;

               else left=mid+1;

           }

           else if(mid==0){

               if(arr[0]>arr[1]) return mid;

           }

            else if (mid==n-1){

               if(arr[n-1]> arr[n-2]) return mid;

               else return 0;
           }
       }
       return -1;
    }
}
