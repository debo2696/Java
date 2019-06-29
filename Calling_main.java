class B
{
    static int bvar=1;   
    public static void main(String[] args) 
    {
        String drinks[]=new String[]{"No","Use"};
        int i=0;
        bvar++;i++;
        System.out.println("Statvar:"+bvar+"Int:"+i);
        B.main(drinks);
    }
}
