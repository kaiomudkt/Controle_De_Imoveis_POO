public class UnidadeResidencial {
    protected float metragemUnidade;
    protected int numQuartos;
    protected int numBanheiro;
    protected Pessoa proprietario;
    
    //construtor
    public UnidadeResidencial(float metragemUnidade, int numQuartos, int numBanheiro, Pessoa proprietario) {
        this.metragemUnidade = metragemUnidade;
        this.numQuartos = numQuartos;
        this.numBanheiro = numBanheiro;
        this.proprietario = proprietario;
    }
    

    //getters setters
    public float getMetragemUnidade() {
        return metragemUnidade;
    }

    public void setMetragemUnidade(float metragemUnidade) {
        this.metragemUnidade = metragemUnidade;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public int getNumBanheiro() {
        return numBanheiro;
    }

    public void setNumBanheiro(int numBanheiro) {
        this.numBanheiro = numBanheiro;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
    
    
}
