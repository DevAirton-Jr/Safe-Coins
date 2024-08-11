package projeto;

// Classe Euro que herda de Moeda
class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    // Implementação do método de conversão para Real
    @Override
    public double converter() {
        // Considerando 1 euro como R$6.20 (valor fictício apenas para demonstração)
        return valor * 6.20;
    }
}
