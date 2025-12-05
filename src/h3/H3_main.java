package h3;

public class H3_main {

    public static void main(String[] args) {

        Mensch m = new Mensch();

        m.setName("Elsa");
        m.setGebJahr(2010);
        m.setAlter();      
        System.out.println("Name: " + m.getName());
        System.out.println("Geburtsjahr: " + m.getGebJahr());
        System.out.println("Alter: " + m.getAlter());
    }
}
class Mensch {

    public String name;
    public int gebJahr;
    public int alter;

    
    public void setName(String n) {
        name = n;
    }

   
    public void setGebJahr(int jahr) {
        gebJahr = jahr;
    }

    
    public void setAlter() {
        alter = 2025 - gebJahr;
    }

   
    public String getName() {
        return name;
    }

    
    public int getGebJahr() {
        return gebJahr;
    }

   
    public int getAlter() {
        return alter;
    }
}
