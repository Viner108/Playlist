package org.example;
import java.util.Random;

public class RandomWithoutRepetition {
    public static void main(String[] args) {
        int[] array = new int[500];
        int [] index = new int [500];
        Random random = new Random();
        int words=100;
        for (int i = 0; i < array.length; i++) {
            array[i]=-1;
        }
        int count=0;
        for (int i = 0; i < array.length; i++) {
            index[i] = random.nextInt(words) + 1;
            if (index[i]>words/2) {
                if (contains(index, index[i], i)) {
                    array[i] = index[i];
                    count++;
                }
            }else if (percent(array,words)<words/5) {
                array[i] = index[i];
                count++;
            }
        }
        int [] result = new int[count];
        int j=0;
        for (int i = 0; j < result.length; i++) {
            if(array[i]!=-1){
                result[j]=array[i];
                j++;
            }
        }
        printLines(result);
        System.out.println(result.length);
    }
    public static boolean contains(int [] index,int g, int i){
        for (int j = 0; j <i; j++) {
            if(index[j]==g){
                return false;
            }
        }
        return true;
    }
    public static int percent(int [] index, int words){
        int count=0;
        for (int i = 0; i < index.length; i++) {
            if(index[i]<words/2&&index[i]>0){
                count++;
            }
        }
        return count;
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