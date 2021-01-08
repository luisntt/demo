package com.example.demo.models;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@EqualsAndHashCode
@Entity
@Table(name="members")
public class Member implements Serializable {

	private static final long serialVersionUID = -161454628032653997L;

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String name;
    
    private Date birthday;
    
    private String email;
    
    private String encryptedPassword;
    
    private String department;
    
    private Date memberSince;
    
	private boolean active;
    
    @CreationTimestamp
    private Timestamp createdAt;
    
    @UpdateTimestamp
	private Timestamp updatedAt;  
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    private Address address;
    
}