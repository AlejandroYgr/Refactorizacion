import java.util.List;

// Código con un "code smell" (Método Largo)
public class CodeSmell {
    public double calcularPrecioTotal(List<Double> precios, double tasaImpuestos) {
        double precioTotal = calcularSuma(precios);
        double precioTotalConImpuestos = calcularPrecioTotalConImpuestos(precioTotal, tasaImpuestos);
        return precioTotalConImpuestos;
    }

    private double calcularSuma(List<Double> precios) {
        double suma = 0;
        for (Double precio : precios) {
            suma += precio;
        }
        return suma;
    }

    private double calcularPrecioTotalConImpuestos(double precioTotal, double tasaImpuestos) {
        double montoImpuestos = precioTotal * tasaImpuestos;
        double precioTotalConImpuestos = precioTotal + montoImpuestos;
        return precioTotalConImpuestos;
    }
}