package application;

public class OrderBean {
	
	   private String orderDate;
	   private String region;
	   private String rep1;
	   private String rep2;
	   private String item;
	   private Long units;
	   private String unitCost;
	   private String total;
	   
	public OrderBean(
			String orderDate,
			String region,
			String rep1,
			String rep2,
			String item,
			Long units,
			String unitCost,
			String total) 
	{	
		super();
		this.orderDate = orderDate;
		this.region = region;
		this.rep1 = rep1;
		this.rep2 = rep2;
		this.item = item;
		this.units = units;
		this.unitCost = unitCost;
		this.total = total;
	}	
	
	public OrderBean() {
		super();
		this.orderDate = null;
		this.region = null;
		this.rep1 = null;
		this.rep2 = null;
		this.item = null;
		this.units = null;
		this.unitCost = null;
		this.total = null;
	}

	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRep1() {
		return rep1;
	}
	public void setRep1(String rep1) {
		this.rep1 = rep1;
	}
	public String getRep2() {
		return rep2;
	}
	public void setRep2(String rep2) {
		this.rep2 = rep2;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Long getUnits() {
		return units;
	}
	public void setUnits(Long units) {
		this.units = units;
	}
	public String getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "OrderBean [orderDate=" + orderDate + ", region=" + region + ", rep1=" + rep1 + ", rep2=" + rep2
				+ ", item=" + item + ", units=" + units + ", unitCost=" + unitCost + ", total=" + total + "]";
	}
	   
	   
}
