package overloadingmethods;

public class Student {
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void study()
    {
        System.out.println(name + " is studying");
    }

    //let's overload study to study a particular subject

    //let's further overload study so we can also choose how many hours to study

}
