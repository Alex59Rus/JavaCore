class IfElse {
    public static void main(String args[]) {
        int month = 4; // Апрель
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = " зиме ";
        else if (month == 3 || month == 4 || month == 2)
            season = "весне";
        else if (month == 6 || month == 7 || month == 8)
            season = "лету";
        else if (month == 9 || month == 10 || month == 11)
            season = "осени";
        else
            season = "вымышленным месяцам";
        System.out.println("Апрель относится к " + season + ".");
    }
}

class SampleSwitch {
    public static void main(String args[]) {
        for (int i = O; i < б; i++) {
            switch (i) {
                case 0:
                    System.out.println("i равно нулю .");
                    break;
                case 1:
                    System.out.println(" i равно единице.");
                    break;
                case 2:
                    System.out.println(" i равно двум.");
                    break;
                case 3:
                    System.out.println(" i равно трем.");
                    break;
                default:
                    System.out.println(" i больше трех.");
            }
        }
    }
}
class MissingBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i меньше 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i <10");
                    break;
                default:
                    System.out.println("i>=10");
            }
        }
    }
        }


class Switch {
    public static void main (String args[]) {
        int month = 4 ;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зиме";
                break;
            case 3:
            case 4:
            case 5:
                season = "весне";
                break;
            case 6:
            case 7:
            case 8:
                season = "лету";
                break;
            case 9:
            case 10:
            case 11:
                season = "осени";
                break;
            default:
                season = "вымышленным месяцам";
        }
        System.out.println("Aпpeль относится к " + season + "." ) ;
    }
}

class StringSwitch {
    public static void main(String args[]) {
        String str = "два";
        switch (str) {
            case "один":
                System.out.println("oдин");
                break;
            case "два":
                System.out.println("двa");
                break;
            case "три":
                System.out.println("тpи");
                break;
            default:
                System.out.println("нe совпало");
                break;
        }
    }
}

class Menu {
    public static void main(String[] args) {
        throws java.io.IOEXception{
            char choice;
        do {
            System.out.println("Справка по оператору");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. while");
            System.out.println("    4. do-while");
            System.out.println("    5. for\n");
            System.out.println("Выберите нужный пункт");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");

        switch (choice){
            case '1':
                System.out.println("if:\n") ;
                System.out.println("if(ycлoвиe) оператор;") ;
                System.out.println("else оператор;" ) ;
                break;
            case '2' :
            System.out.println("switch:\n");
            System.out.println("switch(выpaжeниe){") ;
            System.out.println("саsе константа : ");
            System.out.println("последовательность операторов");
            System.out.println("break;");
            System.out.println(" // ... ");
            System.out.println("}");
            break;
            case 'З':
            System.out.println( "while : \n" ) ;
            System.out.println( "while (ycлoвиe) оператор ;");
            break;
            case '4':
                System.out.println( " do-whi le : \n " );
                System.out.println( "do {");
                System.out.println(" оператор ; " );
                System.out.println("} while ( условие ) ;");
                break;
            case '5':
                System.out.println("for : \n");
                System.out.print("for ( инициaлиэaция; условие ; итерация } ");
                System.out.println(" оператор ; ") ;
                break;
        }
        }
    }
}

class FindPrime {
    public static void main (String args[]) {
        int num;
        boolean isPrime ;
        num = 14;
        if (num < 2) isPrime = false;
            else isPrime true ;
        for (int i=2 ; i <= num/i ; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
                if (isPrime) System.out.println("Пpocтoe число");
                else System.out.println("He простое число");
            }
        }
    }
}
class Comma {
    public static void main(String args[]) {
    int а, b;
for(a=1,b=4;а<b;а++,b--) {
        System.out.println("a = " + а);
        System.out.println("b = " + b);
        }
    }
}
class forEach {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int sum =0;
        for(int x : nums) {
            System.out.println("Значение равно: " + x);
            sum += x;
        }
        System.out.println("Сумма равна: " + sum);
    }
}
class ForEach2 {
    public static void maiп (String args[]) {
        int sum = О;
        int nums [] = { 1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
        for ( int x : nums ) {
            System.out.println("Знaчeниe равно : " + x);
            sum += х;
            if (x == 5) break;
        }
            System.out.println("Cyммa пяти первых элементов равна : " + sum);
        }
    }
class forEach3 {
    public static void main(String[] args) {
        int sum =0;
        int nums[][] = new int[3][5];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < ; j++)
                nums[i][j] = (i+1)*(j+1);
            for(int x[] : nums) {
                for(int y : x) {
                    System.out.println("значение равно: " + y);
                    sum += y;
                }
            }
        System.out.println("Сумма: " + sum);
    }
}
class nested {
    public static void main(String[] args) {
        int i,j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++)
                System.out.print(".");
            System.out.println();
        }
    }

}
class BreakLoop {
    public static void maiп(String args[]) {
        for (int i = O; i < 100; i++) {
            if (i == 10) break;
            System.out.println("i: " + i);
        }
            System.out.println("Цикл завершен.");
    }
}
class ContinueLabel {
    public static void main (String args[]) {
    outer : for ( int i=0 ; i< 10; i++ )
        for (int j = 0; j < 10; j++) {
            if (j > i) {
                System.out.println();
                continue outer;
                System.out.print(" " + (i * j));
                }
            }
            Systern.out.println();
        }
    }

class Return {
    public static void main(String args[]) {
        boolean t = true;
        System.out.println("Дo возврата. ");
        if (t) return;
        Systern.out.println(" Этoт оператор выполняться не будет. ");
    }
}