package com.example.demo.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@Entity
@EqualsAndHashCode
@Table(name="address")
public class Address implements Serializable{
	
	private static final long serialVersionUID = 5328197597306268450L;

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer address_id;

    private String city;
    
    private String state;
    
    private String postalCode;
    
    private String country;
    
	private String houseNumber;
    
    private String street;
    
    private String complement;
    
    @CreationTimestamp
    private Timestamp createdAt;
    
    @UpdateTimestamp
	private Timestamp updatedAt;
}
