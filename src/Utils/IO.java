package Utils;

import java.io.*;
import java.net.Socket;

public class IO {
    public BufferedReader bufferedReader = null;
    public PrintStream printStream = null;

    public IO(Socket s){
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            printStream = new PrintStream(s.getOutputStream());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close(){
        try {
            bufferedReader.close();
            printStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
