package functionalProgramming;

public class Main {
    public static void main(String[] args){

        //Necesitamos crear una clase forzosamente para la utilizacion del metodo
        IFunctionalImpl saludoUno = new IFunctionalImpl();
        saludoUno.saludo("Alan");

        //No necesitamos crear una clase pero necesitamos escribir todo el cuerpo del metodo
        IFunctional saludoDos = new IFunctional() {
            @Override
            public void saludo(String param) {
                System.out.println("Hola yo soy extranjero y mi nombre es: " + param);
            }
        };
        saludoDos.saludo("Atoine");

        //Utilizando funciones Lambda podemos realizar la implementacion del metodo de una Interfaz funcional
        IFunctional saludoTres = (param)->{
            System.out.println("Hello I am from the United States my name is: " + param);
        };

        saludoTres.saludo("Jorch");




    }
}
