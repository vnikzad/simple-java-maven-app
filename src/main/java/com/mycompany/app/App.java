package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        int result = 5 * 10;
        System.out.println(result);
    }

    private final String getMessage() {
        return message;
    }

}
