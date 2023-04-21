package org.example;

import java.util.Random;

public class Playlist {
    public static void main(String[] args) {
        int[] array = new int[250];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(653) + 150;
        }
        int sum = 23721;
        int difference = 2;
        int[] result = playlist(array, sum, difference);
        printLines(result);
    }

    public static int[] playlist(int[] array, int sum, int difference) {
        int play = 0;
        int m=0;
        int[] temp = new int[array.length];
        int[] index=new int[array.length];
        int j = 0;
            while (play < sum - difference || play > sum + difference) {
                if (play < sum - difference && j < array.length) {
                    Random random = new Random();
                    int i = random.nextInt(250);
                    if (contains(index, i)) {
                        play = play + array[i];
                        temp[j] = array[i];
                        index[j] = i;
                        j++;
                    }
                }
                if (play > sum + difference) {
                    for (int i = 0; i <j; i++) {
                        temp[i]=0;
                        index[i]=0;
                    }
                    play=0;
                    j=0;
                    System.out.println(temp[0]);
                    m++;
                }
                System.out.println(play);
            }
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }
        System.out.println(m);
        return result;
    }
    public static boolean contains(int [] index, int i){
        for (int j = 0; j <index.length; j++) {
            if(index[j]==i){
                return false;
            }
        }
        return true;
    }

    public static void printLines(int[] array) {//функция для выведения массива на консоль
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(String.format(" %2d", array[i]));
        }
        System.out.println("]");
    }
}
