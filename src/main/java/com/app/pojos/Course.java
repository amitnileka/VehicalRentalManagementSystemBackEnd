package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.app.enums.CourseType;

@Entity
@Table(name = "Course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	//@NotBlank
	private String name;
	
	@Column
	@Enumerated(EnumType.STRING)
	private CourseType cType;
	
	@Column
	private LocalDate startDate;
	
	@Column
	private LocalDate endDate;

	@Column
	private double fee;
	
	
	@Column
	private double grade;


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", cType=" + cType + ", startDate=" + startDate + ", endDate="
				+ endDate + ", fee=" + fee + ", grade=" + grade + "]";
	}


	public Course(Long id, String name, CourseType cType, LocalDate startDate, LocalDate endDate, double fee,
			double grade) {
		super();
		this.id = id;
		this.name = name;
		this.cType = cType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fee = fee;
		this.grade = grade;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public CourseType getcType() {
		return cType;
	}


	public void setcType(CourseType cType) {
		this.cType = cType;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	public double getFee() {
		return fee;
	}


	public void setFee(double fee) {
		this.fee = fee;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}
}
