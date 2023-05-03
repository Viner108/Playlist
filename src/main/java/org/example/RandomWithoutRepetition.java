package org.example;
import java.util.Random;

public class RandomWithoutRepetition {
    public static void main(String[] args) {
        int[] array = new int[300];
        int [] index = new int [300];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=-1;
        }
        for (int i = 0; i < array.length; i++) {
            index[i] = random.nextInt(70)+1;
            if (contains(index, index[i],i)) {
                array[i]=index[i];
            }
        }
        int [] result = new int[70];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=-1){
                result[j]=array[i];
                j++;
            }
        }
        printLines(result);
    }
    public static boolean contains(int [] index,int g, int i){
        for (int j = 0; j <i; j++) {
            if(index[j]==g){
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