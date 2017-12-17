package sndstudy.modernjava;

import java.io.*;

public class TryWithResourcesMain {

    public static void main(String [] args){

        // プロジェクトフォルダからの相対パスを指定
        File file = new File("test.txt");

        // try-with-resources構文使用
        // BufferedReaderのclose()が記載されていないことを確認
        try(BufferedReader br = new BufferedReader(new FileReader(file))){

            String str = br.readLine();

            while(str != null){

                System.out.println(str);
                str = br.readLine();

            }

        }catch (FileNotFoundException e){

            System.out.println(e);

        }catch (IOException e){

            System.out.println(e);

        }

    }

}
