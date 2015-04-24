import java.io.IOException;

/**
 * Created by annikamagnusson on 01/04/15.
 */

public class Main {

    public static void main(String[] args) {
        try {
            new MainProgram();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
