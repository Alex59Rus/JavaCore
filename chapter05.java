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

