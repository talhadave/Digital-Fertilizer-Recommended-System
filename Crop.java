public class Crop
{
	//Attributes of class
	
	protected String crop_name;//Store the crop name
	protected int quantity;//Store that the How many quantity is required per acre
	protected String season;//store that in which season the crop seed
	protected String area;//Which area is suited for the crop
	protected String field_type;//store that what is the type of field
	protected float average_gain;//store that what is the average gain of the crop
	protected int price;
	
	//Making the constructor of class
	
	 public Crop(String crop_name,int quantity,String season,String area,String field_type,float average_gain,int price)
	{
		this.crop_name=crop_name;
		this.quantity=quantity;
		this.season=season;
		this.area=area;
		this.field_type=field_type;
		this.average_gain=average_gain;
		this.price=price;
	} 
	
	//Making the setter method for crop class
	
	public void setCrop_Name(String crop_name)
	{
		this.crop_name=crop_name;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public void setSeason(String season)
	{
		this.season=season;
	}
	public void setArea(String area)
	{
		this.area=area;
	}
	public void setAverage_Gain(float average_gain)
	{
		this.average_gain=average_gain;
	}
	public void setField_Type(String field_type)
	{
		this.field_type=field_type;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	//Getter method for the class
	
	public String getCrop_Name()
	{
		return crop_name;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public String getSeason()
	{
		return season;
	}
	public String getArea()
	{
		return area;
	}
	public float getAverage_Gain()
	{
		return average_gain;
	}
	public String getField_Type()
	{
		return field_type;
	}
	public int getPrice()
	{
		return price;
	}
}