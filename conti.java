class conti
{
    public static void main (String []args)
    {
        System.out.println("Continue statement is used for loop:");
        for(int i=1;i<=5;i++)
        {
            if(i==2)
            continue;               //only  those no is skip(2)
            System.out.println(i);
        }
    }
}