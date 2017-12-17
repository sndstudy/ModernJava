package sndstudy.modernjava;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMain {

    /**
     * 指定したインデックスに格納されている値を出力する
     * Nullの場合は100を出力する
     * @param args
     */
    public static void main(String [] args){

        Optional<Integer> optional = getInteger(2);

        Integer result = optional.orElse(100);

        System.out.println(result);

    }

    private static Optional<Integer> getInteger(int index){

        List<Integer>  list = Arrays.asList(new Integer[]{1,2,null});

        return Optional.ofNullable(list.get(index));
        
    }
}
