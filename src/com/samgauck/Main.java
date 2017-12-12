package com.samgauck;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static PrintWriter w = null;

    public static void main(String[] args) {
        try {
            String filePathString;
            if (args.length > 0) {
                filePathString = args[0];
            } else {
                Scanner s = new Scanner(System.in);
                System.out.println("Please enter the full file path to compile: (Relative to your home directory)");
                filePathString = s.nextLine();
            }

            filePathString = "/Users/" + System.getProperty("user.name") + "/" + filePathString;
            File file = new File(filePathString);
            if (!file.exists()) {
                System.out.println("No file found at the location:");
                System.out.println(file.getAbsolutePath());
                System.exit(0);
            }
            ArrayList<String> path = new ArrayList<>(Arrays.asList(filePathString.split("/")));
            path.remove(path.size() - 1);
            path.add(file.getName().replaceAll("\\..*", ".java"));
            StringBuilder writeFilePathString = new StringBuilder();
            path.forEach(l -> {
                writeFilePathString.append(l).append("/");
            });
            writeFilePathString.reverse().deleteCharAt(0).reverse();
            System.out.println("Writing to " + writeFilePathString.toString() + "\n");
            w = new PrintWriter(writeFilePathString.toString(), "UTF-8");
            BufferedReader b = new BufferedReader(new FileReader(file));
            b.lines().forEach(line -> {
                StormParser.parseLine(line);
                System.out.println("Parsing " + line);
            });
            w.close();
            System.out.println("\nDone");
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println();
            e.printStackTrace();
        }
    }

    public static void writeLine(String line) {
        try {
            w.println(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
