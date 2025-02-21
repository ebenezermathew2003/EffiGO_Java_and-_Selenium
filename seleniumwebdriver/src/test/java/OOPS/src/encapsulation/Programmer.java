package encapsulation;
class Programm {
    private String name;

    // Getter and Setter for name
    public String getName() { return name; }
    public void setName(String name) 
    { this.name = name; }
}

public class Programmer {
    public static void main(String[] args) {
        Programm p = new Programm();
        p.setName("Geek"); 
        System.out.println("Name=> " + p.getName());
    }
}
