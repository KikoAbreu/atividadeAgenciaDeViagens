package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.Conexao;
import model.Cliente;

public class ClienteDAO {
	
	private Object PreparedStatement;
	private Object stmt;
	

	//CREATE 
	public void createCliente (Cliente cliente) {
		String sql = "INSERT INTO Cliente(NomeCliente, EmailCliente, SenhaCliente) VALUES (?, ?, ?)";
		
		Connection connection = null;
		PreparedStatement = null;
		 
		try{
			//Criar uma conexao com o banco de dados
			connection = Conexao.createConnection();
			//para Executar a query
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmailCliente());
			stmt.setString(3, cliente.getSenha());
			
			stmt.executeUpdate();
			System.out.println("Cliente " + cliente.getNome() + " criado com Sucesso:");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try{ 
				if (stmt!=null) {
					((Connection) stmt).close();
				}
				if (connection!=null) {
					connection.close();
				}	
				} catch (Exception e){
					e.printStackTrace();
			}
		}
	}
	
	
	
	
	//READ
	public ArrayList<Cliente> readCliente (){
	 
		
		String sql = "SELECT * FROM Cliente";
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Connection connection = null;
		PreparedStatement stmt = null;
		
		//Classe que vai recuperar os dados do banco
		ResultSet rset = null;
		
		try {
			connection = Conexao.createConnection();			
			stmt = connection.prepareStatement(sql);			
			rset = stmt.executeQuery();
			
			while (rset.next()) {
				Cliente cliente = new Cliente();
				
				cliente.setId(rset.getInt("IdCliente"));
				cliente.setNome(rset.getString("NomeCliente"));
				cliente.setEmailCliente(rset.getString("EmailCliente"));
				
				 clientes.add(cliente);
			
			}
		 } catch (Exception e) {
				e.printStackTrace();
			}  
			return clientes;
		}

	
	//UPDATE
	public void updateCliente(Cliente cliente) {
		String sql = "UPDATE Cliente SET NomeCliente = ?, EmailCliente = ?, SenhaCliente = ?" + "WHERE IdCliente = ?";
        
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection = Conexao.createConnection();
			stmt = connection.prepareStatement(sql);
			
			
			//add values 
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmailCliente());
			stmt.setString(3, cliente.getSenha());
			
			stmt.setInt(4, cliente.getId());
			
			//executarQuery
			stmt.execute();
			System.out.println("Cliente" + cliente.getNome() + "Atualizado com Sucesso");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{ 
				if (stmt!=null) {
					stmt.close();
				}
				if (connection!=null) {
					connection.close();
				}	
				} catch (Exception e){
					e.printStackTrace();
			}
		}
		
	}

	
	//DELETE 
	public void deleteById (int id) {
		String sql = "DELETE FROM Cliente WHERE IdCliente = ?";
		
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection = Conexao.createConnection();
			stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, id);
			
			stmt.execute();
			System.out.println("Contato deletado com Sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt!=null) {
					stmt.close();
				} 
				
				if (connection!=null) {
					connection.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
		
		
} 

