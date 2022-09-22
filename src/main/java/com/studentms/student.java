package com.studentms;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class student {
	@Id
	private int stId;
	private String stName;
	private String stGroup;	
}
