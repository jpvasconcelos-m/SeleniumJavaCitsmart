package seleniumproject;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ServicoInterface {
	private String[] servicoes = Dados.servicos;

    private JFrame frame;
    private JComboBox<String> dropdown;
    private JButton button;
    static String servicoSelecionado;


    public ServicoInterface() {
        frame = new JFrame("Atividade");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        dropdown = new JComboBox<>(servicoes);
        frame.add(dropdown, BorderLayout.CENTER);

        button = new JButton("OK");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                servicoSelecionado = (String) dropdown.getSelectedItem();
                System.out.println("Serviço selecionado: " + servicoSelecionado);
                frame.dispose();
            }
        });
        frame.add(button, BorderLayout.SOUTH);

        frame.setSize(400, 200); // Define o tamanho da janela
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);
    }

    public String getservicoSelecionado() {
        return servicoSelecionado;
    }

    public static void main(String[] args) {
    	
        ServicoInterface servicoInterface = new ServicoInterface();
        String servicoSelecionado = servicoInterface.getservicoSelecionado();
        System.out.println("servico selecionado: " + servicoSelecionado);
    }
}
