/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadoraveiculos;

import Apresentacao.TelaInicial;

/**
 *
 * @author Yan
 */

public class Funcionario {
    private String nome;
    private String usuario;
    private String senha;

    public Funcionario(String nome, String usuario, String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Funcionario() {
        
    }
    
    public void acessarConta() {
        TelaInicial telaInicial = new TelaInicial(); // Instancia a tela inicial
        telaInicial.setVisible(true); // Mostra a tela inicial
        
    }

    public boolean verificarCredenciais(String usuarioDigitado, String senhaDigitada) {
        return this.usuario.equals(usuarioDigitado) && this.senha.equals(senhaDigitada);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
