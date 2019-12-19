package classe;
public class Usuarios {
    private String IdUsuario;
    private String nome;
    private String sobrenome;
    private String senha;
    private String perfil;

    public Usuarios(String IdUsuario, String nome, String sobrenome, String senha, String perfil) {
        this.IdUsuario = IdUsuario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    
    
}
