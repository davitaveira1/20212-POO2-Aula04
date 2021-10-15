package Aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex1 {
    
    public static void main(String[] args) {
        
        Connection con;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/poo2-producao", "root", "");
            Statement st = con.createStatement();
            String sql = "insert into usuarios (login,senha) values ('Daniel','555')";
            st.execute(sql);
            System.out.println("Dados inseridos com sucesso!");
            st.close();
            con.close();
            
            
            
        } catch (Exception e) {
            System.out.println("Erro: "+e);
        }
        
    }
    
}
