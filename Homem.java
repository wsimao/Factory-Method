public class Homem extends APessoa {

    public Homem(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
        System.out.println("=========================================");
        System.out.println("Olá seja vem vindo Senhor "+this.nome);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("=========================================");
    }
}
