public class recur {
    public static void main(String[] args) {
        recur r = new recur();
       r. print_name(1,4);
    }

    public void print_name(int i,int n){
        if(i==n){
            return;
        }
        System.out.println("hii,i am back ");
        i++;
        print_name(i,n);
    }
}
