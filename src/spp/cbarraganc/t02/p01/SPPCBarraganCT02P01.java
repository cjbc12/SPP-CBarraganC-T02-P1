/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cbarraganc.t02.p01;
import java.util.Scanner;

/**
 *
 * @author Carlos Javier Barragán Carrión
 * Matrícula: A01410357
 * Carrera: IMT
 */
public class SPPCBarraganCT02P01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double  sue, he, pay; 
    int cate;
    Scanner kb = new Scanner(System.in);
    
        
        System.out.println("************************");
        System.out.println("Calculadora de pagos.");
        System.out.println("************************");
        System.out.println("\nEscoger categoría del trabajador:");
        
        cate = kb.nextInt();
        
        switch(cate){
            case 1:
                System.out.println("Favor de introducir sueldo básico:");
                sue = kb.nextDouble();
                System.out.println("Introducir horas extras trabajadas");
                he = kb.nextDouble();
                pay = sue+(he*30);
                System.out.println("El pago correspondiente debe ser de: $"+ pay +"0 MXN");
                break;
                
            case 2:
                System.out.println("Favor de introducir sueldo básico:");
                sue = kb.nextDouble();
                System.out.println("Introducir horas extras trabajadas");
                he = kb.nextDouble();
                pay = sue+(he*38);
                System.out.println("El pago correspondiente debe ser de: $"+ pay +"0 MXN");
                break;
                
            case 3:
                System.out.println("Favor de introducir sueldo básico:");
                sue = kb.nextDouble();
                System.out.println("Introducir horas extras trabajadas");
                he = kb.nextDouble();
                pay = sue+(he*50);
                System.out.println("El pago correspondiente debe ser de: $"+ pay +"0 MXN");
                break;
                        
            case 4:
                System.out.println("Favor de introducir sueldo básico:");
                sue = kb.nextDouble();
                System.out.println("Introducir horas extras trabajadas");
                he = kb.nextDouble();
                pay = sue+(he*70);
                System.out.println("El pago correspondiente debe ser de: $"+ pay +"0 MXN");
                break;
                
            case 5:
                System.out.println("Favor de introducir sueldo básico:");
                sue = kb.nextDouble();
                System.out.println("Introducir horas extras trabajadas");
                he = kb.nextDouble();
                pay = sue+(he*80);
                System.out.println("El pago correspondiente debe ser de: $"+ pay +"0 MXN");
                break;
                
            case 6:
                System.out.println("Favor de introducir sueldo básico:");
                sue = kb.nextDouble();
                System.out.println("Introducir horas extras trabajadas");
                he = kb.nextDouble();
                pay = sue+(he*85);
                System.out.println("El pago correspondiente debe ser de: $"+ pay +"0 MXN");
                break;
                        
            case 7:
                System.out.println("Favor de introducir sueldo básico:");
                sue = kb.nextDouble();
                System.out.println("Introducir horas extras trabajadas");
                he = kb.nextDouble();
                pay = sue+(he*92);
                System.out.println("El pago correspondiente debe ser de: $"+ pay +"0 MXN");
                break;
                
            case 8:
                System.out.println("Favor de introducir sueldo básico:");
                sue = kb.nextDouble();
                System.out.println("Introducir horas extras trabajadas");
                he = kb.nextDouble();
                pay = sue+(he*120);
                System.out.println("El pago correspondiente debe ser de: $"+ pay +"0 MXN");
                break;
            default:
                System.out.println("No existe esta categoría.");
                      
                                    
        }
            
    }
        
}
