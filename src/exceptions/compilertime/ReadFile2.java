package exceptions.compilertime;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {
    public static void main(String[] args) throws IOException {

       FileReader fileReader = new FileReader("C:\\Users\\sayma\\eclipse-workspace\\Test\\src\\exceptions\\runtime\\Calculator.java");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }

        fileReader.close();
        bufferedReader.close();

        }

    }




