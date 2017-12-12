package com.samgauck;

public class StormParser {
    public static void parseLine(String line) {
        line += "\twitten bi me"; //for now, just show it was accessed

        //Actually write the line
        Main.writeLine(line);
        return;
    }
}
