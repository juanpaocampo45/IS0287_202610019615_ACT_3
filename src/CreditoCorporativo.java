public class CreditoCorporativo {

    private String id;
    private double montoPrestado;
    private double saldoPendiente;
    private double tasaInteres;
    private boolean esRiesgoso;

    
    public CreditoCorporativo(String id, double montoPrestado, double tasaInteres) {
        this.id = id;
        this.montoPrestado = montoPrestado;
        this.tasaInteres = tasaInteres;
        this.saldoPendiente = montoPrestado;
        actualizarRiesgo();
    }

    
    public CreditoCorporativo(String id, double montoPrestado, double tasaInteres, double saldoInicial) {
        this.id = id;
        this.montoPrestado = montoPrestado;
        this.tasaInteres = tasaInteres;
        this.saldoPendiente = saldoInicial;
        actualizarRiesgo();
    }

    
    public CreditoCorporativo(String id, double montoPrestado) {
        this.id = id;
        this.montoPrestado = montoPrestado;
        this.tasaInteres = 1.5;
        this.saldoPendiente = montoPrestado;
        actualizarRiesgo();
    }

    public double getSaldoPendiente() {
        return saldoPendiente;
    }

    public boolean isEsRiesgoso() {
        return esRiesgoso;
    }

    public void abonarCapital(double cantidad) {
        if (cantidad > 0) {
            saldoPendiente -= cantidad;

            if (saldoPendiente < 0) {
                saldoPendiente += cantidad;
                System.out.println("Operación rechazada: saldo no puede ser negativo.");
            }
        } else {
            System.out.println("Monto inválido.");
        }

        actualizarRiesgo();
    }

    public void capitalizarIntereses() {
        double interes = saldoPendiente * (tasaInteres / 100);
        saldoPendiente += interes;

        actualizarRiesgo();

        if (esRiesgoso) {
            System.out.println("⚠ ALERTA: Crédito riesgoso detectado.");
        }
    }

    private void actualizarRiesgo() {
        esRiesgoso = saldoPendiente > (montoPrestado * 1.2);
    }
}