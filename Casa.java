public class Casa extends Edificacao{
    protected boolean condominio;

    
    //construtor
    public Casa(boolean condominio, float metragemTotal, String endereco, Engenheiro responsavel, int qtdUnidade) {    
        super(metragemTotal, endereco, responsavel, qtdUnidade);
        this.condominio = condominio;
    }
    
     //descricaoDoImovel()
    @Override
    public String descricaoDoImovel() {
        String descricao;
        
        descricao = "Eng. responsável: "+responsavel.getNome()+", CREA: "+responsavel.getCrea()+".\n";
        if (condominio) {
            descricao += "Condomínio.\n";
        }
        descricao += "Proprietário "+unidades[0].proprietario.nome+", CPF: "+unidades[0].proprietario.cpf+".\n";
        descricao += "Endereço: "+endereco+".\n";
        descricao += "Área da unidade residencial: "+unidades[0].metragemUnidade+".\n";
        descricao += "Número de quartos: "+unidades[0].numQuartos+", e "+unidades[0].numBanheiro+" banheiros.\n";
        descricao += "Área total da edificação: "+metragemTotal+".\n";
        
        
        return descricao;
    }
    //get e set
    public boolean isCondominio() {
        return condominio;
    }

    public void setCondominio(boolean condominio) {
        this.condominio = condominio;
    }

   
    
}
