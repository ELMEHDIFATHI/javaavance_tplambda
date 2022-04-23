package Excercice1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exercice1 {
    public static void afficher(List<Integer> listeInt,Consumer<Integer> t){
        listeInt.forEach(t);


    }


    public static void main(String[] args) {
        int i=5;
        System.out.println("************Question*************");
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        Consumer<Integer> consumer2 =(Integer t) -> System.out.println(t);

        consumer2.accept(i);
        System.out.println("************Question2*************");

        List<Integer> listInt = Arrays.asList(4,5,6,7,9,12);
        afficher(listInt,k-> System.out.println(k));

        System.out.println("************Question3*************");
        afficher(listInt,k-> System.out.println(k*2+" "));



    }
}
