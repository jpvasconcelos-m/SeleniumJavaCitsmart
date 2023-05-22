package seleniumproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceMenu {
    private final JFrame loginFrame;
    private JFrame menuFrame;
    private JFrame currentFrame;

    public InterfaceMenu() {
        loginFrame = new JFrame("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernameLabel = new JLabel("E-mail:");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Senha:");
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Entrar");
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        loginPanel.add(usernameLabel, gbc);

        gbc.gridy = 1;
        loginPanel.add(passwordLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        loginPanel.add(usernameField, gbc);

        gbc.gridy = 1;
        loginPanel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        loginPanel.add(loginButton, gbc);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Verifique as credenciais aqui (adapte para sua situação)
                if (username.equals("admin") && password.equals("admin")) {
                    showMenuFrame();
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Credenciais inválidas. Tente novamente.", "Erro de login", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        loginFrame.getContentPane().add(loginPanel);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);

        // Resto do código permanece o mesmo
    }

    private void showMenuFrame() {
        if (currentFrame != null) {
            currentFrame.setVisible(false);
        }

        menuFrame = new JFrame("Menu");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Criar e Fechar Chamados");
        JButton button2 = new JButton("Apenas Criar Chamados");
        JButton button3 = new JButton("Apenas Fechar Chamados");
        JButton button4 = new JButton("Fechar Múltiplos Chamados");
        JButton exitButton = new JButton("Sair");

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(5, 1));
        menuPanel.add(button1);
        menuPanel.add(button2);
        menuPanel.add(button3);
        menuPanel.add(button4);
        menuPanel.add(exitButton);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            AbreNavegador navegador = new AbreNavegador();
                try {
                    navegador.main();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                JOptionPane.showMessageDialog(menuFrame, "Criando Chamado...");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chame a classe 2 aqui (substitua por sua lógica)
                JOptionPane.showMessageDialog(menuFrame, "Fechando Chamado");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chame a classe 3 aqui (substitua por sua lógica)
                JOptionPane.showMessageDialog(menuFrame, "Chamando Classe 3");
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chame a classe 4 aqui (substitua por sua lógica)
                JOptionPane.showMessageDialog(menuFrame, "Chamando Classe 4");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Feche o programa
                System.exit(0);
            }
        });

        menuFrame.getContentPane().add(menuPanel);
        menuFrame.pack();
        menuFrame.setLocationRelativeTo(null);
        menuFrame.setVisible(true);

        currentFrame = menuFrame;
    }

    // Resto do código permanece o mesmo
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfaceMenu();
            }
        });
    }
}
