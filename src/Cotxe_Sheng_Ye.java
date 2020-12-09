/**
 * PACKAGE_NAME
 * Nombre_project: Practica_Coche
 * Cotxe_Sheng_Ye
 * Created by: cide
 * Date : 6/12/20
 * Description:
 * Heu de crear una classe Cotxe que implementi la interface i que sigui una subclasse de la classe abstracta. Aquesta classe s’ha d’anomenar:
 * Cotxe_nom_llinatge.java
 * Addicionalment, creeu una classe TestCotxe_nom_llinatge.java que comprovi el correcte funcionament de la classe Cotxe.
 **/
import java.util.Random;
public class Cotxe_Sheng_Ye extends CotxeAbstracte implements InterfaceCotxe {

    protected EstatsMotorCotxe estadocoche;

    //Constructores en que cogemos de los tipos de conceptos


    public Cotxe_Sheng_Ye(String marca, String model, TipusCanvi tipusCanvi, EstatsMotorCotxe estadocoche) {
        super(marca, model, tipusCanvi);
        this.estadocoche = estadocoche;
    }

    //Methods
//Arranca el motor y da salida de que esta arrancado como tal
    @Override
    public void arrancarMotor() throws Exception {
        if (estadocoche == EstatsMotorCotxe.Aturat) {
            this.estadocoche = EstatsMotorCotxe.EnMarxa;
        } else {
            throw new Exception("Arrancado");
        }
        System.out.println("Arrancado");
    }

    @Override
    public EstatsMotorCotxe comprovaMotor() {
        return this.estadocoche;
    }
//Recoge las revoluciones que va en el coche
    @Override
    public int getRevolucions() {
        if (estadocoche == EstatsMotorCotxe.Aturat) {
            return  0;
        }
        else{
            Random numeroaleatorio = new Random();
            return numeroaleatorio.nextInt(6500+1);
        }
    }
//Enseña cuando para el motor
    @Override
    public void aturarMotor() throws Exception {
        if (estadocoche == EstatsMotorCotxe.Aturat){
            throw new Exception("aturado");
        }
        else{
            this.estadocoche = EstatsMotorCotxe.Aturat;
            System.out.println("Esta parado");
        }
    }
}
