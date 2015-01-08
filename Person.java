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
        father = null;
        mother = null;
        children = new ArrayList<Person>();
    }
    /**
     * método que muestra por pantalla el nombre y edad de la persona
     */
    public void showData()
    {
        System.out.println("Nombre: " + name); 
        System.out.println("Edad: " + age);
    }
    /**
     * método que fija la madre de la persona
     */
    public void setMother(Person mother)
    {
        this.mother = mother;
    }
    /**
     * método que fija el padre de la persona
     */
    public void setFather(Person father)
    {
        this.father = father;
    }
    /**
     * Método que añade un hijo a la persona
     */
    public void addChild(Person child)
    {
        children.add(child);
    }
    /**
     * Método que muestra por pantalla los datos del padre y de la madre de la persona
     */
    public void showParentsData()
    {
        //si tiene madre almacenada, imprime su informacion 
        if (mother != null)
        {
            System.out.println("Madre: ");
            mother.showData();
        }
        //si tiene padre almacenado, imprime su información
        if (father != null)
        {
            System.out.println("Padre: ");
            father.showData();
        }
    }
    /**
     * método que muestra por pantalla los datos de los hijos de la persona
     */
    public void showChildrenData()
    {
        if (children.size() == 0)
        {
            System.out.println(name + " no tiene descendientes");
        }
        else
        {
            System.out.println("Los descendientes de " + name + " son:");
            for (Person child : children)
            {
                child.showData();
            }
        }
    }
        
        
}
        
    

