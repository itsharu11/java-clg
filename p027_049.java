class  p027_049
 {
    public static void main(String args[])
 {
        try
{
            int number = 100/0;

}
catch(Exception e)
{
    System.out.println("Caught Exception while trying to divide 100 by zero : "+e.toString());
 }
 }
}