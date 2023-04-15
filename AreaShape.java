import java.util.Scanner;

public class AreaShape {
    public static void main(String[] args) {
        Scanner keyBoardInput = new Scanner(System.in);
        System.out.println("Please input option number");
        System.out.println("1: triangle");
        System.out.println("2: rectangle");
        System.out.println("3: quit");

        int inputOption = keyBoardInput.nextInt();

        if (inputOption == 1) {

            System.out.println("Please input base value");
            int base = keyBoardInput.nextInt();
            System.out.println("Please input height value");
            int height = keyBoardInput.nextInt();
            System.out.println("triangle are is " + traingleArea(base, height));
        } else if (inputOption == 2) {

            System.out.println("Please input lenght value");
            int lenght = keyBoardInput.nextInt();
            System.out.println("Please input Width value");
            int Width = keyBoardInput.nextInt();
            System.out.println("rectangle are is " + rectangleleArea(lenght, Width));
        } else {
            quit();
        }

    }

    public static float traingleArea(int base, int height) {
        return ((base * height) / 2);
    }

    public static float rectangleleArea(int lenght, int Width) {
        return (lenght * Width);
    }

    public static void quit() {
        System.out.println("good bye");
        return;
    }
}