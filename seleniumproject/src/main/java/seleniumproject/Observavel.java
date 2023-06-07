package seleniumproject;

import java.util.List;
import java.util.ArrayList;

// Interface Observavel define os métodos para gerenciar observadores
public interface Observavel {
    void adicionarObservador(Observador observador); // Adiciona um observador
    void removerObservador(Observador observador); // Remove um observador
    void notificarObservadores(); // Notifica todos os observadores
}

// Interface Observador define o método para atualizar
interface Observador {
    void atualizar(Object arg); // Atualiza o observador com um argumento
}

// Classe Implementador implementa a interface Observavel
class Implementador implements Observavel {
    private List<Observador> observadores = new ArrayList<>(); // Lista de observadores
    private Object setorSelecionado; // Objeto para armazenar o setor selecionado

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador); // Adiciona um observador à lista
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador); // Remove um observador da lista
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(setorSelecionado); // Notifica cada observador com o setor selecionado
        }
    }
}

// Classe Main implementa a interface Observador
class Main implements Observador {
    public static void main(String[] args) {
        Implementador implementador = new Implementador(); // Cria uma instância de Implementador
        implementador.adicionarObservador(new Main()); // Adiciona a instância de Main como observador
    }

    @Override
    public void atualizar(Object arg) {
        if (arg != null) {
            System.out.println(arg); // Imprime o argumento atualizado
        }
    }
}
