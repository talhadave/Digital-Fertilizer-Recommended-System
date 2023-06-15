public class gens
{
 String tittle;
 boolean barrowed;
 int bookNumber;
 public void display()
  {
  System.out.println("The tittle of book is...");
  System.out.println("The boookNumber is..." );
  System.out.println("This Book is borrowed...");
  }
  public static void main(String args[])
  {
  gens b1=new Book(tittle,"physics", bookNumber,"001", barrowed,"no");
  gens b2=new Book(tittle,"chemistry", bookNumber,"002",barrowed,"yes");
  gens b3=new Book(tittle,"english",bookNumber,"003",barrowed,"no");
  gens b4=new Book(tittle,"biology",bookNumber,"004",barrowed,"yes");
  b1.display();
  b2.display();
  b3.display();
  b4.display();
  
  
  }
}