public class Fertilizer extends Chemical{
		//Making the constructor of class
	
	public Fertilizer(String chemical_name,String crop_name,int chemical_quantity,String effect,int days,int price4)
	{
		super("DAP","Rice",50,"any type","increase phosphuros in fertilizer",30,1800);
		this.chemical_name=chemical_name;
		this.crop_name=crop_name;
		this.chemical_quantity=chemical_quantity;	
		this.effect=effect;
		this.days=days;
		this.field_type=field_type;
		this.price=price;
	}
	//Making the setter method for crop class
	
	public void setChemical_Name1(String chemical_name)
	{
		super.setChemical_Name("DAP");
		this.chemical_name="DAP";
	}
	public void setChemical_Quantity1(int chemical_quantity)
	{
		super.setChemical_Quantity(50);
		this.chemical_quantity=50;
	}
	public void setField_Type4(String field_type)
	{
		super.setField_Type("Fertilezed");
		this.field_type="Fertilized";
	}
	public void setEffect1(String effect)
	{
		super.setEffect("increase the phosphuros in the field");
		this.effect="increase phosphuros in field";
	}
	public void setDays1(int days)
	{
		super.setDays(3);
		this.days=3;
	}
	public void setPrice4(int price)
	{
		super.setPrice(3650);
		this.price=3650;
	}
	
	//Getter method for the class
	
	public String getChemical_Name1()
	{
		return chemical_name;
	}
	public int getChemical_Quantity1()
	{
		return chemical_quantity;
	}
	public String getField_Type4()
	{
		return field_type;
	}
	public String getEffect1()
	{
		return effect;
	}
    public int  getDays1()
	{
		return days;
	}
	public int getPrice4()
	{
		return price;
}
public void display4()
{
	System.out.println("***********************************");
	System.out.println("Name : "+getChemical_Name1());
	System.out.println("Quantity : "+getChemical_Quantity1()+" kg");
	System.out.println("Field Type : "+getField_Type4());
	System.out.println("Effect : "+getEffect1());
	System.out.println("Days : "+getDays1()+" month");
	System.out.println("price : "+getPrice4()+" thousands");
	System.out.println("***********************************");
	
}
}