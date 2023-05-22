package seleniumproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceTexto extends JFrame {


	private static final long serialVersionUID = 1L;
	private final JTextArea campoTexto;

    static String info;

    public InterfaceTexto(String titulo) {
        setTitle(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        campoTexto = new JTextArea(10, 30);
        campoTexto.setLineWrap(true);
        campoTexto.setWrapStyleWord(true);

        JButton botao = new JButton("OK");
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info = campoTexto.getText();
                dispose(); // Fechar a janela
            }
        });

        JPanel painel = new JPanel(new BorderLayout());
        painel.add(new JScrollPane(campoTexto), BorderLayout.CENTER);
        painel.add(botao, BorderLayout.SOUTH);

        setContentPane(painel);
        pack();
        setLocationRelativeTo(null);
    }

    public String getDescricao() {
        return info;
    }

    public static void main(String[] args, String titulo) {
    	
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                InterfaceTexto interfaceTexto = new InterfaceTexto(titulo);
                interfaceTexto.setVisible(true);
                 
            }
        });
    }
}
