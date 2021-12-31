package exercise;

public class Main {
    public static void main(String[] args){

        IFunctional factorial = (parameter)->{
            Integer result=1;
            for(int i=1;i<=(int)parameter;i++){
                result*=i;
            }
            return result;
        };

        IFunctional sum = (pameter)->{
          Integer result = 0;
          for(int i=1;i<=(int)pameter;i++){
              result+=i;
          }
            return result;
        };

        System.out.println(sum.complexOperation(5));
        System.out.println(factorial.complexOperation(5));


    }
}
