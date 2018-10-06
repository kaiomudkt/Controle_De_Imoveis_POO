public final class Predio extends Edificacao{
    private String nome;
    private int numAndares;
    private int apPorAndar;

    //construtor
    public Predio(String nome, int numAndares, int apPorAndar, float metragemTotal, String endereco, Engenheiro responsavel, int qtdUnidade) {
        super(metragemTotal, endereco, responsavel, qtdUnidade);
        this.nome = nome;
        this.numAndares = numAndares;
        this.apPorAndar = apPorAndar;
    }

    
    //descricao
    @Override
    public String descricaoDoImovel() {
        String descricao;
        descricao = "Prédio "+this.nome+".\nSituado à "+endereco+".\n";
        descricao += "Área total: "+metragemTotal+" metros quadrados.\n";
        descricao += "Respoensável: Eng. "+responsavel.getNome()+". CREA "+responsavel.getCrea()+".\n";
        descricao += "Número de andares: "+this.numAndares+".\n";
        descricao += "Número de apartamentos por andar: "+this.apPorAndar+",\n";
        for (int i = 0; i < unidades.length; i++) {//para cada apartamento do predio
            if (unidades[i]!=null) {
                descricao += "\nUnidade "+(i+1)+".\n";
                descricao += "Propriedade de "+unidades[i].proprietario.nome+", e CPF: "+unidades[i].proprietario.cpf+".\n";
                descricao += "Possui "+unidades[i].metragemUnidade+" metro quadrado, "+unidades[i].numQuartos+" quartos, "+unidades[i].numBanheiro+" banheiros.\n";
            }
        }
        return descricao;
    }
    
    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumAndares() {
        return numAndares;
    }

    public void setNumAndares(int numAndares) {
        this.numAndares = numAndares;
    }

    public int getApPorAndar() {
        return apPorAndar;
    }

    public void setApPorAndar(int apPorAndar) {
        this.apPorAndar = apPorAndar;
    }

    
    
}
