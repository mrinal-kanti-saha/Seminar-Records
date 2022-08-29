class Testclass
{
    private int private_field;
    public String public_field;
    public static int static_field = 0;
    private final int final_field = 1;

    public Testclass()
    {
        private_field= 108;
        public_field= "Sairam";
        static_field++;
    }
    private void func1()
    {
        System.out.println("Private function func1 reporting.");
    }
    public void func2()
    {
        System.out.println("Public function func2 reporting.");
    }
}