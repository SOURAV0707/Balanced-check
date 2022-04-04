class Ram
{
public static void main(String args[])
{
int balance=5000;
int wd=2000;
try
{
if(balance<wd)
throw new ArithmeticException("insufficient balance");
else
{
balance=balance-wd;
System.out.println("new balance="+balance);
}
}
}
}