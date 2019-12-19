package classe;

import formularios.Login;

public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dados clsdados = new Dados();
        Login login = new Login();
        login.setdados(clsdados);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
}
