package supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Cliente> cliente = new ArrayList<>();
        BuscaCliente buscaCliente;
        Scanner scan = new Scanner(System.in);

        cliente.add(new Cliente("Amanda", "Lobo", 1));
        cliente.add(new Cliente("Rafael", "Gomes", 2));
        cliente.add(new Cliente("Leticia","Amaral", 3));

        System.out.println("Dados de todos os clientes:");
        cliente.stream()
                .forEach(System.out::println);

        System.out.println("\nRemovendo um cliente:");
        cliente.remove(1);
        cliente.stream()
                .forEach(System.out::println);

        try{
            System.out.print("\nPara buscar um cliente, insira o ID: ");
            int id = scan.nextInt();
            cliente.get(id);
            if (cliente != null){
                System.out.println(cliente);
            } else{
                System.out.println("Cliente não encontrado!");
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Cliente não encontrado!");
        }

    }
}
