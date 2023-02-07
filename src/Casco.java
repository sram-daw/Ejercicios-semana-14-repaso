public class Casco extends Armadura {

    public Casco() {
    }

    public Casco(double defensa, double multiplicador) {
        super(defensa, multiplicador);
        this.setDefensa(defensa);
        this.setMultiplicador(multiplicador);
    }

    public Casco(int nivel_rareza, int nivel, String nombre, double defensa, double multiplicador) {
        super(nivel_rareza, nivel, nombre, defensa, multiplicador);
        this.setDefensa(defensa);
        this.setMultiplicador(multiplicador);
    }

    @Override
    public double accion_especial(boolean proyectil) {
        if (proyectil == true) {
            return 30.5;
        } else {
            return 0.0;
        }
    }
}
