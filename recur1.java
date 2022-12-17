public class recur1 {
    public static void main(String[] args) {
        recur1 r1 = new recur1();
        r1.print1toN(1,4);
    }

    public void print1toN(int n,int num){
        if(n==num){
            return;
        }
        System.out.println("hey i am printing");
        n++;
        print1toN(n, num);
    }
}
