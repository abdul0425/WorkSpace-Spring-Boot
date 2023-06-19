package com.mehmed.esop.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.esop.dto.GrantDto;
import com.mehmed.esop.model.GrantModel;
import com.mehmed.esop.repository.GrantRepository;

@Service
public class GrantService {

	@Autowired
	private GrantRepository grantRepository;
	
	
	
	public void processGrantDetails(List<GrantDto> grantDtoList) {
		List<GrantModel> grantModelList = new ArrayList<>();
		grantModelList = getAllGrantsDetails( grantDtoList);
		grantRepository.saveAll(grantModelList);
	}
	
	
	public List<GrantModel> getAllGrantsDetails(List<GrantDto> grantDtoList)
	{
		List<GrantModel> grantModelList = new ArrayList<>();
		
		
		grantDtoList.stream().forEach(grantDto -> {
			GrantModel grantModel = new GrantModel();
			grantModel.setGrantId(grantDto.getGrantId());
			grantModel.setEmployeeNumber(grantDto.getEmployeeNumber());
			grantModel.setNumbersOfGrants(grantDto.getNumbersOfGrants());
			grantModel.setBand(grantDto.getBand());
			grantModel.setGrantPrice(grantDto.getGrantPrice());
			grantModel.setLockInStatus(grantDto.getLockInStatus());
			grantModel.setFrequency(grantDto.getFrequency());
			grantModel.setVestingTenure(grantDto.getVestingTenure());
			grantModel.setGrantStatus("open");
			grantModel.setAccepted(false);
			grantModel.setAcceptedDate(new Date());
			grantModel.setAllocationStatus("open");
			
			grantModelList.add(grantModel);
		});
		
		return grantModelList;
	}


	public void approveAllGrantStatus(List<Long> grantIdList) {
		grantIdList.stream().forEach(grantId ->{
			GrantModel grantModel = findGrantModelByGrantId(grantId);
			grantModel.setGrantStatus("approved");
			grantRepository.save(grantModel);
		});
	}
	
	public GrantModel findGrantModelByGrantId(Long grantId)
	{
		return grantRepository.findById(grantId).get();
	}

	
	public void updateAllGrantModelDetails(List<GrantModel> grantModelList) {
		grantModelList.stream().forEach(grantModel -> {
			grantModel.setAllocationStatus("allocated");
			grantRepository.save(grantModel);
		});
	}
}
