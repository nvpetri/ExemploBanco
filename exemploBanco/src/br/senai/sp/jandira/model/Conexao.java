package br.senai.sp.jandira.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private String servidor, senha, user, banco;
    private int porta;

    public Connection conexao;
    public Conexao(){
        this.servidor = "127.0.0.1";
        this.banco = "db_empresa";
        this.user = "root";
        this.senha = "bcd127";
        this.porta = 3306;
    }

    public boolean connectDrive(){
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" +
                    this.servidor + "/" + this.banco, this.user, this.senha);
            return true;
        }catch (Exception erro){
            System.out.println(erro);
            return false;
        }
    }

    public Connection getConnection(){
        connectDrive();
        return conexao;
    }
}
