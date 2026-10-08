public class Test15 {
    String str = "example";
    //str.lengthは文字の長さを返す。なので今回は7になる。
    // ただし、charAtの引数は0から始まるインデックスで指定するため、str.length()は範囲外となり例外が発生する。
    System.out.println(str.charAt(str.length()));
}
