public class Test13 {
    public static void main(String[] args) {
        String str = "abcde";
        // 2番目から4番目の文字を取り出す（2は含まれるが4は含まれない）
        // よって、結果は"cd"となる。
        System.out.println(str.substring(2,4));
        // 1番目から3番目の文字を取り出す（1は含まれるが3は含まれない）
        // よって、結果は"bc"となる。
        System.out.println(str.substring(1,3));
        // 0番目から25番目の文字を取り出そうとする（0は含まれるが25は含まれない）
        // 文字列の長さを超えているため、例外が発生する
        System.out.println(str.substring(0,25)); 
    }
}
