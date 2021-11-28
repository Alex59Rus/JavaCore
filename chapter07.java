class OverloadDemo {
    void test() {
        System.out.println("параметры отсутствуют");
    }
    void test (int a) {
        System.out.println("a: " + a);
    }
    void test(int a, int b) {
        System.out.println("a и b " + a + " " + b );
    }
    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}
class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Результат вызоа ob.test(123.25): " + result);
    }
}

class Box {
    double width;
    double height;
    double depth;

    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width*height*depth;
    }
}
class Box {
    double width;
    double height;
    double depth;

    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width*height*depth;
    }
}
class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,25,15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        double vol;

        vol = mybox1.volume();
        System.out.println("Обьем майбокс1 равен = " + vol);
        vol = mybox2.volume();
        System.out.println("Обьем майбокс2 равен = " + vol);
        vol = mybox3.volume();
        System.out.println("Обьем майбокс3 равен = " + vol);
    }
}

class Test {
    int a,b;

    Test(int i, int j) {
        a = i;
        b = j;
    }
    boolean equals(Test o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100,22);
        Test ob2 = new Test(100,22);
        Test ob3 = new Test(-1,-1);
        System.out.println("ob1 == ob2 " + ob1.equals(ob2));
        System.out.println("ob1 == ob3 " + ob1.equals(ob3));

    }
}

class Test {
    int a;
    Test(int i) {
        a = i;
    }
    Test incrByTen() {
        Test temp = new Test(a+10);
        return temp;
    }
}
class RetOb {
    public static void main(String[] args) {
        test ob1 = new Test(2);
        test ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.а после второго увеличения значения: " + ob2.a);

    }
}

class Factorial {
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
class Recursion {
    public static void main(String[] args) {
        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 4 равен " + f.fact(4));
        System.out.println("Факториал 5 равен " + f.fact(5));
    }
}

class RecTest {
    int values[];
    RecTest(int i) {
        values = new int[i];
    }
    void printArray(int i) {
        if(i==0) return;
        else printArray(i-1);
        System.out.println(("[" + (i-1) + "] " + values[i-1]));
    }
}
class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;
        for (int i = 0; i < 10; i++) ob.values[i] = i;

        ob.printArray(10);
    }
}

class Length {
    public static void main(String[] args) {
        int a1[] = new int[10];
        int a2[] = {3,4,5,6,7,8,9,10.11};
        int a3[] = {4,3,2,1};

        System.out.println("Длина а1 равна " + a1.length);
        System.out.println("Длина а2 равна " + a2.length);
        System.out.println("Длина а3 равна " + a3.length);
    }
}
class Outer {
    void test() {
    int outer_x = 100;
    inner.display();
}
class Inner {
    void display() {
        System.out.println("вывод: outer_x = " +  outer_x);
    }
}
}
class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}

class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1;

        System.out.println("Длина строки strOb1: " + strOb1.length());
        System.out.println("Символ по индексу 3 в строке strOb1: " + strOb1.charAt(3));
        if (strOb1.equals(strOb2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");
        if (strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");

    }

}
