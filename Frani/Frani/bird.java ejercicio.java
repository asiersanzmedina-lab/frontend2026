// Plantilla para crear pájaros
public class Bird {

    // Datos que tiene cada pájaro
    private String name;          
    private String nativeTo;      
    private String diet;          
    private String conservation;  

    // Sirve para crear un pájaro y guardar sus datos
    public Bird(String name, String nativeTo, String diet, String conservation) {
        this.name = name;
        this.nativeTo = nativeTo;
        this.diet = diet;
        this.conservation = conservation;
    }

    // Dice cómo se escribe el pájaro en pantalla
    @Override
    public String toString() {
        return "Name: " + name + ", Native to: " + nativeTo + ", Diet: " + diet + ", Conservation: " + conservation;
    }

    // Aquí empieza el programa
    public static void main(String[] args) {

        // Creo un pájaro con sus datos
        Bird myBird = new Bird("Bald Eagle", "North America", "Carnivore", "Least Concern");

        // Lo muestro en pantalla
        System.out.println(myBird);
    }
}