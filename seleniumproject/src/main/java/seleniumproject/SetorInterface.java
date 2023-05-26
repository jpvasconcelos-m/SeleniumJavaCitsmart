package seleniumproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetorInterface {
    public String[] setores = Dados.setores;

    public JFrame frame;
    public  JComboBox<String> dropdown;
   public JButton button;
    public static String setorSelecionado;


    public SetorInterface() {
        frame = new JFrame("Setor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        dropdown = new JComboBox<>(setores);
        frame.add(dropdown, BorderLayout.CENTER);

        button = new JButton("OK");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 setorSelecionado = (String) dropdown.getSelectedItem();
                System.out.println("Setor selecionado: " + setorSelecionado);
                frame.dispose();
            }
        });
        frame.add(button, BorderLayout.SOUTH);

        frame.setSize(400, 200); // Define o tamanho da janela
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);
    }

    public String getsetorSelecionado() {
        return setorSelecionado;
    }

    public static void main(String[] args) {
    	
        SetorInterface setorInterface = new SetorInterface();
        String setorSelecionado = setorInterface.getsetorSelecionado();
        System.out.println("Setor selecionado: " + setorSelecionado);
    }
}
