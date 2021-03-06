package com.pawnini.model.cs.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pawnini.model.cs.CsDTO;
import com.pawnini.model.cs.CsService;

@Service("csService")
public class CsServiceImpl implements CsService {
	
	@Autowired
	private CsDAOImpl csDAO;
	
	public void insertCs(CsDTO dto) {
		csDAO.insertCs(dto);
	}
	
	public void updateCs(CsDTO dto) {
		csDAO.updateCs(dto);
	}
	
	public void deleteCs(CsDTO dto) {
		csDAO.deleteCs(dto);
	}
	public CsDTO getCs(CsDTO dto) {
		return csDAO.getCs(dto);
	}
	public List <CsDTO> getCsList(CsDTO dto) {
		return csDAO.getCsList(dto);
	}
	
}
