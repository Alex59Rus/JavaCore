class A {
    int i,j;

    void showij() {
        System.out.println("i, j: " + i + " " + j);
    }
}
class B extends A {
    int k;
    void showk() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i+j+k:" + (i+j+k));
    }
}
class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 20;
        superOb.j = 10;
        System.out.println("Содержимое обьекта суперОб");
        superOb.showij();
        System.out.println();

        subOb.i = 20;
        subOb.j = 10;
        System.out.println("Содержимое обьекта субОб");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Сумма i,j,k в обьекте субоб: ");
        subOb.sum();
    }
}

class Вох {
    double width;
    double height;
    double depth;

    Вох(Вох ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Вох() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double lеп) {
        width = height = depth = len;
        double volume () {
            return width * height * depth;
        }
            class BoxWeight extends Вох {
                double weight;

                BoxWeight(double w, double h, double d, double m) {
                    width = w;
                    height = h;
                    depth = d;
                    weight = m;
                }
            }
                    class DemoBoxWeight {
                        public static void main(String args[]) {
                            BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
                            BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
                            double vol;
                            vol = mybox1.volume();
                            System.out.println("Oбъeм mybox1 равен " + vol);
                            System.out.println("Bec mybox1 равен " + mybox1.weight);
                            System.out.println();
                            vol = mybox2.volume();
                            System.out.println("Oбъeм mybox2 равен " + vol);
                            System.out.println("Bec mybox2 равен " + mybox2.weight);
                        }
                    }
                }
}

class RefDemo {
    public static void main(String args[]) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Вох plainbox = new Вох();
        double vol;
        vol = weightbox.volume();
        System.out.println("Oбъeм weightbox равен " + vol);
        System.out.println("Bec weightbox равен" +
                weightbox.weight);
        System.out.println();
        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("Oбъeм plainbox равен " + vol);
    }
}

class Box {
    private double width;
    private double height;
    private double depth;

    Box (Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box () {
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
class BoxWeight extends Box {
    double weight;
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
    BoxWeight() {
        super();
        weight = -1;
    }
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,56,56,44);
        BoxWeight mybox2 = new BoxWeight(2,3,4,5);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3,2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Обьем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Обьем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Обьем mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Обьем myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Обьем mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();
    }
}

class Вох {
    private double width;
    private double height ;
    private double depth;
    Вох ( Вох оЬ ) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box ( double w, double h, double d){
            width = w;
            height = h;
            depth = d;
    }
    Вох () {
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
class BoxWeight extends Box {
    double weight;
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}