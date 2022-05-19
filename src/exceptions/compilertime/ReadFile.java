package exceptions.compilertime;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\sayma\\eclipse-workspace\\Test\\src\\exceptions\\runtime\\Calculator.java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        try {
            if(fileReader != null){
            bufferedReader = new BufferedReader(fileReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (fileReader != null) {
                fileReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if(bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }

