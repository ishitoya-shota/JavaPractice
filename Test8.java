import java.util.ArrayList;

public class Test8 {

class A {
    public void test() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    public void test() {
        System.out.println("B");
    }
}

class C extends A {
    @Override
    public void test() {
        System.out.println("C");
    }
}

public class Main {
    public static void main(String[] args) {
        var a = new B();
        var b = new C();
        var c = new A();
        A d = new B();
        // 子クラス→子クラス（兄弟クラス）の代入は不可
        a = new C(); 
        // 子クラス→親クラスへの代入は可能
        b = new A();
        // 親クラス→子クラスへの代入は可能
        c = new B(); 
        
    }
}
}
