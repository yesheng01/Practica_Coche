/**
 * PACKAGE_NAME
 * Nombre_project: Practica_Coche
 * TestCotxe_Sheng_Ye
 * Created by: cide
 * Date : 7/12/20
 * Description:
 **/
public class TestCotxe_Sheng_Ye {
    public static void main(String[] args) {
        // Se crea la instancia
        Cotxe_Sheng_Ye coche = new Cotxe_Sheng_Ye("Audi" , "A1" , TipusCanvi.CanviManual , EstatsMotorCotxe.Aturat);

        //Methods y salida para la comprobacion


        try {
            System.out.println(coche.estadocoche);
            coche.arrancarMotor();
            System.out.println(coche.estadocoche);
            System.out.println("Tiene:" + coche.getRevolucions() + "Revoluciones.");
            coche.aturarMotor();
            System.out.println(coche.estadocoche);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Salidas de la instancia

        System.out.println("Este es el coche" +  coche.marca  + "modelo "+  coche.model  + "Tipo de cambios " +   coche.tipuscanvi );
    }
}
