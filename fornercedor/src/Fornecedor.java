public class Fornecedor {
    private String fone, nome;

    public Fornecedor(String fone, String nome) {
        this.fone = fone;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }


}
