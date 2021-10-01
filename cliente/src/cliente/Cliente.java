
package cliente;

import java.util.Scanner;



public class Cliente {

  
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
        
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce tu Sexo (H=hombre y M=mujer)");
        char sexo = teclado.next().charAt(0);
        
        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();
        
        if(sexo=='H'){
            System.out.println("Eres un hombre");
        }else if (sexo=='M'){ 
            System.out.println("Eres una mujer");
        }
        
        
        if (edad>=18){ 
            System.out.println("Eres mayor de edad");
        }else { 
            System.out.println("Eres menor de edad");
        }
        
            Scanner sc=new Scanner (System.in);
        float kg,mts,imc,x;
        System.out.print("Cual es tu peso? (Kg) ");
        kg=sc.nextFloat();
        System.out.print("Cual es tu altura? (mts) ");
        mts=sc.nextFloat();
        imc=mts*mts;
        x=kg/imc;
        System.out.println("Tu indice de masa corporal es: "+x);
        if(x<=18){
            System.out.println("Peso Bajo, Consulta un nutriologo");
        }else if(x>=18 && x<=24.9){
            System.out.println("Felicidades!! Tu peso es normal");
        }else if(x>=25 && x<=26.9){
            System.out.println("Padeces sobrepeso");
        }else if(x>=27 && x<=29.9){
            System.out.println("Obesidad nivel 1");
        }else if(x>=30 && x<=39.9){
            System.out.println("Obesidad nivel 2");
        }else if(x>=40){
            System.out.println("Obesidad nivel 3");
            
            
        }
    }
    
}
