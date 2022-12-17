public class Sum_recur {
    public static void main(String[] args) {
        
    }

    public void sum_recur(int nums){
      if(nums<0){
        return;
      }
      sum_recur(nums)+sum_recur(nums-1);
      System.out.println(nums);
    }
}
