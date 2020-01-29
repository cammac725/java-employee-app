package employeeApp;

public class Main
{
  // fields - information
  
  // methods - behaviors
  public static void main(String[] args)
  {
    Healthplan h1 = new Healthplan("My Health 1");
    Healthplan h2 = new Healthplan("My Health 2");

    Company c1 = new Company("Company A", 100);
    Company c2 = new Company("Company B", 100);

    Employee emp1 = new Employee("Steve", "Green", 45000, true, c1.id, h1.getId());
    Employee emp2 = new Employee("May", "Ford", 80000, true, c1.id, h2.getId());
    Employee emp3 = new Employee("Doug", "Jones", 75000, true, c2.id, h2.getId());
    Employee emp4 = new Employee("John", "Jones", 80000, false, c2.id, h1.getId());
    Employee emp5 = new Employee("John", "Mitchell", 45000, true, c2.id, h2.getId());

    System.out.println("*** Query Data ***");
    System.out.println(emp1);
    System.out.println();
    System.out.println(c1.debt);
    c1.debt = -c1.debt;
    System.out.println(c1.debt);

    System.out.println("*** Strings ***");

    String localStr;
    localStr = emp1.getFname() + " " + emp3.getLname();
    System.out.println(localStr);

    String noVowels = localStr.toLowerCase().replaceAll("[a,e,i,o,u]", "_");
    System.out.println(noVowels);

    System.out.println();
    System.out.println("*** Numbers ***");
    System.out.println("Original / 5: " + (c1.debt / 5));
    System.out.println("Original / 7: " + (c1.debt / 7));
    System.out.println("Original / 7.0: " + (c1.debt / 7.0));
    System.out.println("Original / 7: " + ((double)c1.debt / 7));
    System.out.println("Original mod 3: " + (c1.debt % 3));

    System.out.println();
    System.out.println("*** Printing numbers and characters ***");
    String myStr = "100";
    c1.debt = -c1.debt;
    System.out.println("Debt: " + myStr + c1.debt);
    System.out.println("Debt: " + (Integer.parseInt(myStr) + c1.debt));
    System.out.println();

    System.out.println("*** Printing Objects ***");
    System.out.println(emp1.toString());
    System.out.println();
    System.out.println(emp5.toString());
    System.out.println();

    System.out.println("*** Emp1 gets a raise ***");
    System.out.println(emp1.getSalary() + (emp1.getSalary() * 0.03));
    System.out.println(emp1.toString());
    System.out.println();

    System.out.println("*** 401K amount for Emp5 ***");
    System.out.println(emp5.getSalary() * c1.match401K);
    System.out.println();

    System.out.println("*** Company names ***");
    System.out.println("Combined");
    System.out.println(c1.name + " " + c2.name);
    System.out.println("No vowels");
    String noNameVowels = (c1.name.toLowerCase().replaceAll("[a,e,i,o,u]", "_"));
    System.out.println(noNameVowels);
    System.out.println();

    String nameStr = emp1.getName();
    System.out.println(nameStr);
    for (int i = 0; i < nameStr.length(); i++)
    {
      System.out.println(nameStr.toLowerCase().charAt(i) + " ");
    }
    System.out.println();
  }
}