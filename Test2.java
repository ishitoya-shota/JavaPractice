public class Test2 {
    public static void main(String[] args) {
        // Javaでは10進数以外にも、2進数、8進数、16進数のリテラルで表現できる。
        // 2進数は0b、8進数は0、16進数は0xで始める
        int number = 42;
        int b = 0413;
        int c = 0x10B;
        int d = 0b101010;
        // コンパイルエラーが起きているのは、8進数なのに二桁目が9になっているから。
        int e = 0927;
        System.out.println(number);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
