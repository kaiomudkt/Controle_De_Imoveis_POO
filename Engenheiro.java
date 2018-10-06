public final class Engenheiro extends Pessoa{
    private int crea;
    
    //construtor
    public Engenheiro(int crea, String nome, String cpf) {
        super(nome, cpf);
        this.crea = crea;
    }
    
    //get e set
    public int getCrea() {
        return crea;
    }

    public void setCrea(int crea) {
        this.crea = crea;
    }
}
