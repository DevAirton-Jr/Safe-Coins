package projeto;

// Classe Dólar que herda de Moeda
class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    // Implementação do método de conversão para Real
    @Override
    public double converter() {
        // Considerando 1 dólar como R$5.50 (valor fictício apenas para demonstração)
        return valor * 5.50;
    }
}
