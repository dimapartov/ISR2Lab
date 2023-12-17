public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.divide(1, 2));
        System.out.println(myCalculator.divide(1, 0));
        System.out.println(myCalculator.sum(2.5, 3.4));
        System.out.println(myCalculator.sum(2.5, 2.5));
        System.out.println(myCalculator.subtract(10.5, 0.5));
        System.out.println(myCalculator.subtract(10.5, 10));
        System.out.println(myCalculator.multiply(2.5, 2));
        System.out.println(myCalculator.multiply(2.3, 2.5));
    }
}