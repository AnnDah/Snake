import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by annikamagnusson on 01/04/15.
 *
 */
public class MainProgram {
    private int xVar;
    private int yVar;
    private int numberOfForbidden;

    public MainProgram() throws IOException{
        String filePath = System.getProperty("user.dir") + "/text.txt";
        List<String> lines = new ArrayList<>();

        try {
            lines = this.openFile(filePath);
        } catch (IOException e){
            System.out.println(e);
        }
        lines.forEach(System.out::println);
        //String[] firstLine = new String[3];
        //String first = lines.get(0);
        String[] firstLine =lines.get(0).split(",");
        try {
            xVar = Integer.parseInt(firstLine[0]);
            yVar = Integer.parseInt(firstLine[1]);
            numberOfForbidden = Integer.parseInt(firstLine[2]);
        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println(xVar + " " + yVar + " " + numberOfForbidden);

    }

    //Open a txt file and reads it
    private List<String> openFile(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader textReader = new BufferedReader(fr);

        String aLine;
        List<String> lines = new ArrayList<>();

        while((aLine = textReader.readLine())!= null){
            lines.add(aLine);
        }

        textReader.close();
        return lines;

    }

}
