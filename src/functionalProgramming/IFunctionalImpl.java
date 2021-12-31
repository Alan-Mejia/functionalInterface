package functionalProgramming;

public class IFunctionalImpl implements IFunctional{

    @Override
    public void saludo(String param) {
        System.out.println("Hola soy de Mexico y mi nombre es: " + param);
    }
}
