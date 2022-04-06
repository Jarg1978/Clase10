package poo;

import javax.swing.JOptionPane;

public class PrincipalColaborador {

    public static void main(String[] args) {
        Colaborador datos = new Colaborador();
        datos.setNombre(JOptionPane.showInputDialog("Digite el nombre del colaborador"));
        datos.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del colaborador")));
        datos.setGenero(JOptionPane.showInputDialog("Digite ele genero M o F").charAt(0));
        datos.setSalario((JOptionPane.showInputDialog("Digite EL Salario del colaborador")));
        datos.setPuesto(JOptionPane.showInputDialog("Digite el Puesto del colaborador"));
        datos.setDepartamento(JOptionPane.showInputDialog("Digite el deparatamento del colaborador"));
        datos.MostrarDatos();
    }

}
