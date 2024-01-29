public class Main {
    public static void main(String[] args) {
        printSquare(10);
        System.out.println("-----------");
        printSquare(20);
        System.out.println("-----------");
        printTriangle(4);
        System.out.println("----------------");
        printTriangle(6);
        System.out.println("----------------");
    }

    public static void printSquare(int length) {
        //Print square made of stars (*)
        //Length: 5 stars  x 5 stars

        for (int i = 0; i <= length; i++) {
            for (int k = 0; k <= length; k++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

    public static void printTriangle(int base) {

        for (int w = 0; w <= base - 1 ; w++) {
            for (int y = 1; y <= w+1; y++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}