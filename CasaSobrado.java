public class CasaSobrado extends Casa{
    private int numAndares;

    public CasaSobrado(int numAndares, boolean condominio, float metragemTotal, String endereco, Engenheiro responsavel, int qtdUnidade) {
        super(condominio, metragemTotal, endereco, responsavel, qtdUnidade);
        this.numAndares = numAndares;
    }
    
    
    
    //getters e setters
    public int getNumAndares() {
        return numAndares;
    }

    public void setNumAndares(int numAndares) {
        this.numAndares = numAndares;
    }

   
    
}
