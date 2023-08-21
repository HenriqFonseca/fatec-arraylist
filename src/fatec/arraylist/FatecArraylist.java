package fatec.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FatecArraylist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> lista = new ArrayList<>();

        int numero;
        do {
            System.out.println("O que deseja fazer?\n"
                    + " 0 - Sair\n"
                    + " 1 - Cadastrar cliente\n"
                    + " 2 - Listar Clientes\n"
                    + " 3 - Buscar cliente\n"
                    + " 4 - Acrescentar insumos e custos\n"
                    + " 5 - Relatórios\n");
            numero = sc.nextInt();
            switch (numero) {
                case 0:
                    System.out.println("Obrigado por utilizar");
                    break;

                case 1:
                    String nome, cpf;
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Insira o nome do cliente:");
                        nome = sc.next();
                        System.out.println("Insira o CPNJ do cliente:");
                        cpf = sc.next();
                        lista.add(new Cliente(nome, cpf));
                    }
                    break;
                case 2:
                    int tamanhoLista = lista.size();
                    System.out.println("Clientes:");
                    for (int i = 0; i < tamanhoLista; i++) {
                        System.out.printf("Código da empresa: %d: %s\n", (i + 1), lista.get(i));

                    }
                    break;
                case 3:
                    System.out.println("Insira o codigo da empresa da empresa");

                    int busca;
                    busca = sc.nextInt();
                    busca = busca - 1;
                    int i = 0;

                    for (Cliente cli : lista) {
                        if (busca == i) {
                            System.out.println("Código da empresa: " + (i + 1));
                            System.out.println(cli);
                        }

                        i++;
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (numero != 0);

    }

}
