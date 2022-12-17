import java.util.ArrayList;
public class Occurence {
   public static void main(String[] args) {
    Occurence o = new Occurence();
     long a[] = {2,3,4,5,6,7,5};
    int n = a.length;
    int x = 10;
    o.find(a,n,x);
   } 
   ArrayList<Long> find(long arr[], int n, int x){
ArrayList<Long> a = new ArrayList<Long>();
for(int i=0;i<n-1;i++){
    if(arr[i]==x){
        a.add(arr[i]);
        break;
    }
 for(int j=n-1;j>=0;j--){
    if(arr[i]==x){
        a.add(arr[i]);
        break;
    }
 }
 if(a.size()==0){
    Long y=(long) -1;
    a.add(y);
    a.add(y);
 }
}
return a;

   }

}
