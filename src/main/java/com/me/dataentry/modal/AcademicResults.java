package com.me.dataentry.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "School_CM_Academicresults")
public class AcademicResults {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	String schoolId;
	Date academicYear;
	int tenthAppeared;
	int tenthPassed;
	int eleventhAppeared;
	int eleventhPassed;
	int tweelthAppeared;
	int tweelthPassed;
	String academicsYear;
}
