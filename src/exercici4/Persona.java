package exercici4;


public class Persona {
    
    String nom;
    int edad, peso;

    public Persona(String nom, int edad, int peso) {
        this.nom = nom;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

   
    
}
