public class Grain extends Crop{
		//Making the constructor of class
	
	public Grain(String crop_name,int quantity,String season,String area,String field_type,float average_gain,int price)
	{
		super("Grain",5,"Summer","Punjab,Sindh","Fertilized",67,2500);
		this.crop_name=crop_name;
		this.quantity=quantity;
		this.season=season;
		this.area=area;
		this.average_gain=average_gain;
        this.field_type=field_type;	
		this.price=price;
	}
	//Making the setter method for crop class
	
	public void setCrop_Name2(String crop_name)
	{
		super.setCrop_Name("Grain");
		this.crop_name="Grain";
	}
	public void setQuantity2(int quantity)
	{
		super.setQuantity(35);
		this.quantity=35;
	}
	public void setSeason2(String season)
	{
		super.setSeason("winter");
		this.season="winter";
	}
	public void setArea2(String area)
	{
		super.setArea("sindh");
		this.area="sindh";
	}
	public void setAverage_Gain2(float average_gain)
	{
		super.setAverage_Gain(35);
		this.average_gain=35;
	}
	public void setField_Type2(String field_type)
	{
		super.setField_Type("unFertilized");
		this.field_type="unFertilized";
	}
	public void setPrice2(int price)
	{
		super.setPrice(25000);
		this.price=25000;
	}
	
	//Getter method for the class
	
	public String getCrop_Name2()
	{
		return crop_name;
	}
	public int getQuantity2()
	{
		return quantity;
	}
	public String getSeason2()
	{
		return season;
	}
	public String getArea2()
	{
		return area;
	}
	public float getAverage_Gain2()
	{
		return average_gain;
	}
	public String getField_Type2()
	{
		return field_type;
	}
	public int getPrice2()
	{
		return price;
}
public void display2()//display the detail of grain crop
{
	System.out.println("***********************************");
	System.out.println("Name : "+getCrop_Name2());
	System.out.println("Quantity : "+getQuantity2()+" kg");
	System.out.println("Season : "+getSeason2());
	System.out.println("Area : "+getArea2());
	System.out.println("Field Type : "+getField_Type2());
	System.out.println("price : "+getPrice2()+" thousands");
	System.out.println("Average Gain : "+getAverage_Gain2()+" kg");
	System.out.println("***********************************");
}
}