package com.qa;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MyConsoleReader {
    public void readerInputPrint(){
        StringBuffer sb = new StringBuffer();
         try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
              System.out.println("Enter a line of text or 'stop'");
              String line = br.readLine();

              while(!line.equals(("stop"))){
                  sb.append(line + "\n");
                  System.out.println("Enter a line of text or 'stop'");
                  line = br.readLine();
              }
              System.out.println(sb);
         } catch (IOException e) {
             System.out.println("Error on console input: " + e);
             e.printStackTrace();
         }
    }

    public static void main(String[] args){
        MyConsoleReader mcr = new MyConsoleReader();
        mcr.readerInputPrint();
    }
}
