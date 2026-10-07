public class Test4 {
    public static void main(String[] args) {
        // Javaでは変数名に使用できる文字には制限がある。
        // 数字で始めることはできず、アンダースコアとドル記号は使用可能である。
        int 1a = 123;
        int a2 = 123;
        int _b = 0b1010;
        int b_ = 0b1010;
        int $c = 0_123;
        int ${α} = 123;
        int α.g = 123;
    }
}
