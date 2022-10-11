public class Exercise3 {
    public static void main(String[] args) {
        double a = 122.0;
        double b = 500;

        double sum = a + b;
        double subtract = a - b;
        double multiply = a * b;
        double divide = a / b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + subtract);
        System.out.println(a + " * " + b + " = " + multiply);
        System.out.println(a + " / " + b + " = " + divide);

        boolean aBiggerThan0 = a > 0;
        System.out.println("Czy liczba a jest większa od 0? " + aBiggerThan0);
        boolean even = sum % 2 == 0;
        System.out.println("Czy suma jest parzysta? " + even);

        boolean aOrBBiggerThan100 = a > 100 || b > 100;
        System.out.println("Czy a lub b jest większe od 100? " + aOrBBiggerThan100);

        boolean aAndBBiggerThan100 = a > 100 && b > 100;
        System.out.println("Czy a i b jest większe od 100? " + aAndBBiggerThan100);
    }
}
