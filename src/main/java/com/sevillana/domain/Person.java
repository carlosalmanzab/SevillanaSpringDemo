package com.sevillana.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.sevillana.enums.Licence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Person")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@NotEmpty
	@Column(name = "name",length = 45, nullable = false)
	private String name;

	@NotEmpty
	@Column(name = "lastName",length = 45, nullable = false)
	private String lastName;

	@NotNull
	@Min(value = 18)
	@Column(name = "age", length = 2)
	private Integer age;
	
	@NotNull
	@Column(name = "licence")
	private Licence licence;

	@Email
	@Column(name = "email")
	private String email;
	
	@NotEmpty
	@Column(name = "address")
	private String address;

	
}
