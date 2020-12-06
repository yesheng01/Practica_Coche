/**
 * PACKAGE_NAME
 * Nombre_project: Practica_Coche
 * Cotxe_Sheng_Ye
 * Created by: cide
 * Date : 6/12/20
 * Description:
 **/
import java.util.Random;
public class Cotxe_Sheng_Ye extends CotxeAbstracte implements InterfaceCotxe {

    protected EstatsMotorCotxe estadocoche;

    public Cotxe_Sheng_Ye(String marca, String model, TipusCanvi tipusCanvi, EstatsMotorCotxe estadocoche) {
        super(marca, model, tipusCanvi);
        this.estadocoche = estadocoche;
    }

    public void arrancarMotor() throws Exception {
        if (estadocoche == EstatsMotorCotxe.Aturat) {
            this.estadocoche = EstatsMotorCotxe.EnMarxa;
        } else {
            throw new Exception("Arrancado");
        }
    }

    @Override
    public EstatsMotorCotxe comprovaMotor() {
        return this.estadocoche;
    }

    @Override
    public int getRevolucions() {
        if (estadocoche == EstatsMotorCotxe.Aturat) {
            return 0;
        }
        else{
            Random numerorandom = new Random();
            return numerorandom.nextInt(6500+1);
        }
    }

    @Override
    public void aturarMotor() throws Exception {
        if (estadocoche == EstatsMotorCotxe.Aturat){
            throw new Exception("aturado");
        }
        else{
            this.estadocoche = EstatsMotorCotxe.Aturat;
        }
    }
}
