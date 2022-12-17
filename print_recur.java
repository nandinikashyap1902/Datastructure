public class print_recur {
    public static void main(String[] args) {
        print_recur p = new print_recur();
        p.print(1,5);
    }
    public void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        i++;
        print(i,n);
    }
}
