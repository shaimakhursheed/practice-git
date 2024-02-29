Interface Calci
{
 public void getSum(int n1,int n2);
}
 public Class Add implements Calci
 {
public void getSum(int n1,int n2)
{
    int res=n1+n2;
    System.out.println(res);
}
 }
 public Class Main
 {
    public static void main(String[] args)
    {
        Add a1=new Add();
        a1.getSum(12,34);
    }
 }
