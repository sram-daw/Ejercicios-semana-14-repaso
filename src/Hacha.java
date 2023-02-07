public class Hacha extends Arma {

    public Hacha() {
    }

    public Hacha(double damage, double multiplicador, double distancia, double tiempo_para_damage) {
        super(damage, multiplicador, distancia, tiempo_para_damage);
        this.setDamage(damage);
        this.setMultiplicador(multiplicador);
        this.setDistancia(distancia);
        this.setTiempo_para_damage(tiempo_para_damage);
    }

    public Hacha(int nivel_rareza, int nivel, String nombre, double damage, double multiplicador, double distancia, double tiempo_para_damage) {
        super(nivel_rareza, nivel, nombre, damage, multiplicador, distancia, tiempo_para_damage);
        this.setDamage(damage);
        this.setMultiplicador(multiplicador);
        this.setDistancia(distancia);
        this.setTiempo_para_damage(tiempo_para_damage);
    }

    @Override
    public double doing_damage(double distancia_enemigo) {
        if (distancia_enemigo == this.getDistancia()) {
            return 3 * (this.getMultiplicador() * this.getDamage() * (distancia_enemigo - this.getDistancia()));
        } else {
            return this.getMultiplicador() * this.getDamage() * (distancia_enemigo - this.getDistancia());
        }
    }
}
