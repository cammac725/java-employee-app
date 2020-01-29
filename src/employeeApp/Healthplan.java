package employeeApp;

public class Healthplan
{
  // fields
  private static int maxId = 0;
  private int id;
  private String name;

  public Healthplan(String name)
  {
    maxId++;
    id = maxId;
    this.name = name;
  }

  // methods - get and set
  public int getId()
  {
    return id;
  }
  
  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}