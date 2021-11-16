package JavaCore;



/*public class chapter02 {
    public static void main(String args[]) {
        System.out.println("Простая программа на Java."); //не удается запустить код, возможно проблема в пути к файлу
    }
}*/
class chapter02 {
    public static void main(String args[]) {
        int num; //объявление целчосиленной переменной с именнем нум
        num = 100; //присваиваем значение 100
        System.out.println("Это переменная num: " + num); //выводим в консоль нум=100
        num = num * 2; //переопределение переменной нум
        System.out.print("Значение перменной num * 2 = ");//выводим в консоль нум*2=200
        System.out.println(num);
    }
}


