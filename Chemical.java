public  class Chemical {
	// Attributes of the class 
	
	protected String chemical_name;//store the name chemical
	protected String crop_name;//store the name of crop that which chemical is suitable for specific crop
	protected String quality;//store that what is the quality of chemical
	protected int chemical_quantity ;//store that ho wmany quantity is required for specific crop per acre
	protected String effect;//store that what is the effect of the chemical
	protected int days;//store that how many days it show its effect
	protected int price;//store the price of the Chemical 
	protected String field_type;//store that which type of field it effect
	
	//making the constructor of the class
	
	public Chemical(String chemical_name,String crop_name,int chemical_quantity,String quality,String effect,int days,int price)
	{
		this.chemical_name=chemical_name;
		this.crop_name=crop_name;
		this.chemical_quantity=chemical_quantity;	
		this.effect=effect;
		this.days=days;
		this.price=price;
	}
	
	//setter method for the class
	
	 public void setChemical_Name(String name)
	{
		this.chemical_name=chemical_name;
	}
	public void setChemical_Quantity(int chemical_quantity)
	{
		this.chemical_quantity=chemical_quantity;
	}
	public void setEffect(String effect)
	{
		this.effect=effect;
	}
	public void setDays(int days)
	{
		this.days=days;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setField_Type(String field_type)
	{
	this.field_type=field_type;
	}
	//Getter Method of the class
	 
	public String getChemical_Name()
	{
	    return chemical_name;
	 }
    public String getCrop_Name()
	{
    return crop_name;
	}	
	public int getChemical_Quantity()
	{
		return chemical_quantity;
	}
	public String getEffect()
	{
		return effect;
	}
	public int getDays()
	{
		return days;
	}
	public int getPrice()
	{
		return price;
	}
	public String getField_Type()
	{
	return field_type;
	}
}