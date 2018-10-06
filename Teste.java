public class Teste {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Alex", "777.777.777-77");        
        UnidadeResidencial uniResiden = new UnidadeResidencial(200, 4, 2, pessoa);
        Engenheiro eng = new Engenheiro(1234, "Rodolfo", "000.000.000.00");
        
        
        
        // PREDIO
        Predio predio = new Predio("Dom Quixote", 10, 1, 1111.0f, "Rua tal", eng, 10);
        
        Pessoa pessoa2 = new Pessoa("Elis", "123.123.123-12");
        UnidadeResidencial uniResiden2 = new UnidadeResidencial(400, 2, 1, pessoa2);
        Pessoa pessoa3 = new Pessoa("Adriana", "987.987.987-98");
        UnidadeResidencial uniResiden3 = new UnidadeResidencial(250, 2, 1, pessoa3);
        predio.cadastrarUnidade(uniResiden);
        predio.cadastrarUnidade(uniResiden2);
        predio.cadastrarUnidade(uniResiden3);
        System.out.println(predio.descricaoDoImovel());
        
        // TERREA
        /*
        CasaTerrea terrea = new CasaTerrea(true, 500.0f, "Rua Jose", eng, 1);
        terrea.cadastrarUnidade(uniResiden);
        System.out.println(terrea.descricaoDoImovel());
        */
        
        // SOBRADO
        /*
        CasaSobrado sobrado = new CasaSobrado(2, false, 1000.0f, "Rua Santo Amaral", eng, 1);
        sobrado.cadastrarUnidade(uniResiden);
        System.out.println(sobrado.descricaoDoImovel());
        */
    }
}
