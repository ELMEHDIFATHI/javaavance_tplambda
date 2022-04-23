package Exercice2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exercice2 {
    private  static List<Apple> apples= Arrays.asList(new Apple(150, Color.RED), new Apple(150, Color.GREEN),
            new Apple(250, Color.RED), new Apple(110, Color.GREEN),
            new Apple(50, Color.RED), new Apple(120, Color.GREEN),
            new Apple(90, Color.RED), new Apple(110, Color.GREEN),
            new Apple(60, Color.RED), new Apple(130, Color.GREEN)
    );

    public enum Color{
        RED,GREEN
    }

    public static class  Apple {
        private int weight;
        private  Color color;

        public Apple(int weight, Color color) {
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "weight=" + weight +
                    ", color=" + color +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println("**********question 1************");
      //  traitement(apple -> System.out.println("weight of apple : "+apple.getWeight() + "g"));
        Consumer<Apple> consumer=new Consumer<Apple>() {
            @Override
            public void accept(Apple apple) {
                System.out.println("weight of apple : "+apple.getWeight() + "g");
            }
        };
        traitement(consumer);
        System.out.println("**********question 2************");
        traitement(apple -> {
            if(apple.getWeight() >= 150){
                System.out.println("Heavy Apple");
            }else{
                System.out.println("Light Apple");
            }
        });

    }
    public static  void traitement(Consumer<Apple> consumer){
        apples.forEach(consumer);
    }




}
