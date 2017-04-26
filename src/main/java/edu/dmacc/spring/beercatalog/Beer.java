package edu.dmacc.spring.beercatalog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="beers")
public class Beer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String brewery;
	private String abv;
	private String description;
	private String type;
	private String origincountry;
	private boolean cellarable;
	
	
	public Beer() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBrewery() {
		return brewery;
	}

	public void setBrewery(String brewery) {
		this.brewery = brewery;
	}

	public String getAbv() {
		return abv;
	}

	public void setAbv(String abv) {
		this.abv = abv;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrigincountry() {
		return origincountry;
	}

	public void setOrigincountry(String origincountry) {
		this.origincountry = origincountry;
	}

	public boolean isCellarable() {
		return cellarable;
	}

	public void setCellarable(boolean cellarable) {
		this.cellarable = cellarable;
	}
	

	
}
