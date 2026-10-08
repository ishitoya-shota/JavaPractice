public class Test11 {
    public static void main(String[] args) {
        String str = "abcde";
        // dが4番目の文字なので4を指定して取り出す。
        System.out.println(str.charAt(4));
        // 0から始まるので6番目の文字を取り上げようとすると例外が発生する
        // 例外の名前はStringIndexOutOfBoundsException
        System.out.println(str.charAt(5));
    }
}
