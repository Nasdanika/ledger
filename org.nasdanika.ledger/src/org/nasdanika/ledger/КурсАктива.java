package org.nasdanika.ledger;

import java.math.BigDecimal;
import java.util.Date;

public class КурсАктива {
	
	private Date дата;
	private BigDecimal курс;
	
	public Date getДата() {
		return дата;
	}
	public void setДата(Date дата) {
		this.дата = дата;
	}
	public BigDecimal getКурс() {
		return курс;
	}
	public void setКурс(BigDecimal курс) {
		this.курс = курс;
	}
	
	public КурсАктива(Date дата, BigDecimal курс) {
		super();
		this.дата = дата;
		this.курс = курс;
	}
	
	public КурсАктива() {
		// Default constructor.
	}

}
