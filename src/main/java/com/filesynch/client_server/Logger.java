package com.filesynch.client_server;

import javax.swing.*;

public class Logger {
    public static JTextArea log;

    public static void log(String stringToLog) {
        System.out.println(stringToLog);
        log.append(stringToLog);
        log.append("\n");
    }
}
