public class Test12 {
    public static void main(String[] args) {
        String str = "abcde";
        // "abcdef"はstrに含まれていないので-1が返る
        System.out.println(str.indexOf("abcdef"));
        // "abc"はstrの先頭にあるので0が返る
        System.out.println(str.indexOf("abc"));
        // "de"はstrの3番目にあるので3が返る
        System.out.println(str.indexOf("de"));
        // "x"はstrに含まれていないので-1が返る
        System.out.println(str.indexOf("x")); 
    }
}
