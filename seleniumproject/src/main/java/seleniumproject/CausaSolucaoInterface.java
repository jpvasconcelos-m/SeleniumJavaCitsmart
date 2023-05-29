package seleniumproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CausaSolucaoInterface {
        public String[] causasolucao = Dados.CausaSolucao;

        public JFrame frame;
        public  JComboBox<String> dropdown;
        public JButton button;
        public static String causaSelecionada;


        public CausaSolucaoInterface() {
            frame = new JFrame("Setor");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            dropdown = new JComboBox<>(causasolucao);
            frame.add(dropdown, BorderLayout.CENTER);

            button = new JButton("OK");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    causaSelecionada = (String) dropdown.getSelectedItem();
                    System.out.println("Causa Selecionada: " + causaSelecionada);
                    frame.dispose();
                }
            });
            frame.add(button, BorderLayout.SOUTH);

            frame.setSize(400, 200); // Define o tamanho da janela
            frame.setLocationRelativeTo(null); // Centraliza a janela na tela
            frame.setVisible(true);
        }

        public static String getCausaSelecionada() {
            return causaSelecionada;
        }

        public static void main(String[] args) {

            seleniumproject.CausaSolucaoInterface setorInterface = new seleniumproject.CausaSolucaoInterface();
            String causa = CausaSolucaoInterface.getCausaSelecionada();
            System.out.println("Setor selecionado: " + causaSelecionada);
        }
    }

