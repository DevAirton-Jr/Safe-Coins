package projeto;

// Classe abstrata Moeda (classe mãe)
abstract class Moeda {
    double valor; // Valor da moeda em sua moeda original

    public Moeda(double valor) {
        this.valor = valor;
    }

    // Método abstrato para converter o valor da moeda para Real (implementado nas subclasses)
    public abstract double converter();
}
