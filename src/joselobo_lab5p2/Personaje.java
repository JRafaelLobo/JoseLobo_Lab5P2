package joselobo_lab5p2;
public class Personaje {
    private String nombre,debilidad,universoPertenece;
    private int poder,fuerza,agilidadFisica,agilidadMental,vida;

    public Personaje() {
    }

    public Personaje(String nombre, String debilidad, String universoPertenece, int poder, int fuerza, int agilidadFisica, int agilidadMental, int vida) {
        this.nombre = nombre;
        this.debilidad = debilidad;
        this.universoPertenece = universoPertenece;
        this.poder = poder;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
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

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(int agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public int getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(int agilidadMental) {
        this.agilidadMental = agilidadMental;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "nombre->" + nombre + "\ndebilidad->" + debilidad + "\nuniversoPertenece->" + universoPertenece + "\npoder->" + poder + "\nfuerza->" + fuerza + "\nagilidadFisica->" + agilidadFisica + "\nagilidadMental->" + agilidadMental + "\nvida->" + vida;
    }
    
}
