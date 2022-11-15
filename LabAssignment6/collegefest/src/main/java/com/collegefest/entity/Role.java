package com.collegefest.entity;

import javax.persistence.Entity;

import java.util.Set;

import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString(exclude = "user")
@EqualsAndHashCode(of = "roleId")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long role_id;
	private String roleName;
	
	
	@ManyToMany(mappedBy ="roles",fetch=FetchType.LAZY)
	
	 private Set<User> user;
}

