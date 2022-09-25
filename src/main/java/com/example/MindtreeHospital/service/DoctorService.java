package com.example.MindtreeHospital.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.MindtreeHospital.entity.DoctorEntity;
import com.example.MindtreeHospital.exception.DoctorExist;

@Service
public interface DoctorService {
	
		
		public String addDoctor(DoctorEntity Doctor) throws DoctorExist;
		
		public List<DoctorEntity> getDoctor();
		
		public DoctorEntity updateDoctor(DoctorEntity Doctor, int id) ;
	}