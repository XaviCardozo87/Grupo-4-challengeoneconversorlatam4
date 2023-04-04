package principal;

import java.awt.Component;

import javax.swing.JOptionPane;

import conversorMonedas.function;
import conversorTemperatura.functionTemperatura;

public class Principal {
    private static final Component NULL = null;
	public static void main (String[] args) {

        function monedas = new function();
        functionTemperatura temperatura = new functionTemperatura();
             
        while(true) {
        	
        	String opciones = (JOptionPane.showInputDialog(NULL, "Seleccione una opción de conversión ", "Conversor De Monedas by Xavi Cardozo", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();

        	switch(opciones) {
        	case "Conversor de Moneda":
        		 String Ingreso = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                 if(ValidarNumero(Ingreso) == true) {
                     double Minput = Double.parseDouble(Ingreso);
                     monedas.ConvertirMonedas(Minput);

                     int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                     if (JOptionPane.OK_OPTION == respuesta){
                     	System.out.println("Selecciona opción Afirmativa");
                     }else{
                        	JOptionPane.showMessageDialog(null, "Programa terminado");                         
                     }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");                
                    }
                     	break;
        	

        	 case "Conversor de Temperatura":
        	 Ingreso = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
             if(ValidarNumero(Ingreso) == true) {
                 double Minput = Double.parseDouble(Ingreso);
                 temperatura.ConvertirTemperatura(Minput);

                 int respuesta = 0;
                 respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                 if((respuesta == 0) && (ValidarNumero(Ingreso) == true)) { 
                 } else {
                     JOptionPane.showMessageDialog(null, "Programa terminado");                     
                 }

             } else {
                 JOptionPane.showMessageDialog(null, "Valor inválido");                
             }
             break;
        }                
    }
               
  }
    private static void setTitle(String string) {
		// TODO Auto-generated method stub
		
	}
	public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}