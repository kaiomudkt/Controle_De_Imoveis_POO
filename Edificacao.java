public abstract class Edificacao {
    protected float metragemTotal;
    protected String endereco;
    Engenheiro responsavel;
    UnidadeResidencial [] unidades;
    //construtor
    public Edificacao(float metragemTotal, String endereco, Engenheiro responsavel, int qtdUnidade){
        this.metragemTotal = metragemTotal;
        this.endereco = endereco;
        this.responsavel = responsavel;
        if (qtdUnidade>=1) {
            this.unidades = new UnidadeResidencial[qtdUnidade];
        }else{
            System.out.println("VALOR PARA QUATIDADE DE UNIDADE DEVE SER MAIOR QUE ZERO");
        }
    }

    //
    public boolean cadastrarUnidade(UnidadeResidencial novaUnidade) {
        for (int i = 0; i < unidades.length; i++) {
            if (unidades[i]==null) {//se posicao estiver nula
                unidades[i] = novaUnidade;//armazena nova unidade nesta posicao
                return true;//retorno do metodo é TRUE, e o metodo é finalizado nesse momento
            }
        }
        return false;
    }
    
    public abstract String descricaoDoImovel();
    
    
    //set e get
    public float getMetragemTotal() {
        return metragemTotal;
    }

    public void setMetragemTotal(float metragemTotal) {
        this.metragemTotal = metragemTotal;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Engenheiro getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Engenheiro responsavel) {
        this.responsavel = responsavel;
    }

    public UnidadeResidencial[] getUnidades() {
        return unidades;
    }

    
    
    
    
}
