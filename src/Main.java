public class Main {

    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("João");

        pessoa1.setCPF("123456789");

        // ... definir outros atributos para pessoa1


        Piloto piloto1 = new Piloto();

        piloto1.setNome("Carlos");

        piloto1.setCPF("987654321");




        Balao balao1 = new Balao();

        balao1.setNumeroIdentificacao("B123");

        balao1.setRegistroRegularidade("ABC123");




        TermoCiencia termoCiencia1 = new TermoCiencia();

        termoCiencia1.setPessoa(pessoa1);


        VooBalao vooBalao1 = new VooBalao();

        vooBalao1.setPiloto(piloto1);

        vooBalao1.setBalao(balao1);

        vooBalao1.setTermoCiencia(termoCiencia1);

        vooBalao1.setValorVoo(300.00);

    }
}