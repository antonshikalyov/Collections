package CollectionsList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


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


        String zx = "Танцюем ламбаду!";        //  Срвнивает длину строк
        String zx2 = "Ламбада!";
        int x = zx.compareTo(zx2);
        System.out.println(x);

        // mutable & immutable collections
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list = Collections.unmodifiableList(list);
        list.add("three");
    }
}


//    public interface C