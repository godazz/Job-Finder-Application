package main.model;

public class Job {

    String Title, Description;
    int Salary;

    public Job(String Title, String Description, int Salary){
        this.Title = Title;
        this.Description = Description;
        this.Salary = Salary;
    }



    public static boolean isValid (String Title, String Description, String Salary){

        return Title.matches("^[a-zA-Z ]*$") && Salary.matches("[0-9]+") && Description.matches("^[a-zA-Z ]*$");
    }

}