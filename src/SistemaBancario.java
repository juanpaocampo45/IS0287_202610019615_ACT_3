public class SistemaBancario {

    public static void main(String[] args) {

        
        CreditoCorporativo credito =
                new CreditoCorporativo("CORP-99", 10000, 5);

        
        for (int i = 0; i < 5; i++) {
            credito.capitalizarIntereses();
        }

      
        System.out.println("¿Riesgoso? " + credito.isEsRiesgoso());

        
        System.out.println("Saldo antes: " + credito.getSaldoPendiente());

        GestorDeCobranza gestor = new GestorDeCobranza();
        gestor.aplicarAlivioFinanciero(credito);

        System.out.println("Saldo después: " + credito.getSaldoPendiente());
    }
}