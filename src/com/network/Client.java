package com.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            output.println("hello from client!");

            String serverResponse = input.readLine();
            System.out.println("server says: " + serverResponse);

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
