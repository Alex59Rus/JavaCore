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
class lifeTime {
    public static void main(String[] args) {
        int x;
        for (int x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y равноЖ " + y);
            y = 100;
            System.out.println("Теперь у = " + y);

        }
    }
}

class Array {
    public static void main(String[] args) {
        int month_days[];
        month_days = new int[12];
        month_days[0] = 1;
        month_days[1] =  2;
        month_days[2] =  3;
        month_days[3] =  30;
        month_days[4] =  5;
        month_days[5] =  6;
        month_days[6] =  31;
        month_days[7] =  28;
        month_days[8] =  9;
        month_days[9] =  0;
        month_days[10] =  21;
        month_days[11] =  123;
        month_days[12] =  123;
        System.out.println("В Апреле " + month_days[3] + " дней.");
    }
}
class arrayUpdated{
    public static void main(String[] args) {
        int monthDays[] = {31, 17, 23, 43, 45, 67, 87, 30, 28};
        System.out.println("В Апреле " + monthDays[8] + " дней.");
    }
}
class average {
    public static void main(String[] args) {
        double nums[] = {10.1, 12.3, 12.4, 15.7, 12.8};
        double result = 0;
        int i;
        for (int i = 0; i < 5; i++) {
            result = result + nums[i];
            System.out.println("Среднее значение равно " + result/5);
        }
    }
}

class twoArray {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(twoD[i][j]+ " ");
            System.out.println();
        }
    }
}
class twoArrayAgain{
    public static void main(String[] args) {
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int i,j,k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < i+1; j++) {
                twoD[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i+1; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}


