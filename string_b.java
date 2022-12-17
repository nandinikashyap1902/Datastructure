import java.lang.StringBuilder;
public class string_b {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder("nandini");
        build.append("is");
        build.append("a");
        build.append("female");
        build.insert(3,"roo");
        System.out.println(build);
        //build.reverse();
        build.delete(4,7);
        System.out.println(build);
    }
}
