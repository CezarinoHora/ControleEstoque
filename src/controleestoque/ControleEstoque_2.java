package controleestoque;

/**
 *
 * @author Cezarino Hora
 */
import java.util.Scanner;
public class ControleEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        try (Scanner scanner = new Scanner(System.in));

        System.out.println("### Controle de Estoque ###");

        // Cadastro do Produto
     
       System.out.print("Informe o codigo do produto: ");
       
         // Verificar se o próximo token é um número inteiro
 //       while (!scanner.hasNextInt()) {
//           System.out.println("Por favor, insira um código de produto válido (número inteiro).");
//            scanner.nextLine(); // Limpar o buffer
//            System.out.print("Informe o código do produto: ");
            int codigo = scanner.nextInt();
     
}
       scanner.nextLine();  // Limpar o buffer do scanner
       System.out.print("Informe a descricao do produto: ");
       String descricao = scanner.nextLine();

        Produto produto = new Produto(codigo, descricao);

        while (true) {
            // Menu
            System.out.println("\nAlternativas:");
            System.out.println("1. Estoque Atual");
            System.out.println("2. Entrada de Produtos");
            System.out.println("3. Saida de Produtos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma alternativa: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Estoque Atual
                    System.out.println("Estoque atual do produto: " + produto.getQuantidadeEmEstoque() + " unidades de " + produto.getDescricao() );
                    break;
                case 2:
                    // Entrada de Produtos
                    System.out.print("Informe a quantidade de entrada: ");
                    int entrada = scanner.nextInt();
                    produto.realizarEntrada(entrada);
                    break;
                case 3:
                    // Saída de Produtos
                    System.out.print("Informe a quantidade de saida: ");
                    int saida = scanner.nextInt();
                    produto.realizarSaida(saida);
                    break;
                case 4:
                    // Sair
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }
}
// scanner.close();