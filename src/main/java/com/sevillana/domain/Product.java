package com.sevillana.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.utility.nullability.NeverNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//TODO: add validations
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	@NotEmpty
	private String name;
	
	@Column(name = "description")
	@NotEmpty
	private String description;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "date")
	private Date date;
	
	@Column(name = "input")
	@NegativeOrZero
	@NeverNull
	private Integer input;
	
	@Column(name = "value")
	@NegativeOrZero
	@NotNull
	private Long value;
	
}
