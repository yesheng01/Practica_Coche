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
        CotxeSegonaPart_Sheng_Ye c2 = new CotxeSegonaPart_Sheng_Ye("Ford", "Focus RS", TipusCanvi.CanviAutomatic, EstatsMotorCotxe.Aturat, MarxesAutomatic.N, MarxesManual.N);
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

        CotxeSegonaPart_Sheng_Ye c3 = new CotxeSegonaPart_Sheng_Ye("Ford", "Mustang", TipusCanvi.CanviManual, EstatsMotorCotxe.Aturat, MarxesAutomatic.N, MarxesManual.N);
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
