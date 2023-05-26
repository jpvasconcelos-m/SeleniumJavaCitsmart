package seleniumproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RepetirChamado {



        public static String resposta = ""; // Variável resposta como atributo estático da classe

        public static void main(String[] args) {
            JFrame frame = new JFrame("Deseja Criar mais um chamado?");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 100);
            frame.setLayout(new FlowLayout());

            // Variáveis para armazenar as respostas
            final String respostaSim = "Sim";
            final String respostaNao = "Não";

            // Botão "Sim"
            JButton btnSim = new JButton("Sim");
            btnSim.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    resposta = respostaSim;
                    frame.dispose(); // Fechar a janela após a escolha
                    // Faça algo com a resposta
                    System.out.println("Resposta: " + resposta);
                }
            });

            // Botão "Não"
            JButton btnNao = new JButton("Não");
            btnNao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    resposta = respostaNao;
                    frame.dispose(); // Fechar a janela após a escolha
                    // Faça algo com a resposta
                    System.out.println("Resposta: " + resposta);
                }
            });

            // Adicionar botões ao frame
            frame.add(btnSim);
            frame.add(btnNao);

            // Centralizar a janela na tela
            frame.setLocationRelativeTo(null);

            // Exibir a janela
            frame.setVisible(true);
        }

        public static String getResposta() {
            return resposta;
        }
    }


