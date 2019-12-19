package classe;


public class Dados {
    
    private Usuarios Musuario[] = new Usuarios[500];
    private  int contUsuario = 0;
    public Dados(){
        Usuarios usuario = new Usuarios ("paulo","paulo1","paulo","123","1"); 
        Musuario[contUsuario]= usuario;
        contUsuario++;
    }
    
    public Usuarios[] getUsuarios(){
        return Musuario;
    }
    public boolean validarUsuario (String usuario, String senha)
    {
        boolean x = false;
        for(int i = 0; i<contUsuario; i++){
            if(Musuario[i].getIdUsuario().equals(usuario)&& Musuario[i].getSenha().equals(senha))
            {
                return true;
            }
        }
        return false;
    }
}
