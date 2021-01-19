package iostringwriter;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {


    public void addLenght(Writer write, List<String> words){

        PrintWriter pw = new PrintWriter(write);
        for(String str: words){
            pw.write(str);
            pw.write(" ");
            pw.println(str.length());
        }
    }

    public String writeWithStringWriter(List<String> words){

        StringWriter sw = new StringWriter();
        LongWordService lws = new LongWordService();
        lws.addLenght(sw, words);
        return sw.toString();
    }

}
