public class Question {
    public static void main(String[] args) {
    	
        int a = 4, b = 7;
        int result = 1;
        
        
        int i = b;
        for (;i != 0; --i)
        {
            result *= a;
        }
        
     
        System.out.println("number" +"^"+b+" = "+result);
    }
}
