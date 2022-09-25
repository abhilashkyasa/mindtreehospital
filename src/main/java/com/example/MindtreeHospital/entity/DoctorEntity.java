package com.example.MindtreeHospital.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class DoctorEntity {
	
		
		@Id
		private int id;
		private String name;
		private int salary;
		private String specialist;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getSpecialist() {
			return specialist;
		}
		public void setSpecialist(String specialist) {
			this.specialist = specialist;
		}
		
		public DoctorEntity(int id, String name, int salary, String specialist) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.specialist = specialist;
		}
		public DoctorEntity() {
			super();}
		@Override
		public String toString() {
			return "DoctorEntity [id=" + id + ", name=" + name + ", salary=" + salary + ", specialist=" + specialist
					+ "]";
		}
		
		
}
	