package br.senai.sp.jandira.model;

public class Conexao {

    private String servidor, senha, user, banco;
    private int porta;
    public Conexao(){
        this.servidor = "localhost";
        this.banco = "db_empresa";
        this.user = "root";
        this.senha = "bcd127";
        this.porta = 3306;
    }

    public boolean connectDrive(){
        
    }
}
