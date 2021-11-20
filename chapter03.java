/**         JavaTypes
 * Целые числа: [Наименование | Длина в битах |         Диапазон       ]
 *               byte -               8         -128:127
 *               short -              16        -32768:32767
 *               int -                32        -2147483648:2147483647
 *               long -               64        a lot of
 * Плавающая запятая:[Наименование | Длина в битах |     Диапазон    ]
 *                    float -              32       1.4e-045:3.4e+038
 *                    double -             64       4.9e-324:1.8e+308
 * Символы: char 16 0:65536
 * Логические: boolean true/false
 */

class lightSpeed {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000; // ~mps
        days = 1000;
        seconds = days*24*60*60;
        distance = lightspeed*seconds;
        System.out.print("За " + days);
        System.out.print(" дней, свет пройдет около");
        System.out.println(distance + " миль");
    }
}
class area {
    public static void main(String[] args) {
        double pr, r, a;
        r=10.8;
        pi=3,141592664689793;
        a=pi*r*r;
        System.out.println("Площадь круга равна " + a);
    }
}
class charDemo {
    public static void main(String[] args) {
        char ch1, ch2;

        ch1 = 88; //код символа Х по ASCII (Unicode)
        ch2 - 'Y';

        System.out.print("ch1 и ch2: ");
        System.out.println(ch1 + " " + ch2);
    }
}
class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b равно "+b);
        b = true;
        System.out.println("b равно "+b);
        if (b) System.out.println("Этот код выполняется");
        b = false;
        if(b) System.out.println("Этот код не выполняется");
        System.out.println("10>9 равно " + (10>9));//10>9 равно true
    }
}
