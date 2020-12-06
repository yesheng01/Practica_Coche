/**
 * PACKAGE_NAME
 * Nombre_project: Practica_Coche
 * CotxeAbstracte
 * Created by: cide
 * Date : 6/12/20
 * Description:
 **/
public abstract class CotxeAbstracte implements InterfaceCotxe {

    protected String marca;
    protected String model;
    protected TipusCanvi tipuscanvi;
    public CotxeAbstracte(String marca, String model, TipusCanvi tipuscanvi) {
        this.marca=marca;
        this.model=model;
        this.tipuscanvi=tipuscanvi;
    }

}