package Persona;

public class PersonaMain {
    public static void main(String[] args) {
        Persona persona = new Persona("Mario", "Rossi", "Via Italia", (int) (Math.random() * 999999999) + 1);
        Persona persona1 = new Persona("Mario", "Rossi", "Via Italia", (int) (Math.random() * 999999999) + 1);
        persona.printString();
        persona1.printString();
        System.out.println(persona.equal(persona1));
    }
}
