public class Test10 {
    public static void main(String[] args) {
    String str = "hoge, world.";
        hello(str);
        System.out.println(str);
    }

    // -- staticについて--
    // インスタンス化を行わずにクラスから直接呼び出せるメンバー（フィールド/メソッド）を定義します。
    // メモリ上に1つだけ生成され、すべてのインスタンス間でデータや処理が共有されます。
    // 状態を持たない共通処理（ユーティリティ）や、全体で固定の定数を定義する際に使用します。

    // -- private について--
    // クラス内からのみアクセス可能なメンバー（フィールド/メソッド）を定義します。
    // カプセル化（外部から勝手に変更されるのを防ぐ）を実現するために使用します。
    private static void hello(String msg) {
        msg.replaceAll("hoge", "hello");
    }
}
