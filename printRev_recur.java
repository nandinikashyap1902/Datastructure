public class printRev_recur {
    public static void main(String[] args) {
        printRev_recur pr = new printRev_recur();
        pr.print(5,1);
    }
    public void print(int i,int n){
        if(i<n){
            return;
        }
        System.out.println(i);
        i--;
        print(i, n);
    }
}
