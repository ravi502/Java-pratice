public class counting_numbers
{
  public static void main(String[] args) {
      int n=15345;
      int r=0;
      while(n>0)
      {
          n=n/10;
          r++;
      }
      System.out.println(r);
  }  
}