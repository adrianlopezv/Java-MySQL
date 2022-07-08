
package proyectofinalintro;

public class Inventario
{
  private String TIPO_SANGRE;
    private int UNIT_BOLSAS_MIN,UNIT_BOLSAS_ACT;


    public String getTIPO_SANGRE() {
        return TIPO_SANGRE;
    }

    public void setTIPO_SANGRE(String TIPO_SANGRE) {
        this.TIPO_SANGRE = TIPO_SANGRE;
    }

    public int getUNIT_BOLSAS_MIN() {
        return UNIT_BOLSAS_MIN;
    }

    public void setUNIT_BOLSAS_MIN(int UNIT_BOLSAS_MIN) {
        this.UNIT_BOLSAS_MIN = UNIT_BOLSAS_MIN;
    }

    public int getUNIT_BOLSAS_ACT() {
        return UNIT_BOLSAS_ACT;
    }

    public void setUNIT_BOLSAS_ACT(int UNIT_BOLSAS_ACT) {
        this.UNIT_BOLSAS_ACT = UNIT_BOLSAS_ACT;
    }
    
    
}
