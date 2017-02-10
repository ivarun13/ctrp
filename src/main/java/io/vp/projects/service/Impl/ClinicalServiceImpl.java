package io.vp.projects.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.vp.projects.Repository.ClinicalRepository;
import io.vp.projects.domain.ClinicalTrial;
import io.vp.projects.service.ClinicalService;

@Service
public class ClinicalServiceImpl implements ClinicalService {

	@Autowired
	private ClinicalRepository clinicalRepository;

	@Override
	public List<ClinicalTrial> getAllRecords() {
		return clinicalRepository.findAll();
	}
}
