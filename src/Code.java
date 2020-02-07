import java.io.IOException;

public class Code {
    private Input fileInput;
    public void setFileObject(Input file){
        this.fileInput = file;
    }

    public boolean vowelOrConsonant() throws IOException
    {
        String x=fileInput.readFile("ip.txt");
        System.out.println(x);
        char y=x.charAt(0);


//        if (x == "a" || x == "e" || x == "i"|| x == "o" || x == "u")
        //
        if (y == 'a' || y == 'e'|| y == 'i' || y == 'o' || y == 'u'){
            return true;}
        else {
            return false;
        }
    }
}