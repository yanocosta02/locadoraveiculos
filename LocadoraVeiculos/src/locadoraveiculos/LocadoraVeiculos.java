/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locadoraveiculos;

import Apresentacao.TelaLogin;
import Controladores.Locadora;

/**
 *
 * @author Yan
 */
public class LocadoraVeiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locadora locadora = Locadora.getInstance();
        // Cria uma instância da tela de login
        TelaLogin telaLogin = new TelaLogin(locadora);

        // Torna a tela de login visível
        telaLogin.setVisible(true);
    }
    
}
