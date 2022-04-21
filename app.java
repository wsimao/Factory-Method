public class app {
    public static void main(String[] args) {
        
        concretPessoa methodFactory = new concretPessoa();

        String nome = "Wallison";
        String sexo = "M";

        methodFactory.getPessoa(nome, sexo);

        nome = "Antonia";
        sexo = "F";

        methodFactory.getPessoa(nome, sexo);
        
    }
}
