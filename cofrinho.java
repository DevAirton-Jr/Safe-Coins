package projeto;

import java.util.ArrayList;

// Classe Cofrinho
class Cofrinho {
    private ArrayList<Moeda> moedas; // Lista de moedas no cofrinho

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    // Método para adicionar moedas ao cofrinho
    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
    }

    // Método para remover moedas específicas do cofrinho
    public void remover(Moeda moeda) {
        moedas.remove(moeda);
    }

    // Método para remover moedas específicas do cofrinho pelo tipo e valor
    public void removerMoedaEspecifica(String tipoMoeda, double valorMoeda) {
        for (Moeda moeda : moedas) {
            if (moeda.getClass().getSimpleName().equalsIgnoreCase(tipoMoeda) && moeda.valor == valorMoeda) {
                moedas.remove(moeda);
                System.out.println("Moeda removida com sucesso!");
                return; // Sai do método após remover a primeira ocorrência
            }
        }
        System.out.println("Moeda não encontrada no cofrinho.");
    }

    // Método para listar todas as moedas dentro do cofrinho
    public void listagemMoeda() {
        System.out.println("Moedas no cofrinho:");
        for (Moeda moeda : moedas) {
            // Usamos o método getClass().getSimpleName() para obter o nome da classe sem o pacote
            System.out.println("- " + moeda.getClass().getSimpleName() + " | Valor original: " + moeda.valor);
        }
    }

    // Método para calcular o total convertido para Real
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converter(); // Somando o valor convertido de cada moeda
        }
        return total;
    }
}
