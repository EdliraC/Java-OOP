
public class Invoice {
	
	String partNo;
	String partDesc;
	int itemQuantity;
	double price;
	
	
	public Invoice(String partNumber, String partDescription, int itemQ, double Price)
	{	
		partNo=partNumber;
		partDesc=partDescription;
		itemQuantity=itemQ;
		price=Price;
		
		// Mos lejo vlera negative per keto variabla 
		if(itemQuantity<0)
			itemQuantity=0;
		
			if(price<0)
			price=0;
		
	}
	
	public void setPartNo(String partNumber)
	{
		partNo=partNumber;
	}

	public String getPartNo()
	{
		return partNo;
	}
	
	public void setPartDesc(String partDescription)
	{
		partDesc=partDescription;
	}

	public String getPartDesc()
	{
		return partDesc;
	}
	
	public void setItemQuantity(int itemQuant)
	{
		itemQuantity=itemQuant;
	}

	public int getItemQuantity()
	{
		return itemQuantity;
	}
	
	public void setPrice(double ItemPrice)
	{
		price=ItemPrice;
	}

	public double getPrice()
	{
		return price;
	}
	
	public double getInvoiceAmount()
	{
		
		
		double amount=itemQuantity*price;
		
		return amount;
			
			
	}
}
