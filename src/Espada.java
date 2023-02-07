public class Espada extends Arma {
    public Espada() {
    }

    //Constructor que toma SOLO los atributos de la clase padre (Arma)
    public Espada(double damage, double multiplicador, double distancia, double tiempo_para_damage) {
        super(damage, multiplicador, distancia, tiempo_para_damage);
        this.setDamage(damage);
        this.setMultiplicador(multiplicador);
        this.setDistancia(distancia);
        this.setTiempo_para_damage(tiempo_para_damage);
    }

    //Constructor que toma los atributos de la clase padre (Arma) y del padre del padre (Equipo).
    public Espada(int nivel_rareza, int nivel, String nombre, double damage, double multiplicador, double distancia, double tiempo_para_damage) {
        super(nivel_rareza, nivel, nombre, damage, multiplicador, distancia, tiempo_para_damage);
        this.setDamage(damage);
        this.setMultiplicador(multiplicador);
        this.setDistancia(distancia);
        this.setTiempo_para_damage(tiempo_para_damage);
    }

    @Override
    public double doing_damage(double distancia_enemigo) {
        return this.getMultiplicador() * this.getDamage() * (distancia_enemigo - this.getDistancia());
    }
}
