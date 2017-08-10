package com.mx.springboot.model;

public class Pending {

	private Integer id;
	private String type;
	private String description;
	private String urgency;

	public Pending() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pending(Integer id, String type, String description, String urgency) {
		super();
		this.id = id;
		this.type = type;
		this.description = description;
		this.urgency = urgency;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrgency() {
		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}

}
