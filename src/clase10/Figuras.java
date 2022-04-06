
package clase10;

import javax.swing.JOptionPane;

public class Figuras {
  public void cuadrado(){
      int lado,area;
      lado=Integer.parseInt(JOptionPane .showInputDialog("Ingrese el lado del cuadrado"));
      area=lado*lado;
      JOptionPane.showInputDialog(null,"El area del cuadrado es :"+ area);   
  }
  public void triangulo(){
        double base,altura,area;
        base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
        area=(base*altura)/2;
        JOptionPane.showInputDialog(null,"El area del triangulo es:"+ area);
  }
  public void circulo (){
      double radio,pi=3.14,area;
       radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el area del circulo"));
       area=pi*Math.pow(radio,2);
       JOptionPane.showInputDialog(null,"El area del circulo es:"+ area);
  }
}

