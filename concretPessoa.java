public class concretPessoa implements IfactoryPessoa {

    @Override
    public APessoa getPessoa(String nome, String sexo) {
        if(sexo.equals("M")){
            return new Homem(nome, sexo);
        }
        else{
            return new Mulher(nome, sexo);
        }
    }      
}
