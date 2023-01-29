package com.sevillana.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	// TODO: Add validations,and relation with the entity Person
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotEmpty
	@Column(name = "username")
	private String userName;

	@NotEmpty
	@Column(name = "password", length = 45, nullable =false)
	private String password;
	
	@OneToMany
	@JoinColumn(name = "id_user")
	private List<Rol> roles;
/*	
	@OneToOne
	@JoinColumn(name = "persona_id")
	private Person person;
*/
	
	
}
