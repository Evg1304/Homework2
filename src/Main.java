public class Main {
    public static void main(String[] args) {

        //Задание 1
        byte a  = 101;
        short b  = 1000;
        int c = 535639;
        long d  =10005L;

        double e  = 3.6647;
        float f = 4;
        char h = 748;

        var g = 356;

        //Задание 2
        var FirstBoxer = 78.2;
        var SecondBoxer = 82.7;
        var TotalWeight = SecondBoxer + FirstBoxer;
        System.out.println("Общий вес бойцов: " +  TotalWeight  + " кг" );

        var  WeightDifference = SecondBoxer - FirstBoxer;
        System.out.println("Разница в весе: " +  WeightDifference  + " кг" );

        //Задание 3
        var bananas  = 80 * 5;
        var milk = 105 * 2;
        var iceCream = 100 * 2;
        var eggs = 4 * 70;

        var Breakfast = bananas + milk + iceCream + eggs;
        System.out.println("Вес завтрака: " + Breakfast  + "гр" );
        double Breakfast1 = (double) Breakfast/1000;
        System.out.println("Вес в кг: " + Breakfast1  + " кг." );

        //Задание 4
        float firstDay = 7000/250;
        float secondDay = 7000/500;
        System.out.println("Если спортсмен будет терять по 250гр,то уйдет " + firstDay  + " дней " );
        System.out.println("Если спортсмен будет терять по 500гр,то уйдет " + secondDay + " дней " );

        //Задание 5
        var Masha = 67760*10/100*12;
        var Denis = 83690*10/100*12;
        var Kristina = 76230*10/100*12;

        var Masha1 = Masha/12+ 67760;
        double Denis1 = (double) Denis/12+ 83690;
        var Kristina1 = Kristina/12+ 76230;

        System.out.println("Маша получает: " + Masha1 + " рублей. Годовой доход вырос на: "  + Masha + " рублей. " );
        System.out.println("Денис получает: " + Denis1 + " рублей. Годовой доход вырос на: " + (double)Denis + " рублей. "  );
        System.out.println("Кристина получает: " + Kristina1  + " рублей. Годовой доход вырос на: "   + Kristina + " рублей. "  );







































    }
}