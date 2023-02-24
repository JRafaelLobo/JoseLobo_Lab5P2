package joselobo_lab5p2;

public class Personaje {

    private String nombre, debilidad, universoPertenece;
    private int fuerzaMental, fuerzaFisica, resistenciaFisica, resistenciaMental, vida;

    public Personaje() {
    }

    public Personaje(String nombre, String debilidad, String universoPertenece, int fuerzaMental, int fuerzaFisica, int resistenciaFisica, int resistenciaMental, int vida) {
        this.nombre = nombre;
        this.debilidad = debilidad;
        this.universoPertenece = universoPertenece;
        this.fuerzaMental = fuerzaMental;
        this.fuerzaFisica = fuerzaFisica;
        this.resistenciaFisica = resistenciaFisica;
        this.resistenciaMental = resistenciaMental;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniversoPertenece() {
        return universoPertenece;
    }

    public void setUniversoPertenece(String universoPertenece) {
        this.universoPertenece = universoPertenece;
    }

    public int getFuerzaMental() {
        return fuerzaMental;
    }

    public void setFuerzaMental(int fuerzaMental) {
        this.fuerzaMental = fuerzaMental;
    }

    public int getFuerzaFisica() {
        return fuerzaFisica;
    }

    public void setFuerzaFisica(int fuerzaFisica) {
        this.fuerzaFisica = fuerzaFisica;
    }

    public int getResistenciaFisica() {
        return resistenciaFisica;
    }

    public void setResistenciaFisica(int resistenciaFisica) {
        this.resistenciaFisica = resistenciaFisica;
    }

    public int getResistenciaMental() {
        return resistenciaMental;
    }

    public void setResistenciaMental(int resistenciaMental) {
        this.resistenciaMental = resistenciaMental;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "nombre->" + nombre + "\ndebilidad->" + debilidad + "\nuniversoPertenece->" + universoPertenece + "\npoder->" + fuerzaMental + "\nfuerza->" + fuerzaFisica + "\nagilidadFisica->" + resistenciaFisica + "\nagilidadMental->" + resistenciaMental + "\nvida->" + vida;
    }

}
