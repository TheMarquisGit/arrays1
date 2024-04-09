import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int array1[] = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double array2[] = new double[3];
        array2[0] = 1.57;
        array2[1] = 7.654;
        array2[2] = 9.986;
        String array3[] = {"eto", "strochniy", "massiv", "detka"};

        //Задача 2
        System.out.println("\nЗадача 2");
        //array1
        for (int i = 0; i < array1.length - 1; i++) {
            System.out.print(array1[i] + ",");
        }
        System.out.println(array1[array1.length - 1]);
        //array2
        for (int i = 0; i < array2.length - 1; i++) {
            System.out.print(array2[i] + ",");
        }
        System.out.println(array2[array2.length - 1]);
        //array3
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i != array3.length - 1) System.out.print(",");
        }

        //Задача 3
        System.out.println("\n\nЗадача 3");
        //array1
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[array1.length - 1 - i]);
            if (i != array1.length - 1) System.out.print(",");
        }
        //array2
        System.out.println("");
        System.out.print(array2[2] + "," + array2[1] + "," + array2[0]);
        //array3
        System.out.println("");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[array3.length - 1 - i]);
            if (i != array3.length - 1) System.out.print(",");
        }

        //Задача 4
        System.out.println("\n\nЗадача 4");
        //не меняя сам массив, только результат
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) System.out.print(array1[i]);
            else System.out.print(array1[i] + 1);
            if (i != array1.length -1) System.out.print(",");
        }
        //меняя сам массив
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i]++;
            }
        }
        System.out.println("");
        System.out.println(Arrays.toString(array1));
    }
}