import java.util.Scanner;

class Vault
{
    private String password;
    private boolean flag;

    //ctors
    public Vault()
    {
        setPassword("Eragon");
        flag= false;
    }
    public Vault(String p)
    {
        setPassword(p);
    }

    //functions private
    private void setPassword(String s)
    {
        password= s;
    }

    private boolean validatePassword(String s)
    {
        if(s.equals(password))
        {
            flag= true;
            return true;
        }
        return false;
    }
    
    //functions public
    public boolean getFlag()
    {
        return flag;
    }


    public void askPassword()
    {
        System.out.println("Speak your true name to The Rock Of Kuthian to open The Vault Of Souls...");
        String s= new String();
        Scanner in= new Scanner(System.in);
        s= in.next();
        if(validatePassword(s))
            System.out.println("The Vault Of Souls is now open to you, " + s + "..." );
        else    
            System.out.println("\tOnly The Worthy can open it...");
    }

    public static void main(String args[]) 
    {
        Vault hm = new Vault();
        while (!hm.getFlag())
        {
            try 
            {
                hm.askPassword();
            } 
            catch (Exception e)  
            {
                e.printStackTrace();
            }
        }
    }
}