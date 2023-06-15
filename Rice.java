public class Rice extends Crop{
	
		//Making the constructor of class
	
	public Rice(String crop_name,int quantity,String season,String area,String field_type,float average_gain,int price)
	{
		super("Rice",5,"Summer","Punjab","Fertilezed",67,40000);
		this.crop_name=crop_name;
		this.quantity=quantity;
		this.season=season;
		this.area=area;
		this.field_type=field_type;
		this.average_gain=average_gain;
        this.price=price;		
	}
	//Making the setter method for crop class
	
	public void setCrop_Name1(String crop_name)
	{
		super.setCrop_Name("Rice");
		this.crop_name="Rice";
	}
	public void setQuantity1(int quantity)
	{
		super.setQuantity(5);
		this.quantity=5;
	}
	public void setSeason1(String season)
	{
		super.setSeason("Summer");
		this.season="Summer";
	}
	public void setArea1(String area)
	{
		super.setArea("Punjab");
		this.area="Pujab";
	}
	public void setAverage_Gain1(float average_gain)
	{
		super.setAverage_Gain(1800);
		this.average_gain=1800;
	}
	public void setField_Type1(String field_type)
	{
		super.setField_Type("fertilized field wich accupied more water");
		this.field_type="fertilized field wich accupied more water";
	}
	public void setPrice1(int price)
	{
		super.setPrice(40000);
		this.price=40000;
	}
	
	//Getter method for the class
	
	public String getCrop_Name1()
	{
		return crop_name;
	}
	public int getQuantity1()
	{
		return quantity;
	}
	public String getSeason1()
	{
		return season;
	}
	public String getArea1()
	{
		return area;
	}
	public float getAverage_Gain1()
	{
		return average_gain;
	}
	public String getField_Type1()
	{
		return field_type;
	}
	public int getPrice1()
	{
		return price;
}
public void display1()//display the rice detail
{
	System.out.println("***********************************");
	System.out.println("Name : "+getCrop_Name1());
	System.out.println("Quantity : "+getQuantity1()+" kg");
	System.out.println("Season : "+getSeason1());
	System.out.println("Area : "+getArea1());
	System.out.println("Field Type : "+getField_Type1());
	System.out.println("price : "+getPrice1()+" thousands");
	System.out.println("Average Gain : "+getAverage_Gain1()+" kg");
	System.out.println("***********************************");
}
}