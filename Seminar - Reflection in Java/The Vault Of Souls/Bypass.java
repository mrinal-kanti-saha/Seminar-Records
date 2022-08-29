import java.lang.reflect.*;
import java.util.Scanner;

class Bypass
{
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, SecurityException, IllegalAccessException,
IllegalArgumentException, InvocationTargetException
    {
        Vault v= new Vault();
        Class c= v.getClass();

        //Method setPasswordMethod = c.getDeclaredMethod("setPassword", String.class);
        Field Passcode = c.getDeclaredField("password");
        
        //Next set the method to true, so it is no longer private and therefore we can access it.
        //setPasswordMethod.setAccessible(true);
        Passcode.setAccessible(true);

        System.out.print("Enter new Passcode : ");
        Scanner in= new Scanner(System.in);
        String np= in.next();

        Passcode.set(v,np);
        //Next invoke the setPassward() using invoke()
        //setPasswordMethod.invoke(v, np);
        
        v.askPassword();
    }
}