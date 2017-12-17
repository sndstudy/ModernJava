package sndstudy.modernjava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NotLambdaMain {

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

        // ラムダ式未使用
        // 匿名クラスでソート処理の実装を行っている
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        // Stream未使用
        // 拡張for文で処理
        for(String str:list){

            System.out.println("言語名:" + str);

        }
    }
}
