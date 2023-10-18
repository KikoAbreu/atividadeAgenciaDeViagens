package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import connection.Conexao;
import model.Cliente;
import model.Destino;

public class DestinoDAO {
	
	

	//CREATE
	public void createDestino (Destino destino) {
		String sql = "INSERT INTO Destino (NomeDestino) VALUES (?)";
		
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection = Conexao.createConnection();
			stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, destino.getNomeDestino());
			stmt.execute();
			System.out.println("Novo destino cadastrado com sucesso!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}	
			
				if (stmt!= null) {
					stmt.close();
				} 	
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	//READ 
	public ArrayList<Destino> readDestinos(){
	 
		
		String sql = "SELECT * FROM Destino";
		ArrayList<Destino> destinos = new ArrayList<Destino>();
		
		Connection connection = null;
		PreparedStatement stmt = null;
		
		ResultSet rset = null;
		
		try {
			connection = Conexao.createConnection();			
			stmt = connection.prepareStatement(sql);			
			rset = stmt.executeQuery();
			
			while (rset.next()) {
				Destino destino = new Destino();
				
				destino.setIdDestino(rset.getInt("IdDestino"));
				destino.setNomeDestino(rset.getString("NomeDestino"));
				
				
				 destinos.add(destino);
			
			}
		 } catch (Exception e) {
				e.printStackTrace();
			}  
			return destinos;
	
	}

	
	//UPDATE 
	public void updateDestino (Destino destino) {
		String sql = "UPDATE Destino SET NomeDestino = ? WHERE IdDestino = ?";
		
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection = Conexao.createConnection();
			stmt = connection.prepareStatement(sql);
			
			
			//add values 
			stmt.setString(1, destino.getNomeDestino());
			stmt.setInt(2, destino.getIdDestino());
			
			//executarQuery
			stmt.execute();
			System.out.println("Cliente" + destino.getNomeDestino() + "Atualizado com Sucesso");
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}


	//DELETE
	public void deleteDestino (int id) {
		String sql = "DELETE FROM Destino WHERE IdDestino = ?";
		
		Connection connection = null;
		PreparedStatement stmt = null;
		
		try {
			connection = Conexao.createConnection();
			stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, id);
			
			stmt.execute();
			System.out.println("Destino deletado com Sucesso!");
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
	
