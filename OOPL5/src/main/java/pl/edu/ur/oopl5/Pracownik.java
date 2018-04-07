package pl.edu.ur.oopl5;

public class Pracownik {
    private String name;
    private String surrname;
    private int age;
    private String position;
    private boolean exist;



    //Get/Set


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurrname() {
        return surrname;
    }

    public void setSurrname(String surrname) {
        this.surrname = surrname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    //Constructor

    public Pracownik(String name, String surrname, int age, String position, boolean exist) {
        this.name = name;
        this.surrname = surrname;
        this.age = age;
        this.position = position;
        this.exist = exist;
    }

    public Pracownik(String name, String surrname, int age, String position) {
        this.name = name;
        this.surrname = surrname;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "Imię= " + name +
                ", Nazwisko: " + surrname +
                ", Wiek: " + age +
                ", Stanowisko: " + position + ")";
    }
}
