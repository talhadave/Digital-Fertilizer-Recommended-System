public class Vegetable extends Crop{
		//Making the constructor of class
	
	public Vegetable(String crop_name,int quantity,String season,String area,String field_type,float average_gain,int price)
	{
		super("Okra",5,"Summer","Fertilized","Punjab",67,30000);
		this.crop_name=crop_name;
		this.quantity=quantity;
		this.season=season;
		this.area=area;
		this.average_gain=average_gain;
        this.field_type=field_type;	
		this.price=price;
	}
	//Making the setter method for crop class
	
	public void setCrop_Name3(String crop_name)
	{
		super.setCrop_Name("Okra");
		this.crop_name="Lady Finger";
	}
	public void setQuantity3(int quantity)
	{
		super.setQuantity(7);
		this.quantity=7;
	}
	public void setSeason3(String season)
	{
		super.setSeason("Summer");
		this.season="Autumn";
	}
	public void setArea3(String area)
	{
		super.setArea("Balochistan");
		this.area="Balochistan";
	}
	public void setAverage_Gain3(float average_gain)
	{
		super.setAverage_Gain(120);
		this.average_gain=120;
	}
	public void setField_Type3(String field_type)
	{
		super.setField_Type("Both");
		this.field_type="Both";
	}
	public void setPrice3(int price)
	{
		super.setPrice(35000);
		this.price=35000;
	}
	
	//Getter method for the class
	
	public String getCrop_Name3()
	{
		return crop_name;
	}
	public int getQuantity3()
	{
		return quantity;
	}
	public String getSeason3()
	{
		return season;
	}
	public String getArea3()
	{
		return area;
	}
	public float getAverage_Gain3()
	{
		return average_gain;
	}
	public String getField_Type3()
	{
		return field_type;
	}
	public int getPrice3()
	{
		return price;
}
public void display3()
{
	System.out.println("***********************************");
	System.out.println("Name : "+getCrop_Name3());
	System.out.println("Quantity : "+getQuantity3()+" kg");
	System.out.println("Season : "+getSeason3());
	System.out.println("Area : "+getArea3());
	System.out.println("Field Type : "+getField_Type3());
	System.out.println("price : "+getPrice3()+" thousands");
	System.out.println("Average Gain : "+getAverage_Gain3()+" kg"+" : per day");
	System.out.println("***********************************");
}
}