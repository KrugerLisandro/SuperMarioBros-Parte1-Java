package supermariobros;

public class Personaje {

    private String nombre;
    private String camisa;
    private String pantalon;
    private String gorro;
    private char letra;
    private int ejeX;
    private int ejeY;
    private String orientacion; //Derecha o Izquierda

    public Personaje(String nombre, String camisa, String pantalon, String gorro, char letra) {
        this.nombre = nombre;
        this.camisa = camisa;
        this.pantalon = pantalon;
        this.gorro = gorro;
        this.letra = letra;
        this.ejeX = 0;
        this.ejeY = 0;
        this.orientacion = "Derecha";
    }

    public Personaje(String nombre, String camisa, String pantalon, String gorro, char letra, int ejeX, int ejeY, String orientacion) {
        this.nombre = nombre;
        this.camisa = camisa;
        this.pantalon = pantalon;
        this.gorro = gorro;
        this.letra = letra;
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.orientacion = orientacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCamisa() {
        return camisa;
    }

    public void setCamisa(String camisa) {
        this.camisa = camisa;
    }

    public String getPantalon() {
        return pantalon;
    }

    public void setPantalon(String pantalon) {
        this.pantalon = pantalon;
    }

    public String getGorro() {
        return gorro;
    }

    public void setGorro(String gorro) {
        this.gorro = gorro;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getEjeX() {
        return ejeX;
    }

    public void setEjeX(int ejeX) {
        this.ejeX = ejeX;
    }

    public int getEjeY() {
        return ejeY;
    }

    public void setEjeY(int ejeY) {
        this.ejeY = ejeY;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public void Saludar() {
        System.out.println("Hola, soy " + this.getNombre() + "!");
    }

    public void MostrarUbicacion() {
        System.out.println(this.nombre+" esta orientado hacia la "+this.orientacion+" y se encuentra en la posicion (" 
        +this.ejeX+","+this.ejeY+").");
    }

    public void Girar() {
        if (this.orientacion.equals("Derecha")) {
            this.orientacion = "Izquierda";
        } else {
            this.orientacion = "Derecha";
        }
    }

    public void Caminar() {
        if (this.orientacion.equals("Derecha")) {
            this.ejeX++;
        } else {
            this.ejeX--;
        }
    }
}
