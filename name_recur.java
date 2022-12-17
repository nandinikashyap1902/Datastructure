public class name_recur {
    public static void main(String[] args) {
        int i=0;
        name_recur na = new name_recur();
       na.name(1,3);
    }
  public void name(int i1,int n){
    if(i1>n){
        return;
    }
    System.out.println("nnan"); 
    i1++;
    name(i1,n);
  }
}
