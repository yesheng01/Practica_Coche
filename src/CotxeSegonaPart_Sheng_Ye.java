/**
 * PACKAGE_NAME
 * Nombre_project: Practica_Coche2
 * CotxeSegonaPart_Sheng_Ye
 * Created by: cide
 * Date : 13/12/20
 * Description:
 **/
public class CotxeSegonaPart_Sheng_Ye extends Cotxe_Sheng_Ye implements InterfaceCotxe {
    protected MarxesAutomatic marxaAutomatic;
    protected MarxesManual marxaManual;
    public CotxeSegonaPart_Sheng_Ye(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatCotxe, MarxesAutomatic marxaAutomatic, MarxesManual marxaManual) {
        super(marca, model, tipuscanvi, estatCotxe);
        if (tipuscanvi == TipusCanvi.CanviAutomatic) {
            this.marxaAutomatic = marxaAutomatic;
            this.marxaManual = null;
        } else {
            this.marxaAutomatic = null;
            this.marxaManual = marxaManual;
        }
    }

        public void canviarMarxesAutomatic(char marxa) throws Exception {
            //************
            //------------CANVI AUTOMATIC
            //************
            //Feim una seria de IF per a recorrer la l'enum del tipus de marxa en aquest cas
            //del canvi manual, pujant i baixant passant un + o - de parametre
            if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == MarxesAutomatic.R && marxa == '+') {
                this.marxaAutomatic = MarxesAutomatic.N;
            } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == MarxesAutomatic.N && marxa == '+') {
                this.marxaAutomatic = MarxesAutomatic.F;
            } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == MarxesAutomatic.F && marxa == '-') {
                this.marxaAutomatic = MarxesAutomatic.N;
            } else if (tipuscanvi == TipusCanvi.CanviAutomatic && marxaAutomatic == MarxesAutomatic.N && marxa == '-') {
                this.marxaAutomatic = MarxesAutomatic.R;
            }
            else {
                throw new Exception("Marxa no identificada");
            }
        }
    public void canviarMarxesManual(char marxa) {

        if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.R && marxa == '+') {
            this.marxaManual = MarxesManual.N;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.N && marxa == '+') {
            this.marxaManual = MarxesManual.primera;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.primera && marxa == '+') {
            this.marxaManual = MarxesManual.segunda;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.segunda && marxa == '+') {
            this.marxaManual = MarxesManual.tercera;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.tercera && marxa == '+') {
            this.marxaManual = MarxesManual.cuarta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.cuarta && marxa == '+') {
            this.marxaManual = MarxesManual.quinta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.quinta && marxa == '+') {
            this.marxaManual = MarxesManual.sexta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.sexta && marxa == '-') {
            this.marxaManual = MarxesManual.quinta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.quinta && marxa == '-') {
            this.marxaManual = MarxesManual.cuarta;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.cuarta && marxa == '-') {
            this.marxaManual = MarxesManual.tercera;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.tercera && marxa == '-') {
            this.marxaManual = MarxesManual.segunda;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.segunda && marxa == '-') {
            this.marxaManual = MarxesManual.primera;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.primera && marxa == '-') {
            this.marxaManual = MarxesManual.N;
        } else if (tipuscanvi == TipusCanvi.CanviManual && marxaManual == MarxesManual.N && marxa == '-') {
            this.marxaManual = MarxesManual.R;
        }
    }

    public MarxesManual getMarxaManual() {
        return marxaManual;
    }

    public MarxesAutomatic getMarxaAutomatic() {
        return marxaAutomatic;
    }
}
