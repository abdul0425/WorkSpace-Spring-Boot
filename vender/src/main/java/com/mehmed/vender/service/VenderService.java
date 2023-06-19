package com.mehmed.vender.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mehmed.vender.dto.VenderDto;
import com.mehmed.vender.model.VenderModel;

public interface VenderService {

	VenderModel saveVender(VenderDto dto);
	VenderModel updateVender(VenderDto dto,Long id);
	String deleteVender(Long id);
	VenderModel getVender(Long id);
	List<VenderModel> getAllVenders();
}
