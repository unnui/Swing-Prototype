package com.serverproto;

import javax.swing.SwingUtilities;

public class App 
{
    static Window window;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SwingUtilities.invokeLater(() -> {
            Window window = new Window();
            window.setVisible(true);
        });
    }
}