import java.util.*;
public  class Farmer{
	
	//Attribute of class
	private String name;//store the name of farmer
	private String contact_number;//store farmer contact number
	private String adress;//store farmer adress
	private int no_acres;//store farmer acres
	private String field_type;//store farmer field.... that his field is fertilizer or not
	private String water_condition;//store that in his area the water is enough for crop or not
	private int price;//How many price you have;
	
	//Making a constructorn of calass
	public Farmer(String name,String contact_number,String adress,int no_acres,String field_type,String water_condition,int price)
	{
		this.name=name;
		this.contact_number=contact_number;
		this.adress=adress;
		this.no_acres=no_acres;
		this.field_type=field_type;
		this.water_condition=water_condition;
		this.price=price;
	}
	public Farmer(){}
	//Setter  Methods for the class
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setContact_Number(String contact_number)
	{
		this.contact_number=contact_number;
	}
	public void setAdress(String adress)
	{
		this.adress=adress;
	}
	public void setNo_Acres(int no_acres)
	{
		this.no_acres=no_acres;
	}
	public void setField_Type(String field_type)
	{
		this.field_type=field_type;
	}
	public void setWater_Condition(String water_condition)
	{
		this.water_condition=water_condition;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	//Getter Method for the class
	public String getName()
	{
		return name;
	}
	public String getContact_Number()
	{
		return contact_number;
	}
	public String getAdress()
	{
		return adress;
	}
	public int getNo_Acres()
	{
		return no_acres;
	}
	public String getField_Type()
	{
		return field_type;
	}
    public String getWater_Condition()
	{
		return water_condition;
	}
	public int getPrice()
	{
		return price;
}
public void display()//display the farmer detail
{
	 System.out.println("***************************************");
	System.out.println("Name : "+getName());
	System.out.println("Contact Number : "+getContact_Number());
	System.out.println("Adress : "+getAdress());
	System.out.println("ACres : "+getNo_Acres());
	System.out.println("Field Type : "+getField_Type());
	System.out.println("Water condition : "+getWater_Condition());
	System.out.println("Price : "+getPrice());
    System.out.println("***************************************");
	
}
//add farmer method to store the farmer data its basic info 
	ArrayList<Farmer>farmer=new ArrayList<Farmer>();//making an array list of farmer type
	public void add_farmer(String name,String contact_number,String adress,
	int no_acres,String field_type,String water_condition,int price)
	{
		//initializing the array list
		farmer.add(new Farmer(name,contact_number,adress,no_acres,
	field_type,water_condition,price));
	
}
public void farmerDetail()//show thw farmer data
{
	Iterator<Farmer>al=farmer.iterator();
			   while(al.hasNext())
			   {
				   al.next().display();
				   }
		   }
}