package sndstudy.modernjava;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaMain {

    /**
     * プログラミング言語を降順に並び替える
     * @param args
     */
    public static void main(String [] args){

        List<String> list = new ArrayList<>();

        list.add("C#");
        list.add("Python");
        list.add("VB.NET");
        list.add("Java");
        list.add("ECMAScript");

        // ラムダ式使用
        list.sort((o1, o2) -> o2.compareTo(o1));

        // Stream使用
        list.stream().map(str -> "言語名:" + str).forEach(s -> System.out.println(s));

    }
}
