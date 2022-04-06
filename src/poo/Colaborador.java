
package poo;

import javax.swing.JOptionPane;

public class Colaborador extends Persona  {
 private String puesto;
 private String departamento;
 private String salario;
  
 public Colaborador (){
         
 } 

    public Colaborador(String puesto, String departamento, String salario, String nombre, int edad, char genero) {
        super(nombre, edad, genero);// atributos heredados
        this.puesto = puesto;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
 
    public void MostrarDatos (){
        
        JOptionPane.showMessageDialog(null,"El nombre es :"+getNombre()
        +"\n La edad es :"+getEdad()
        +"\n El genero es :"+getGenero()
        +"\n El Salario es :"+salario
        +"\n El Puesto es :"+puesto
        +"\n El departamento es :"+departamento);        
                
    }
}
