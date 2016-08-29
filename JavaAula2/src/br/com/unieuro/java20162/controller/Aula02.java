package br.com.unieuro.java20162.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Queue;
import java.util.Vector;

import br.com.unieuro.java20162.model.Estudante;

public class Aula02 {
	// nome do driver JDBC

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	// endereco URL do banco de dados

	static final String DB_URL = "jdbc:mysql://localhost/bd_ii_aula_1";

	// credenciais de acesso ao banco de dados

	static final String usuario = "root";

	static final String senha = "123456";

	public static void main(String[] args) {

		Connection conexao = null;
		Statement instrucao = null;
		String consulta = null;
		
		ArrayList<Estudante> listaEstudante = new ArrayList<Estudante> ();

		// Registrar o JDBC driver
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// Abrir uma conexao

			conexao = DriverManager.getConnection(DB_URL, usuario, senha);

			conexao.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);

			instrucao = conexao.createStatement();

			//consulta = "INSERT INTO ESTUDANTE VALUES ('dieice', 25, 'veterano', 'sistemas de informação')";

			//instrucao.execute(consulta);

			consulta = "SELECT * FROM ESTUDANTE";

			ResultSet conjuntoResultado = instrucao.executeQuery(consulta);

			// Extrair os resultados do conjunto resultado
			if (!conjuntoResultado.next()) {
				System.out.println("A tabela estudante está vazia");
			} else {
				do {
					// Recuperar todos os dados de acordo com cada linha
					// retornada
					// pelo resultado.

					String nome_do_estudante = conjuntoResultado.getString("nome_do_estudante");
					int id_estudante = conjuntoResultado.getInt("id_estudante");
					String senioridade = conjuntoResultado.getString("senioridade");
					String graduacao = conjuntoResultado.getString("graduação");

					Estudante estudante = new Estudante(nome_do_estudante, id_estudante, senioridade, graduacao);
	
					listaEstudante.add(estudante);


				} while (conjuntoResultado.next());
			}

			conjuntoResultado.close();
			instrucao.close();
			conexao.close();
		} catch (SQLException sqlException) {
			System.out.println(sqlException);
		} catch (ClassNotFoundException classNotFoundException) {
			System.out.println(classNotFoundException);
		}

		
		//Java 1 - Enumerator
		
		Enumeration e = new Vector<Estudante>(listaEstudante).elements();
		
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		//Java 2 - Iterator
		Iterator<Estudante> it = listaEstudante.iterator();
		
		while (it.hasNext())
		{
			Estudante estudante = it.next();
			System.out.println(estudante);
		}
		
		//Java 5 - Generics
		for (Estudante estudante : listaEstudante) {
			System.out.println(estudante);
		}
								
		// Java 8 - Programação Funcional
		listaEstudante.forEach(estudante -> System.out.println(estudante));
		
	}
	
	

}
