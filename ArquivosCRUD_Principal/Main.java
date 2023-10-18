package Principal;

import connection.*;
import model.*;

import java.sql.Connection;
import java.util.*;

import DAO.ClienteDAO;
import DAO.DestinoDAO;

public class Main {

	

	public static void main(String[] args) {
		
		Conexao connection = new Conexao();
		Conexao.createConnection();
		Scanner scanner = new Scanner(System.in);
		ClienteDAO clienteDAO = new ClienteDAO();
		DestinoDAO destinoDAO = new DestinoDAO();
		
		int option = 0;
		
		do {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("       Menu Bora La Viagens");
            System.out.println("     Escolha a opcao desejada: \n"
            		+ "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n"
                    + "1 - Cadastrar novo cliente (Create)\n"
                    + "2 - Listar todos os clientes (Read)\n"
                    + "3 - Atualizar cliente (Update)\n"
                    + "4 - Apagar cliente (Delete)\n"
                    + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n"
                    + "5 - Cadastrar novo destino (Create)\n"
                    + "6 - Listar todos os destinos (Read)\n"
                    + "7 - Atualizar destino (Update)\n"
                    + "8 - Apagar destino (Delete)\n"
                    + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n"
                    + "9 - Sair: \n");
            
            option = scanner.nextInt();
            
            switch (option) {
            case 1:
                scanner.nextLine();
                
                Cliente cliente = new Cliente();
                
                System.out.println("Nome Completo: ");
                cliente.setNome(scanner.nextLine());
                
                System.out.println("E-mail: ");
                cliente.setEmailCliente(scanner.nextLine().trim()); //trim para eliminar os espacos
                
                System.out.println("Senha: ");
                cliente.setSenha(scanner.nextLine().trim());
                
                clienteDAO.createCliente(cliente);

                break;
                
            case 2: 
            	for (Cliente c : clienteDAO.readCliente()) {
            		System.out.println("========================");
            		System.out.println("Cliente: " + c.getNome());
            		System.out.println("ID: " + c.getId());
            		System.out.println("E-mail: " + c.getEmailCliente());            		
            	}
            	
            	break;
            case 3: 
            	scanner.nextLine();
            	
                Cliente clienteAtualizado = new Cliente();
                
                System.out.println("Nome Completo: ");
                clienteAtualizado.setNome(scanner.nextLine());
                
                System.out.println("E-mail: ");
                clienteAtualizado.setEmailCliente(scanner.nextLine().trim()); //trim para eliminar os espacos
                
                System.out.println("Senha: ");
                clienteAtualizado.setSenha(scanner.nextLine().trim());
                
                System.out.println("Id do Cliente a ser atualizado: ");
                clienteAtualizado.setId(scanner.nextInt());

                clienteDAO.updateCliente(clienteAtualizado);
            	break;
            case 4:
            	System.out.println("Digite o ID do Cliente a ser Deletado");
            	int deletar = scanner.nextInt();
            	clienteDAO.deleteById(deletar);
            	break;
            case 5:
            	scanner.nextLine();
            	
            	Destino destino = new Destino();
            	
            	System.out.println("Digite um destino para cadastrar: ");
            	destino.setNomeDestino(scanner.nextLine());
            	
            	destinoDAO.createDestino(destino);
            	break;
            case 6:
            	for (Destino c : destinoDAO.readDestinos()) {
            		System.out.println("========================");
            		System.out.println("Destino: " + c.getNomeDestino());
            		System.out.println("ID: " + c.getIdDestino());
            		}
            	
            	break;
            case 7: 
            	scanner.nextLine();
            	
                Destino destinoAtualizado = new Destino();
                
                System.out.println("Novo Nome do Destino: ");
                destinoAtualizado.setNomeDestino(scanner.nextLine());
                
                System.out.println("Id do Destino a ser atualizado: ");
                destinoAtualizado.setIdDestino(scanner.nextInt());
                
            	destinoDAO.updateDestino(destinoAtualizado);
            	break;
            case 8:
            	System.out.println("Digite o ID do Destino a ser Deletado");
            	int delete = scanner.nextInt();
            	destinoDAO.deleteDestino(delete);
            	break;
            case 9:
            	System.out.println("Obrigado por escolher a Bora La Viagens!");
            	break;
            default: 
            	System.out.println("Opcao nao encontrada, tente novamente!");
            }
            
		} while (option != 9);
	}	
}

