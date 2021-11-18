package Assignment5;

import java.util.HashSet;
import java.util.Set;

 class gen1
{
    private int id;
    private String name;
    private int age;
    private double salary;
    private  String dept;

    public gen1(int id,String name, int age,double salary,String dept)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        gen1 employee = (gen1) o;

        if (id != employee.id) {
            return false;
        }
        if (!name.equals(employee.name)) {
            return false;
        }
        if (age != employee.age) {
            return false;
        }
        if (salary != employee.salary) {
            return false;
        }
        if (dept != employee.dept) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = name.hashCode();
         int result1 = dept.hashCode()+result;
        result1 = 31 * result1 + id+age;
        return result1;
    }

    @Override
    public String toString()
    {
        return "(" +"name='" + name + '\'' +", age= " + age + " id= "+id+" salary= "+salary+" dept= "+dept+ ')';
    }
}

class Main {
    public static void main(String[] args) {
        gen1 e1 = new gen1(1,"Steve",23,60000,"CSE");
        gen1 e2 = new gen1(2, "Jett",21,19000,"CSE");

        Set<gen1> getDetails = new HashSet<>();
        System.out.println("details of employee 1");
        getDetails.add(e1);
        System.out.println(e1);
        System.out.println("details of employee 2");
        getDetails.add(e2);
        System.out.println(e2);
    }
}
