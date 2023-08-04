public class Main {
    public static void main(String[] args) {


        // Математические
        int x = 9;
        int y = 2;

        System.out.println("Math");
        System.out.println("sum= " + (x + y));
        System.out.println("subtraction= " + (x - y));
        System.out.println("multiplication= " + (x * y));
        System.out.println("div= " + (x / y));
        System.out.println("remainder= " + (x % y));


        // Логические
        boolean tru = true;
        boolean fals = false;

        System.out.println("\nLogic");
        System.out.println("true and false= " + (tru && fals));
        System.out.println("true or false= " + (tru || fals));
        System.out.println("no true= " + !tru);


        // Превышение значения
        System.out.println("\nOverflow");
        int largeValue = Integer.MAX_VALUE;
        System.out.println("OverValue= " + largeValue);
        System.out.println("OverValue= " + (++largeValue));


        // Комбинация примитивов
        int Celoe = 8;
        double Drobnoe = 2.5;

        System.out.println("\nCombitanion");
        System.out.println("Celoe+Drobnoe= " + (Celoe + Drobnoe));
        System.out.println("Celoe-Drobnoe= " + (Celoe - Drobnoe));
        System.out.println("Celoe/Drobnoe= " + (Celoe / Drobnoe));
        System.out.println("Celoe*Drobnoe= " + (Celoe * Drobnoe));
        System.out.println("Celoe%Drobnoe= " + (Celoe % Drobnoe));

    }
}
