public class Test5 {
    public static void main(String[] args) {
        // 文字と数字は互換性を持つけれどキャスト式を記述しなければならない
        char ch = 'A';
        int num = (int) ch; 
        
        // 型がStringの場合はシングルクォートではなくダブルクォートで囲む必要がある
        // charの場合はシングルクォートで囲む必要がある
        char ch3 = "B"; 
        System.out.println(num);
        System.out.println(ch3);
        System.out.println(str);
    }
}
