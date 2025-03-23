// import java.util.jar.Attributes.Name;

class Register {
    private String name,Email,Password;

    public Register(String name,String Email , String  Password){
        this.name= name;
        this.Email = Email;
        this.Password = Password;
    }

    public String getName(){
    //     if(){
    //         return Name;
    //     }else{
    //         return "Invalid Email";
    //     }
        return name;
    }

}

class Course {
    static int cnt=0;
    String C_name,C_tutor,C_cat;
    double price ;
    public Course(String name,String tutor,double price,String category){
        C_name = name;
        C_tutor = tutor;
        this.price = price;
        C_cat = category;
    }

    public String getCourse(){
        return C_name;
    }
}

class Enrollment{
    static int id =0 ;
    String C_name,S_name;

    public void setCname(String C_name){
        this.C_name = C_name;
    }

    public void setSname(String S_name){
        this.S_name = S_name;
    }

    public String getEnroll(){
        return C_name;
    }
}

public class Mylearn {
    public static void main(String[] args) {

        Register[] user = new Register[5];

        for(int i=0;i<5;i++){
            user[i] = new Register("user"+(i+1), "user"+(i+1)+"@gmail.com", "user"+i+1+"@123");
        }

        String[] course = {"C","java","python"};

        Course[] c = new Course[3];
        
        for(int i=0;i<3;i++){
            c[i] = new Course(course[i], "A"+(i+1), 499, "Software");
        }
       
        System.out.println("User details.......");
        for (Register u1 : user) {
            System.out.println(u1.getName());
        }
        
        System.out.println("\nAvailable Courses.......");
        for(Course c1:c){
            System.out.println(c1.getCourse());
        }

        Enrollment[] e = new Enrollment[3];
    
        for(int i=0;i<3;i++){
            e[i] = new Enrollment();
            e[i].setCname(c[i].getCourse());           //c[i] is the object of course class 
            e[i].setSname(user[i].getName());
        }

        System.out.println("\n Enrolled courses.......");
        for (Enrollment enrollment : e) {
            System.out.println(enrollment.getEnroll());
        }

    }
}
