class p029_049
{
    float fund;
   public void deposit(float amount)
    {
        fund=amount;
    }
 public void withdraw(float money) throws Exception
    {
        float newFund=fund-money;
        if(newFund<500)
        {
            throw new Exception("Not Sufficient Fund");
        }
        else
        {
            fund=newFund;
            System.out.println("Balance After Withdraw : "+fund);
        }
    }
        public static void main(String args[])
        {
            p029_049  b=new p029_049();
            b.deposit(1000);
            try
            {
                float money=400;
                System.out.println("Withdrawing amount : "+money);
                b.withdraw(money);
                money=500;
                System.out.println("Withdrawing amount : "+money);
                b.withdraw(money); 
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }

        }
}