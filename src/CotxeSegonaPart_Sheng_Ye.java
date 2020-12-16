/**
 * PACKAGE_NAME
 * Nombre_project: Practica_Coche2
 * CotxeSegonaPart_Sheng_Ye
 * Created by: cide
 * Date : 13/12/20
 * Description:
 **/

public class CotxeSegonaPart_Sheng_Ye extends Cotxe_Sheng_Ye implements InterfaceCotxe {
    protected CanviarMarxaAutomatic marxaAutomatic;
    protected CanviarMarxaManual marxaManual;
    public CotxeSegonaPart_Sheng_Ye(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatCotxe, CanviarMarxaAutomatic marxaAutomatic, CanviarMarxaManual marxaManual) {
        super(marca, model, tipuscanvi, estatCotxe);
            this.marxaAutomatic = marxaAutomatic;
            this.marxaManual = marxaManual;
        }


    //Metodo de cambio de marxas manualmente de un coche
    public void canviarMarxesManual(char marxa) throws Exception{
//Subidas de marchas
        if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.R && marxa == '+') {
            this.marxaManual = CanviarMarxaManual.N;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.N && marxa == '+') {
            this.marxaManual = CanviarMarxaManual.primera;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.primera && marxa == '+') {
            this.marxaManual = CanviarMarxaManual.segunda;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.segunda && marxa == '+') {
            this.marxaManual = CanviarMarxaManual.tercera;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.tercera && marxa == '+') {
            this.marxaManual = CanviarMarxaManual.cuarta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.cuarta && marxa == '+') {
            this.marxaManual = CanviarMarxaManual.quinta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.quinta && marxa == '+') {
            this.marxaManual = CanviarMarxaManual.sexta;

//Bajada de marchas

        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.sexta && marxa == '-') {
            this.marxaManual = CanviarMarxaManual.quinta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.quinta && marxa == '-') {
            this.marxaManual = CanviarMarxaManual.cuarta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.cuarta && marxa == '-') {
            this.marxaManual = CanviarMarxaManual.tercera;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.tercera && marxa == '-') {
            this.marxaManual = CanviarMarxaManual.segunda;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.segunda && marxa == '-') {
            this.marxaManual = CanviarMarxaManual.primera;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.primera && marxa == '-') {
            this.marxaManual = CanviarMarxaManual.N;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == CanviarMarxaManual.N && marxa == '-') {
            this.marxaManual = CanviarMarxaManual.R;
        }
        else {
            throw new Exception("Marxa no identificada");
        }
    }
//Metodo de marchas de cambio automatico.
    public void canviarMarxesAutomatic(char marxa) throws Exception {
        if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == CanviarMarxaAutomatic.R && marxa == '+') {
            this.marxaAutomatic = CanviarMarxaAutomatic.N;
        } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == CanviarMarxaAutomatic.N && marxa == '+') {
            this.marxaAutomatic = CanviarMarxaAutomatic.F;
        } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == CanviarMarxaAutomatic.F && marxa == '-') {
            this.marxaAutomatic = CanviarMarxaAutomatic.N;
        } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == CanviarMarxaAutomatic.N && marxa == '-') {
            this.marxaAutomatic = CanviarMarxaAutomatic.R;
        }
        else {
            throw new Exception("Marxa no identificada");
        }
    }
//Clase añadida de enum de canviarmarxamanual
    public enum CanviarMarxaManual {
        R,
        N,
        primera,
        segunda,
        tercera,
        cuarta,
        quinta,
        sexta
    }
//Clase añadida de enum de canviarmarxautomatico
    public enum CanviarMarxaAutomatic {
        F,
        N,
        R
    }

    public CanviarMarxaManual getMarxaManual(){
        return marxaManual;
    }


    public CanviarMarxaAutomatic getMarxaAutomatic() {
        return marxaAutomatic;
    }
}
