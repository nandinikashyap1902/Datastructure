//count number of digits
public class digit {
    public static void main(String[] args) {
        
        int x = 12345;
       int count=0;
       int n = x;
       while(x!=0){
        x = x/10;
        count++;
       }
       System.out.println(count);
    }
}
