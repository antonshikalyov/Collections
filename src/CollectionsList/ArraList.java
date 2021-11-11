package CollectionsList;

import java.util.ArrayList;
import java.util.Collections;


public class ArraList {

    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");


        ArrayList<String> planets2 = new ArrayList<>();
        planets2.add("Earth");
        planets2.add("Jupiter");
        planets2.add("Mercury");

        planets.forEach(System.out::println);
        planets2.forEach(System.out::println);

        System.out.println(planets.hashCode());              //    Генерирует уникальный номер коллекций hachCode
        System.out.println(planets2.hashCode());

        System.out.println(planets.equals(planets2));     //    Сравнивает hashCod двух коллекций equals

        Collections.sort(planets);                      //   comapareTo -> sort() сортировка в алфитном порядке
        planets.forEach(System.out::println);


    }
}
