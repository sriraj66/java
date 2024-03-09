

class IamA  {

    void a(){
        System.out.println("I am A");
    }
}

class IamB extends IamA{
    
    void b(){
        System.out.println("I am B");
    }
}

class IamC extends IamB{
    void c(){
        System.out.println("I am c");
    }
}

public class OOPS {
 
    public static void main(String[] args) {
        
        IamC c = new IamC();
        
        c.a();
        c.b();
        c.c();


    }
    
}
