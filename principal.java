package projeto;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        // Criando o cofrinho
        Cofrinho cofrinho = new Cofrinho(); // Cria uma instância do objeto Cofrinho
        Scanner scanner = new Scanner(System.in); // Cria uma instância do objeto Scanner para ler os dados do usuário

        int opcao;
        do {
            // Exibição do menu principal
            System.out.println("========= COFRINHO =========");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda específica");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total convertido para Real");
            System.out.println("5 - Voltar ao menu do cofrinho");
            System.out.println("0 - Sair");
            System.out.println("============================");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário

            switch (opcao) {
                case 1:
                    // Opção para adicionar moeda
                    System.out.println("Digite o tipo de moeda (dolar, euro, real):");
                    String tipoMoeda = scanner.next(); // Lê o tipo de moeda escolhido pelo usuário
                    System.out.println("Digite o valor da moeda:");
                    double valorMoeda = scanner.nextDouble(); // Lê o valor da moeda escolhido pelo usuário

                    Moeda moeda;
                    switch (tipoMoeda.toLowerCase()) {
                        // Cria uma instância do objeto Moeda (ou de suas subclasses) com base no tipo e valor informados
                        case "dolar":
                            moeda = new Dolar(valorMoeda);
                            break;
                        case "euro":
                            moeda = new Euro(valorMoeda);
                            break;
                        case "real":
                            moeda = new Real(valorMoeda);
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido.");
                            continue; // Volta para o início do loop, permitindo que o usuário escolha uma opção novamente
                    }

                    cofrinho.adicionar(moeda); // Adiciona a moeda escolhida ao cofrinho
                    System.out.println("Moeda adicionada com sucesso!");
                    break;

                case 2:
                    // Opção para remover moeda específica
                    System.out.println("Digite o tipo de moeda (dolar, euro, real):");
                    String tipoMoedaRemover = scanner.next(); // Lê o tipo de moeda a ser removida
                    System.out.println("Digite o valor da moeda:");
                    double valorMoedaRemover = scanner.nextDouble(); // Lê o valor da moeda a ser removida

                    cofrinho.removerMoedaEspecifica(tipoMoedaRemover, valorMoedaRemover); // Remove a moeda específica do cofrinho
                    break;

                case 3:
                    // Opção para listar moedas
                    cofrinho.listagemMoeda(); // Lista todas as moedas presentes no cofrinho
                    break;

                case 4:
                    // Opção para calcular total convertido para Real
                    double totalConvertido = cofrinho.totalConvertido(); // Calcula o valor total convertido das moedas para Real
                    System.out.println("Total convertido para Real: R$" + totalConvertido);
                    break;

                case 5:
                    // Opção para voltar ao menu do cofrinho (essa opção não faz nada, apenas sai do switch)
                    break;

                case 0:
                    System.out.println("Saindo..."); // Exibe uma mensagem de saída
                    break;

                default:
                    System.out.println("Opção inválida. Digite novamente.");
            }
        } while (opcao != 0); // O loop continua até que o usuário escolha a opção "0 - Sair"

        scanner.close(); // Fecha o objeto Scanner
    }
}
