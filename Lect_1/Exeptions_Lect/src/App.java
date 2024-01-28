import java.io.File;

public class App {
    public static void main(String[] args) {

        System.out.println(divide(10, 0));
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Делить на ноль нельзя!");
        }
        return a / b;
    }
}
// Пример для ошибок вызова метода getFileSize
// System.out.println(getFileSize(new File("src/TestFil.txt")));
// System.out.println(getFileSize(new File("src/TestFile.txt")));
// System.out.println(divide(10, 0));

// Пример для ошибок массива
// Цепочка ошибок
// a();
// }

// public static void a() {
// b();
// }

// public static void b() {
// c();
// }

// public static void c() {
// int[] ints = new int[10];
// System.out.println(ints[100]);
// }
// }

// //Пример для ошибок вызова метода divide (деление на ноль)
// public static int divide(int a, int b) {
// if (b == 0) {
// return -1;
// }
// return a / b;
// }

// Пример для ошибок вызова метода getFileSize
// public static long getFileSize(File file) {
// if (!file.exists()) {
// return -1L;
// }
// return file.length();
// }
