import java.lang.reflect.*;

class Observer
{
    public static void main(String args[]) throws IllegalAccessException
    {
        //Get the Class object associated with this class.
        Vault hm = new Vault();

        Class objClass = hm.getClass();

        System.out.println("The list of fields(with values) and methods of the given class goes as follows :-\n");

        //Get the all methods associated with this class.
        Field[] allFields = objClass.getDeclaredFields();
        for(Field field: allFields)
        {
            field.setAccessible(true);
            System.out.println("\tField found: " + field.toString() + " = " + field.get(hm));
        }
        System.out.println();
        
        //Get the all methods associated with this class.
        Method[] allMethods = objClass.getDeclaredMethods();
        for(Method method: allMethods)
        System.out.println("\tMethods found: " + method.toString());
    }
}