package projeto;

// Classe Real que herda de Moeda
class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    // Implementação do método de conversão para Real
    @Override
    public double converter() {
        // Como já é Real, não precisa de conversão
        return valor;
    }
}
