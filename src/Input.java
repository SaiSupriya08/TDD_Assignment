import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input {
    private BufferedReader txt;
    public String readFile(String file) {
        try{
            txt=new BufferedReader(new FileReader(file));
           // System.out.println(txt.readLine());
            return txt.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
