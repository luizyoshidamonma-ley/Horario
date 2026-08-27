package modelo;

public class TesteMesmoPacote {
    public void realizarTeste(){
        Funcionario fun = new Funcionario(4000,"Carlos",1234,"UniFil");
        System.out.println(fun.empresa);    // é executado pq ta na mesma classe e é public (funciona pra todos (o public))
        System.out.println(fun.nome);   // é executado pq ta na mesma classe e é protected
        System.out.println(fun.codigoInterno);  // tmb é
        fun.apresentarCodigoInterno();
        System.out.println(fun.getCodigoInterno());

    }
}
