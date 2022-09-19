public class MultTable {
    public static void main(String[] args) {
        //TODO: Write a Java program that prepares the multiplication tables from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
            System.out.println("------------------");
        }
    }
}
