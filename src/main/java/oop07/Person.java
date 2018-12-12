package oop07;

import java.util.Objects;
import java.util.stream.Stream;

public class Person implements Comparable<Person>{
    private final long id;
    private String nachname;
    private String vorname;
    private int age;


    public Person(int id , String nachname, String vorname, int age)
    {
        this.id = id;
        this.nachname = nachname;
        this.vorname = vorname;
        this.age = age;
    }

    @Override
    public int compareTo(Person other){
//        return Long.compare(this.getId(), other.getId());
        int compare;
        compare = this.getNachname().compareTo(other.getNachname());
        if(compare == 0)
        {
            compare = this.getVorname().compareTo(other.getVorname());
        }
        return compare;
    }

    @Override
    public final boolean equals(final Object person)
    {
        if (person == this)
        {
            return true;
        }
        if (!(person instanceof Person))
        {
            return false;
        }
        final Person other = (Person) person;
        return ((Objects.equals(this.nachname, other.nachname)) && (Objects.equals(this.vorname, other.vorname)) && (other.getAge() == this.getAge() && (other.getId() == this.getId())));
//        es kann auch nur die ID verglichen werden mit == da die ID ein Elementarer Datentyp ist
    }

    @Override
    public final int hashCode(){
        return Objects.hash(this.id, this.nachname, this.vorname, this.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + this.getId() +
                ", Nachname='" + this.getNachname() + '\'' +
                ", Vorname='" + this.getVorname() + '\'' +
                ", age=" + this.getAge() + '\'' +
                '}';
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String name) {
        this.nachname = name;
    }

    public String getVorname() { return vorname; }

    public void setVorname(String name) { this.vorname = name; }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
