public class LeapYear { //25-03-2023
    public static void main(String[] args) {
        int year = 1998;
        if((year%4==0) && (year%100!=0)||(year%400==0)){
            System.out.println(year + "is"+ "leap year");
        }
        else{
            System.out.println(year + "is"+"not leap year");
        }
    }
}
