// このクラスはvar型が悪さをしてコンパイルエラーになる。
// このコンパイルエラーを解決するためには、var型を使用せずに具体的な型（例えばString型）を使用する必要がある。
public class Test7 {
    public static void main(String[] args) {
        Sample s = new Sample("sample");
        // Sampleクラスのコンストラクタとは違い、testメソッドはオブジェクト生成後に呼び出される。
        s.test();
    }
}

class Sample {
    // フィールドのvalueは、コンストラクタで初期化される。
    private var value; 
    // コンストラクタとは、オブジェクトが生成されたら最初に呼び出される特別なメソッドである。
    // コンストラクタは名前をクラスメイト同であり、戻り値は持たない。（voidも書かない）
    public Sample(var value) {
        this.value = value;
    }
    public void test() {
        // ここのvalueはフィールドの値を参照している。（private var valueのところ）
        // そのため、Sampleメソッドのvalue引数とは別物である。
        System.out.println(value);
    }
}