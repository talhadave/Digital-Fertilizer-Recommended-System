import java.util.*;
import java.util.Set;
import java.util.Map.Entry;
public class main{
	//Making a main method
	public static void main (String args[])
	{
		//Making the object and calling the constructor of farmer class
	Farmer f1=new Farmer("Talha","03427106973","Qila Dave Gujranwala",8,
	"Highly Fertilize","Electric Motor",250000);
		Rice c1=new Rice("Rice",5,"Summer","highly fertilized","Punjab",67,40000);
		Grain g1=new Grain("Grain",5,"Summer","Punjab,Sindh","fertilized and required less water",67,25000);
		Vegetable v1=new Vegetable("Lady Finger",5,"Summer","Mostly in Punjab","fertilized and required less water",67,35000);	
        Fertilizer F1= new Fertilizer("DAP","Rice",50,"increase phosphuros in fertilizer",30,3500);
        Medicine M1=new Medicine("Mono","Rice",7,"any type","kill the bacteria in crop",12,1800); 		
	main m1=new main();//making the object of main class
	String opt="Y";
	String name;
	String contact_number;
	String adress;
	int no_acres;
	String field_type;
	String water_condition;
	int price;
Scanner sc=new Scanner(System.in);//initializing the scanner class
System.out.println("press 1 to do work in farmer class..");
		System.out.println("press 2 to do work in crop class..");
		System.out.println("press 3 to do work in chemical class..");
		int case1=sc.nextInt();
		if(case1==1)
		{	
	Scanner s=new Scanner(System.in);//use scanner class to take input
	
	//Working of Farmer Class
	
	
	//use do /while loop to store the no of farmer data
	do{
		
	System.out.println("Enter the name ");
	name=s.next();
	System.out.println("Enter the contact number");
	contact_number=s.next();
	System.out.println("Enter the adress\npunjab\nsindh\nBalochistan ");
	adress=s.next();
	System.out.println("Enter the field_type\n***Fertilized***unfertilized***");
	field_type=s.next();
	System.out.println("Enter the water_condition\n***good\n***bad***");
	water_condition=s.next();
	System.out.println("Enter the no of acres");
	no_acres=s.nextInt();
	System.out.println("Enter the price");
	price=s.nextInt();
	f1.add_farmer(name,contact_number,adress,no_acres,
	field_type,water_condition,price);
	System.out.println("if you want to add more farmer enter Y..");
	opt=s.next();
	}
	while(opt.equals("Y"));
	//calling the setter method of farmer class
	
	f1.setName(name);
	f1.setContact_Number(contact_number);
	f1.setAdress(adress);
	f1.setNo_Acres(no_acres);
	f1.setField_Type(field_type);
	f1.setWater_Condition(water_condition);
	f1.setPrice(price);
	f1.farmerDetail();
		}
		System.out.println("press1 if you want tp reopen the crop class");
		System.out.println("press 2 to do work in chemical class..");
		int case2=sc.nextInt();
			
			//working on crop class
			if((case1==2) || (case2==1))
			
			{

				System.out.println("press 1 to go to Rice class..");
				System.out.println("press 2 to go to Grain class..");
				System.out.println("press 3 to go to vegetable class..");
                 	int crops=sc.nextInt();
					if(crops==1)
					{
						System.out.println("The Detail of Rice crop is");
						c1.display1();
						c1.getCrop_Name1();
					}
					System.out.println("press 1 to open the Grain class...");
					System.out.println("press 2 to open the Vegetable class...");
					int crops1=sc.nextInt();
					if((crops==2) || (crops1==1));
					{
						System.out.println("The Detail of Grain crop is");
						g1.display2();
					}
					System.out.println("press 1 to open the  class...");
					int crops2=sc.nextInt();
					if((crops==3) || (crops1==2) || (crops2==1))
					{
						System.out.println("The Detail of vegetable crop is");
						v1.display3();
					}					
			}
			System.out.println("press 1 to do work in chemical class..");
			int case3=sc.nextInt();
			//working of chemical class
			if((case1==3) || (case2==2) || (case3==1))
			{  
			   System.out.println("press 1 to go to fertilizer class");
			   System.out.println("press 2 to go to Medicine class");
			   int chemicals1=sc.nextInt();
			   if(chemicals1==1)
			   {
				   F1.display4();//it display the fertilizer chemical data
				  
			   }
			   if(chemicals1==2)
			   {
				   M1.display5();//it display the Medicine chemical data
				   
			   }
			}
//working on user class
			User u1=new User();
			System.out.println("enter the name");//by entering the name of farmer it compare the farmer adress with the specif field that which field is specific for its area
			String name1=sc.next();
			if(f1.getName().equals(name1))
			 {
			 if(f1.getAdress().equals("punjab"))
			{
		System.out.println(u1.getCrop_Name1(c1.getCrop_Name1()));
			 }
			 if(f1.getAdress().equals("sindh"))
			 {
			 System.out.println(u1.getCrop_Name2(g1.getCrop_Name2()));
			 }
			 if(f1.getAdress().equals("Balochistan"))
			{
			 System.out.println(u1.getCrop_Name3(v1.getCrop_Name3()));
			 }
			 }

			System.out.println("enter the crop name to get the specific chemical");//By entering the crop name it return the specific chemical
			String name2=sc.next();
			if(c1.getCrop_Name1().equals(name2))
			{
				System.out.println(u1.getChemical_Name1(F1.getChemical_Name1()));
			}
			if(g1.getCrop_Name2().equals(name2))
			{
				System.out.println(u1.getChemical_Name2(M1.getChemical_Name2()));
			}
			if(v1.getCrop_Name3().equals(name2))
			{
				System.out.println(u1.getChemical_Name1(F1.getChemical_Name1()));
			}

			System.out.println("enter the name");//By entering the name of farmer it compare the water condition of farmer 
			String name3=sc.next();
			if(f1.getName().equals(name3))
			 {
			 if(f1.getWater_Condition().equals("good"))
			{
		System.out.println(u1.getCrop_Name1(c1.getCrop_Name1()));
			 }
			 if(f1.getWater_Condition().equals("bad"))
			 {
			 System.out.println(u1.getCrop_Name2(g1.getCrop_Name2()));
			 }
			 if(f1.getWater_Condition().equals("good"))
			{
			 System.out.println(u1.getCrop_Name3(v1.getCrop_Name3()));
			 }
			 }
			
			
			

}
}
