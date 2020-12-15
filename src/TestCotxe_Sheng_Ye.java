/**
 * PACKAGE_NAME
 * Nombre_project: Practica_Coche
 * TestCotxe_Sheng_Ye
 * Created by: sheng
 * Date : 15/12/2020
 * Description:
 **/
public class TestCotxe_Sheng_Ye {
    public static void main(String[] args) {
        Cotxe_Sheng_Ye coche = new Cotxe_Sheng_Ye("Audi" , "A1" , TipusCanvi.CanviManual , EstatsMotorCotxe.Aturat);

        try {
            System.out.println(coche.estadocoche);
            coche.arrancarMotor();
            System.out.println(coche.estadocoche);
            System.out.println(coche.getRevolucions());
            coche.aturarMotor();
            System.out.println(coche.estadocoche);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
