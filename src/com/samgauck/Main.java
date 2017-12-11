package com.samgauck;

import java.io.BufferedReader;
import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static File writeFile;

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter the full file path to compile: (Use ~ for your home directory)");
            String filePathString = s.nextLine();
            file = new File(filePathString);
            BufferedReader b = Files.newBufferedReader(Paths.get(new URI(filePathString)));
            b.lines().forEach(line -> {
                StormParser.parseLine(line);
            });
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println();
            e.printStackTrace();
        }
    }

    public static void writeLine(String line) {
        writeFile = new File();
    }
}
