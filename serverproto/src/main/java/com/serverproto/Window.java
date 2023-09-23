package com.serverproto;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Window extends JFrame implements ActionListener{
    
    JMenuBar        menuBar;
    JMenu           menuConfig, menuHelp;
    JMenuItem       itemProfile, itemServer, itemApplication, itemAbout;

    public Window () {

        try{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}
		catch(Exception e) {
			e.getMessage();
		}

        setTitle("serverproto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(650,500);
		setResizable(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (int) ((screenSize.getWidth() - getWidth()) / 2);
        int centerY = (int) ((screenSize.getHeight() - getHeight()) / 2);
        setLocation(centerX, centerY);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menuConfig = new JMenu("Configuration");
        JMenu menuHelp = new JMenu("Help");
        JMenuItem itemProfile = new JMenuItem("Profile");
        JMenuItem itemServer = new JMenuItem("Server");
        JMenuItem itemApplication = new JMenuItem("Application");
        JMenuItem itemAbout = new JMenuItem("About");

        menuConfig.add(itemProfile);
        menuConfig.add(itemApplication);
        menuConfig.add(itemServer);
        menuHelp.add(itemAbout);
        menuBar.add(menuConfig);
        menuBar.add(menuHelp);
        this.setJMenuBar(menuBar);

    }

    public void actionPerformed (ActionEvent e) {

    }
}
