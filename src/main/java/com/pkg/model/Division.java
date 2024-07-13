package com.pkg.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_division")
public class Division {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "div_id")
	private Long id;

	@Column(name = "div_name")
	private String divisionName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
}
