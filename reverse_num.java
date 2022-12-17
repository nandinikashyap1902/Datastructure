public class reverse_num {
    public static void main(String[] args) {
        String str="";
        int n = 12345;
        String s = Integer.toString(n);
        int l = s.length();
        for(int i=l-1;i>=0;i--){
            str+=s.charAt(i);
        }
        System.out.println(str);
    }
    
    }
