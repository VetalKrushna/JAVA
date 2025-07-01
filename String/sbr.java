package String;


public class Sbr {
    public static void main(String[] args) {
        
        StringBuffer s1=new StringBuffer("Shrirampur");

        System.err.println(s1);
        System.err.println(s1.deleteCharAt(5));
        System.err.println(s1.delete(2,5));
        
        StringBuffer s2=new StringBuffer("RBNB College ");
        System.err.println(s2);
        System.err.println(s2.replace(0, 4, "CDJ"));
        System.err.println(s2.append("Shrirampur"));
        System.err.println(s2.insert(12,"of Commerce "));
        s2.setCharAt(3, '_');
        System.err.println(s2);
        System.err.println(s2.reverse());
        
        
   
        
    }
    
}
