import java.util.ArrayList;
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    //atributo que guarda el nombre de la persona
    private String name;
    // atributo que guarda la edad de la persona
    private int age;
    //padre de esta persona
    private Person father;
    //madre de esta persona
    private Person mother;
    //hijos de esta persona, si es que tiene
    private ArrayList<Person> children;
  

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;       
    }
    /**
     * método que muestra por pantalla el nombre y edad de la persona
     */
    public void showData()
    {
        System.out.println("El nombre de la persona es " + name + " y tiene " + age + " años");
    }
}
        
    

