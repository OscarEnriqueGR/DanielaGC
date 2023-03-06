import java.util.Scanner;

public class App_para_definir_Estado_Corporal {
    
    public static void main (String [] args) {
       Scanner entrada = new Scanner (System.in);
       System.out.println ("Insertar peso");
       double peso = entrada.nextDouble();
        if (peso >= 85){
            System.out.println("Estas Gordo");
        }
        else if (peso<85 && peso>=70){
            System.out.println("Estas Normal");
        }
        else if (peso<70 && peso>=55){
            System.out.println("Estas Delgado");
        }
        else{
            System.out.println("Estas Muy Delgado");
        }
    }
}
