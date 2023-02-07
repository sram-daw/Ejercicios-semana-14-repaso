public class Botas extends Armadura {

    public Botas() {
    }

  /*  public Botas(double defensa, double multiplicador) {
        super(defensa, multiplicador);
        this.setDefensa(defensa);
        this.setMultiplicador(multiplicador);
    }*/

    public Botas(int nivel_rareza, int nivel, String nombre, double defensa, double multiplicador) {
        super(nivel_rareza, nivel, nombre, defensa, multiplicador);
        this.setDefensa(defensa);
        this.setMultiplicador(multiplicador);
    }

    public double accion_especial(boolean melee, int distancia) {
        if (melee == true) {
            return distancia * this.getDefensa();
        } else {
            return 0.0;
        }
    }
}
