public class GestorDeCobranza {

    
    public void intentarLiquidacionMaliciosa(CreditoCorporativo c) {

        

        System.out.println("Acceso directo bloqueado por encapsulamiento.");

        c.abonarCapital(-500);
    }

    public void aplicarAlivioFinanciero(CreditoCorporativo c) {

        double mitad = c.getSaldoPendiente() / 2;
        c.abonarCapital(mitad);
    }
}