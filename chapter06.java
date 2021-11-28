class Box {
    double width;
    double height;
    double depth;
}
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        mybox.width = 100;
        double vol;
        mybox.height = 20;
        mybox.depth = 15;
        vol = mybox.width*mybox.height* mybox.depth;
        System.out.println("Обьем = " + vol);
    }
}

class Box {
    double width;
    double height;
    double depth;
}
class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.height =20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        vol = mybox1.width* mybox1.height* mybox1.depth;
        System.out.println("Объем первого  = " + vol);
        vol = mybox2.width* mybox2.height* mybox2.depth;
        System.out.println("Объем второго  = " + vol);
    }
}

class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width*height*depth);
    }
}
class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();
        mybox2.vol();
    }
}

class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}
class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 19;
        mybox1.height = 20;
        mybox1.depth = 5;

        mybox2.width = 10;
        mybox2.height = 20;
        mybox2.depth = 15;

        vol = mybox1.volume();
        System.out.println("vol = " + vol);
        vol = mybox2.volume();
        System.out.println("vol = " + vol);
    }
}

class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width*height*depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);

        vol = mybox1.volume();
        System.out.println("Объем равнн " + vol);

        vol = mybox2.volume();
        System.out.println("Обьем равен " + vol);
        System.out.println("Обьем равен " + vol);
    }
}

class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Конструирование обьекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    double volume() {
        return width*height*depth;
    }
}
class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
         double vol;

         vol = mybox1.volume();
        System.out.println("vol = " + vol);
        vol = mybox2.volume();
        System.out.println("vol = " + vol);
    }
}

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width*height*depth;
    }
}
class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(21,22,54);
        Box mybox2 = new Box(61,54,55);
        vol = mybox1.volume();
        System.out.println("vol = " + vol);
        vol = mybox2.volume();
        System.out.println("vol = " + vol);
    }
}

class Stack {
    int stck[] = new int[10];
    int tos;
    Stack() {
        tos = -1;
    }
    void push (int item) {
        if (tos == 9)
            System.out.println("Стек полон");
        else
            stck[++tos] = item;
    }
       int pop() {
            if (tos < 0)
                System.out.println("стек не полон");
                return 0;
            }
            else
                return stck[tos--];
    }

class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);
        System.out.println("count mystack1");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());
        System.out.println("count mystack2");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }
}

