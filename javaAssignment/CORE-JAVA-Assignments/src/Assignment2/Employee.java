package Assignment2;

class Employee{
    float sal = 40000;
    void totalSalary()
    {
        System.out.println("The Employee incremented salary is :" +(sal) );

    }
}
class Manager extends Employee{
    float incentive =15000;
    void totalsalary()
    {
        System.out.println("The Manager salary is :" +((sal+incentive)));
    }
}
class Labour extends Manager{
    double overtime=6500;
    void totalsalary()
    {
        System.out.println("The salary of the Labours is"+(overtime+sal));


    }
    public class MainClass
    {
        public void  main(String args[]){


            Labour Lb = new Labour();
            Manager Man=new Manager();
            System.out.println("Total Salary Of Employees In Organisation is "+(Man.sal+ (((Man.incentive)+ Lb.overtime))+ Lb.sal)); 

           
             Lb.totalsalary(); 
             Man.totalsalary(); 


        }
    }
}


	
	
	
	

