class IfElse {
    public static void main (String args[]) {
        int month = 4; // Апрель
        String season;
        if (month == 12 || month == 1 || month == 2)
                season = " зиме ";
        else if ( month == 3 || month == 4 || month == 2)
                season = "весне";
        else if ( month == 6 || month == 7 || month == 8)
                season = "лету";
        else if (month == 9 || month == 10 || month == 11) {
                season = "осени";
        else
            season = "вымышленным месяцам";
            System.out.println("Апрель относится к " + season +".");


class SampleSwitch (
        puЫic static void main ( St ring argз[] ) (
for ( int i=O ; i<б; i++)
        switch (i) (
        case О:
        Syзtem.out . println ( " i равно нулю . " ) ;
        break;
        case 1:
        System . out . println ( " i равно единице . " );
        break;
        case 2:
        Syзtem . out . println ( " i равно двум . " ) ;
        break;
        case 3:
        System . out . println ( " i равно трем. " ) ;
        break;
        defaul t :
        Syзtem . out . println ( " i больше трех . " ) ;}}}

class Swi tch {
    puЫic static void main ( St ring args[) ) {
        int month = 4 ;
        String season;
        switch ( month )
        case 1 2 :
        case 1:
        case 2:
            season
            break;
        case 3:
        case 4:
        case 5 :
            season
            break;
        case 6:
        case 7:
        case 8:
            sea son
            break;
        case 9:
        case 1 0 :
        case 1 1 :
            season
            break;
        de fault :
        season
        " эиме";

        " весне ";

        "лету";

        "осени";
        " вЬ1МЫ1ПЛенным мес яцам" ;

        System.out . printl n ( "Aпpeль относится к" + season + "." ) ;}}

class StringSwi tch {
    puЫic static void main ( St ring args[] ) {
        String str = "два";
        switch ( str) {
            case " один " :
                System.out . println ( " oдин" );
                break;
            case "два " :
                System.out . println ( "двa" );
                break;
            case " три" :
                System.out . println ( " тpи" );

                1 32 Часть 1. Язы к Java
                break;
            de faul t :
            System . out . println ( " нe совпало ) " ) ;
            brea k;}}