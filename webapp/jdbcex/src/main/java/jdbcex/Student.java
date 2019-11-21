package jdbcex;

public class Student{
    private int id;
    private String name;
    private String sname;
    private String email;

    public Student () {}
    public Student(int id, String name, String sname, String email){
        this.id=id;
        this.name=name;
        this.sname = sname;
        this.email=email;
    }
    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return this.id;
    } 

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    public void setSname(String sname){
        this.sname=sname;
    }
    public String getSname(){
        return this.sname;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
}