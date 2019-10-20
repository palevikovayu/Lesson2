package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {      //Задача 1 - сравнение текущего элемента со след. и вывод на экран наименьшего
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] < array[i + 1]) {
                System.out.println(array[i]);
            } else {
                System.out.println(array[i + 1]);
            }
        }
        System.out.println(array[array.length - 1]);   //вывод последнего элемента

        int i = 0;                                //Задача 2 - вывод минимального значения массива
        int min = array[0];
        while (i < array.length) {
            if (array[i] < min) {
                min = array[i];
            }
            i++;

        }
        System.out.println("Минимальное значение " + min);

        int j = array.length - 1;                                //Задача 3 - вывод минимального значения массива

        while (j >= 0) {
            int a = (int) Math.pow(array[j], 2);
            System.out.println(a);
            j--;
        }

        for (int e = 1; e < array.length; e += 2) {         //Задача 4 - вывод квадратов элементов на нечетных позициях
            System.out.println((int) Math.pow(array[e], 2));
        }

        for (int k = 0; k < array.length - 1; k++) {         //Задача 5 - вывод квадратного корня из произведения двух соседних элементов
            System.out.println(Math.sqrt(array[k] * array[k + 1]));
        }

        for (int n = 0; n < array.length; n++) {            //Задача 6 - сортировка массива по возростанию
            for (int g = 0; g < array.length - 1; g++) {
                if (array[g] > array[g + 1]) {
                    int tmp = array[g];
                    array[g] = array[g + 1];
                    array[g + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];                           //Задача 7 - вывод максимального значения на четной позиции
        for (int x = 0; x < array.length; x += 2) {
            if (max < array[x]) {
                max = array[x];
            }
        }
        System.out.println(max);

        int[] arrTmp = new int[array.length];       //Задача 8 - сортировка (выборка мин.значения - запоминание его, выборка след.мин.значение - запоминание его)

        boolean[] isUsed = new boolean[array.length];
        int minTmp = array[0];
        int indexTmp = 0;
        for (int t = 0; t < array.length; t++) {


            for (int y = 0; y < array.length; y++) {
                if (minTmp > array[t]) {
                    minTmp = array[t];
                    indexTmp = t;
                }
            }
        }
    }



}

