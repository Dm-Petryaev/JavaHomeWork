package com.pb.PetryayevDm.HW15;

import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {

    JTextArea client;
    JTextArea server;
    JPanel jPanel;
    JScrollPane jScrollPane;
    JButton send = new JButton("Отправить");
    Container cont;

    public GUI() {
        cont = getContentPane();
        setSize(900, 450);
        setTitle("GUIClient");
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        client = new JTextArea(20, 20);
        server = new JTextArea(20, 20);
        jScrollPane = new JScrollPane(client);
        jPanel.add(client);
        jPanel.add(server);
        jPanel.add(send);
        cont.add(jPanel);

        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Socket s = null;
                try {
                    s = new Socket("localhost", 1234);
                } catch (UnknownHostException unknownHostException) {
                    unknownHostException.printStackTrace();
                    s = null;
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                    s = null;
                }
                if (s == null)
                    System.exit(-1);
                BufferedReader in = null;
                PrintWriter out = null;
                try {
                    in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    out = new PrintWriter(s.getOutputStream(), true);
                    out.flush();
                    String temp = client.getText();
                    out.println(temp);
                    server.setText(in.readLine());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } finally {
                    try {
                        out.close();
                        in.close();
                        s.close();
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI gui = new GUI();
                gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui.setVisible(true);
            }
        });
    }
}