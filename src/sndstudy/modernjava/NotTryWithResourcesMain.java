package sndstudy.modernjava;

import java.io.*;

public class NotTryWithResourcesMain {

    public static void main(String [] args){

        // プロジェクトフォルダからの相対パスを指定
        File file = new File("test.txt");

        BufferedReader br = null;

        // try-with-resources構文未使用
        try{

            br = new BufferedReader(new FileReader(file));

            String str = br.readLine();

            while(str != null){

                System.out.println(str);
                str = br.readLine();

            }

        }catch (FileNotFoundException e){

            System.out.println(e);

        }catch (IOException e){

            System.out.println(e);

        }finally {

            // finallyにclose()処理が実装されている
            // BufferedReaderがNullの場合があるためclose()前にさらにtryで囲む必要がある
            try {

                br.close();

            }catch (IOException e){

                System.out.println(e);

            }
        }

    }

}
