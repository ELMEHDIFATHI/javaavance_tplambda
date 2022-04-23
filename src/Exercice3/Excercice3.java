package Exercice3;

import java.util.*;
import java.util.function.Function;

public class Excercice3 {


    public static void main(String[] args) {
        System.out.println("************question 1*******");
        List<Integer> listeInt= Arrays.asList(4,8,6,3,9,2);
        System.out.println(listeInt);
        ajouter4(listeInt,i->i+4);
        System.out.println(listeInt);
        System.out.println("*******************question 2***********");
        List<String> listeString=Arrays.asList("EMSI","Maarif","Casablanca","Rabat","Maroc","");
        List<Integer> tailles=map(listeString,String::length);
        System.out.println(listeString);
        System.out.println(tailles);
        System.out.println("*******************question 3***********");
        Map<Color,String> maps=map2(color -> color.name().toLowerCase());
        for(Map.Entry<Color,String> entry : maps.entrySet()){
            System.out.println(entry.getKey()+" ->" +entry.getValue());
        }

        Map<Color,String> maps2=map2(color -> color.name().toLowerCase()+""+color.ordinal());
        for(Map.Entry<Color,String> entry:maps.entrySet()){
            System.out.println(entry.getKey()+" ->" +entry.getValue());
        }



    }

    public static void ajouter4(List<Integer> liste, Function<Integer,Integer> t){
        for (int i=0;i<liste.size();i++){

            //liste.set(i, liste.get(i)+4);
            liste.set(i, t.apply(liste.get(i)));
        }
    }

    public static List<Integer> map(List<String> listeStrings,Function<String,Integer> t){
        List<Integer> newList= new ArrayList<>();
        listeStrings.forEach(s->{
           // newList.add(s.length());
            newList.add(t.apply(s));
        });

        return newList;
    }

   public static Map<Color,String> map2(Function<Color,String > t){
        Map<Color,String > map=new HashMap<Color,String>();
        for (Color color:Color.values()){

            map.put(color,t.apply(color));
        }
        return map;

   }

    public static enum Color{RED,GREEN}
}
