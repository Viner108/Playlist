package org.example;

public class Playlist {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,8,9};
        int sum=20;
        int [] result=playlist(array,sum);
        printLines(result);
    }
    public static int[] playlist(int[]array, int sum){
        int play=0;
        int [] temp =new int[array.length];
        int j=0;
        for (int i = 0; play<sum&&array[i]<=sum-play; i++) {
            play=play+array[i];
            temp[j]=array[i];
            j++;
            System.out.println(play);
        }
        int [] result=new int[j];
        for (int i = 0; i < j; i++) {
            result[i]=temp[i];
        }
        return result;
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
