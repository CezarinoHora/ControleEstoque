package controleestoque;

/**
 *
 * @author Cezarino Hora
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class Produto {
    private int codigo;
    private String descricao;
    private int quantidadeEmEstoque;

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidadeEmEstoque = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void realizarEntrada(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            System.out.println("Entrada de " + quantidade + " unidades de " + descricao   + " realizada com sucesso.");
        } else {
            System.out.println("A quantidade de entrada deve ser maior que zero.");
        }
    }

    public void realizarSaida(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Saida de " + quantidade + " unidades realizada com sucesso.");
        } else {
            System.out.println("Quantidade insuficiente em estoque para dar saida.");
        }
    }
        public static int lerIntComValidacao(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada invalida. Por favor, insira um numero inteiro.");
                scanner.nextLine();  // Limpar o buffer do scanner
            }
        }
    }

}
