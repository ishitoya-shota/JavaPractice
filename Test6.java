import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        // 変数の型を自動推論するvarの例
        var ch = 'A'; 
        // 配列の型を自動推論するが型が分からないためコンパイルエラー
        var bum = {1,2};
        // ラムダ式の型を自動推論する。
        // しかしラムダ式そのものは型を持っていないためコンパイルエラー
        var c = () -> {}; 
        // ArrayListの型を自動推論する。<>内には勝手にObject型が入る
        var d = new ArrayList<>();
    }
}
