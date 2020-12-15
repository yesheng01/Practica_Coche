/**
 * PACKAGE_NAME
 * Nombre_project: Practica_Coche
 * TestCotxe_Sheng_Ye
 * Created by: cide
 * Date : 7/12/20
 * Description:
 **/
public class TestCotxe2_Sheng_Ye {
    public static void main(String[] args) {
        CotxeSegonaPart_Sheng_Ye c2 = new CotxeSegonaPart_Sheng_Ye("BMW", "X5", TipusCanvi.CanviAutomatic, EstatsMotorCotxe.Aturat, CanviarMarxaAutomatic.N, CanviarMarxaManual.N);
        try {
            System.out.println(c2.getMarxaAutomatic());
            c2.canviarMarxesAutomatic('+');
            System.out.println(c2.getMarxaAutomatic());
            c2.canviarMarxesAutomatic('-');
            System.out.println(c2.getMarxaAutomatic());
            c2.canviarMarxesAutomatic('-');
            System.out.println(c2.getMarxaAutomatic());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Este es automatico" + "\n\n");

        CotxeSegonaPart_Sheng_Ye c3 = new CotxeSegonaPart_Sheng_Ye("Opel", "Zafira", TipusCanvi.CanviManual, EstatsMotorCotxe.Aturat, CanviarMarxaAutomatic.N, CanviarMarxaManual.primera);
        try {
            System.out.println(c3.getMarxaManual());
            c3.canviarMarxesManual('+');
            System.out.println(c3.getMarxaManual());
            c3.canviarMarxesManual('+');
            System.out.println(c3.getMarxaManual());
            c3.canviarMarxesManual('+');
            System.out.println(c3.getMarxaManual());
            c3.canviarMarxesManual('+');
            System.out.println(c3.getMarxaManual());
            c3.canviarMarxesManual('+');
            System.out.println(c3.getMarxaManual());
            c3.canviarMarxesManual('-');
            System.out.println(c3.getMarxaManual());
            c3.canviarMarxesManual('-');
            System.out.println(c3.getMarxaManual());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
