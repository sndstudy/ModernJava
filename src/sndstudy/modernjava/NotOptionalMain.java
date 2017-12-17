package sndstudy.modernjava;

import java.util.*;

public class NotOptionalMain {

    /**
     * 指定したインデックスに格納されている値を出力する
     * Nullの場合は100を出力する
     * @param args
     */
    public static void main(String [] args){

        Integer result = getInteger(2);

        // Optional未使用のためNullチェックをする
        if(result == null){

            result = 100;

        }

        System.out.println(result);

    }

    /**
     * 指定されたインデックスの値を返す
     * @param index
     * @return
     */
    private static Integer getInteger(int index){

        List<Integer>  list = Arrays.asList(new Integer[]{1,2,null});

        return list.get(index);

    }
}
