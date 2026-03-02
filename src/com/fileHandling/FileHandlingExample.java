package com.fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {
    public static void creation() throws IOException {
        File folder = new File("C:/folder");
        if (!folder.exists()) {
            folder.mkdir();
            System.out.println("folder created successfully");
        } else {
            System.out.println("folder already exists");
        }

        File file = new File(folder, "index.txt");
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("file created successfully");
        } else {
            System.out.println("file already exists");
        }
    }

    public static void fileWriter() throws IOException {
        File file = new File("C:/folder/index.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("contents of file written using FileWriter\n");
        fileWriter.close();
        System.out.println("written successfully");
    }

    public static void fileReader() throws IOException {
        File file = new File("C:/folder/index.txt");
        FileReader fileReader = new FileReader(file);
        char[] ch = new char[(int) file.length()];
        fileReader.read(ch);
        fileReader.close();

        System.out.println(new String(ch));
    }

    public static void bufferedWriter() throws IOException {
        File file = new File("C:/folder/index.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        bufferedWriter.write("contents of file written using BufferedWriter\n");
        bufferedWriter.close();
        System.out.println("written successfully");
    }

    public static void bufferedReader() throws IOException {
        File file = new File("C:/folder/index.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }

    public static void fileOutputStream() throws IOException {
        File file = new File("C:/folder/stream.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String data = "contents written using FileOutputStream\n";
        fileOutputStream.write(data.getBytes());
        fileOutputStream.close();
        System.out.println("written successfully");
    }

    public static void fileInputStream() throws IOException {
        File file = new File("C:/folder/stream.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int characters;
        while ((characters = fileInputStream.read()) != -1) {
            System.out.print((char) characters);
        }
        fileInputStream.close();
    }

    static void main(String[] args) throws IOException {
        fileOutputStream();
        fileInputStream();
    }
}
