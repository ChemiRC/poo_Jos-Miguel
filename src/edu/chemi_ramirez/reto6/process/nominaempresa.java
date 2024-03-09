package edu.chemi_ramirez.reto6.process;

public class nominaempresa {
}
import java.util.ArrayList;

class NominaEmpresa {
    private ArrayList<Empleado> empleados;

    public NominaEmpresa() {
        empleados = new ArrayList<>();
    }

    public void AgregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public double CalcularTotalNomina() {
        double totalNomina = 0;
        for (Empleado empleado : empleados) {
            totalNomina += empleado.CalcularSueldoNormal() + empleado.CalcularSueldoExtra();
        }
        return totalNomina;
    }

    public double CalcularTotalSueldoNormal() {
        double totalSueldoNormal = 0;
        for (Empleado empleado : empleados) {
            totalSueldoNormal += empleado.CalcularSueldoNormal();
        }
        return totalSueldoNormal;
    }

    public double CalcularTotalSueldoExtra() {
        double totalSueldoExtra = 0;
        for (Empleado empleado : empleados) {
            totalSueldoExtra += empleado.CalcularSueldoExtra();
        }
        return totalSueldoExtra;
    }

    public int CalcularTotalHorasLaboradas() {
        int totalHorasLaboradas = 0;
        for (Empleado empleado : empleados) {
            totalHorasLaboradas += empleado.CalcularTotalHoras();
        }
        return totalHorasLaboradas;
    }

    public int TotalPersonasConHorasExtras() {
        int count = 0;
        for (Empleado empleado : empleados) {
            if (empleado.getHorasExtras() > 0) {
                count++;
            }
        }
        return count;
    }

    public int TotalPersonasSinHorasExtras() {
        return empleados.size() - TotalPersonasConHorasExtras();
    }
}
