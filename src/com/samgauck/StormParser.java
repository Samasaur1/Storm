package com.samgauck;

public class StormParser {
    public static void parseLine(String line) {
        line += "\t//has been processed by the parser"; //for now, just show it was accessed

        //Actually write the line
        Main.writeLine(line);
        return;
    }
}
