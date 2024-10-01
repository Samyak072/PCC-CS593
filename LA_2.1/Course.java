import java.util.Scanner;
class Course {
    String code;
    String name;   
    public Course( String c, String n )  { 
        code = c;
        name = n;
    }
    Course (){
        code = "";
        name = "";
    }
    String getCourse() {  
        return( code + " | " + name);
    }
    void setCourse(String c, String n) {  
        code =c ;
        name= n;
    }   
}
