package com.mehmed.esop.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.mehmed.esop.model.AllocationModel;
import com.mehmed.esop.model.GrantModel;
import com.mehmed.esop.model.PlanModel;
import com.mehmed.esop.repository.AllocationRepository;
import com.mehmed.esop.repository.GrantRepository;
import com.mehmed.esop.repository.PlanRepository;

@Service
public class AllocationService {

	@Autowired
	private GrantRepository grantRepository;

	@Autowired
	private GrantService grantService;
	@Autowired
	private PlanRepository planRepository;

	@Autowired
	private PlanService planService;

	@Autowired
	private AllocationRepository allocationRepository;

	public void prepareAndProcessAllocation() {
		PlanModel planModel = getCurrentActivePlan();
		System.out.println("Plan Model  :  "+planModel);
		List<GrantModel> grantModelList = getGrantModelForAllocationByPlanId(planModel.getPlanId());
		System.out.println("GrantModel List  : "+grantModelList);
		List<AllocationModel> allocationModelList = new ArrayList<>();
		for (GrantModel grantModel : grantModelList) {
			grantModel.setAllocationStatus("allocated");
			prepareAllocationDetails(grantModel, allocationModelList);
		}
		allocationRepository.saveAll(allocationModelList);
		grantService.updateAllGrantModelDetails(grantModelList);
		
	}

	public PlanModel getCurrentActivePlan() {
		return planRepository.findByIsCurrentPlan(true);
	}

	public List<GrantModel> getGrantModelForAllocationByPlanId(Long planId) {
		return grantRepository.findByGrantStatusAndAllocationStatusAndPlanId("approved","open",planId);
	}
	
	
	
	public void prepareAllocationDetails(GrantModel grantModel, List<AllocationModel> allocationModelList) {
		Long frequency = grantModel.getFrequency();
		System.out.println("Frequency  :  "+frequency);
		if(frequency > 0) {
			Long numberOfAllocations =  grantModel.getNumbersOfGrants() / frequency;
			for (int i = 0; i < frequency; i++) {
				AllocationModel allocationModel = new AllocationModel();
				allocationModel.setGrantId(grantModel.getGrantId());
				allocationModel.setNoOfAllocation(numberOfAllocations);
				allocationModel.setPlannedAllocationDate(LocalDate.now().plusYears(i));
				allocationModel.setAllocationYear(new Date());
				allocationModel.setAllocationStatus("open");

				allocationModelList.add(allocationModel);
			}
		} else {
			if(grantModel.getBand()<6) {
				Long individualAllocationNumber =  grantModel.getNumbersOfGrants() / 5;
				 for (int i = 0; i < 5; i++) {
					 AllocationModel allocationModel = new AllocationModel();
						allocationModel.setGrantId(grantModel.getGrantId());
						allocationModel.setNoOfAllocation(individualAllocationNumber);
						allocationModel.setPlannedAllocationDate(LocalDate.now().plusYears(i));
						allocationModel.setAllocationYear(new Date());
						allocationModel.setAllocationStatus("open");

						allocationModelList.add(allocationModel);
				}
			} else {
				AllocationModel allocationModel = new AllocationModel();
				allocationModel.setGrantId(grantModel.getGrantId());
				allocationModel.setNoOfAllocation(grantModel.getNumbersOfGrants());
				allocationModel.setPlannedAllocationDate(LocalDate.now().plusYears(1));
				allocationModel.setAllocationYear(new Date());
				allocationModel.setAllocationStatus("open");

				allocationModelList.add(allocationModel);
			}
		}
		

	}

//	@Scheduled(fixedDelay = 2000)
	@PostConstruct
	public void initiateThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Executed !");
				prepareAndProcessAllocation();
			}
		}).start();
	}

	public void approveAllocationStatus(List<Long> allocationIdList) {
		allocationIdList.stream().forEach(allocationId -> {
			AllocationModel allocationModel = getAllocationByAllocationId(allocationId);
			allocationModel.setAllocationStatus("approved");
			allocationModel.setActualAllocationDate(new Date());
			
			allocationRepository.save(allocationModel);
			
			
		});
	} 
	
	public AllocationModel getAllocationByAllocationId(Long allocationId) {
		return allocationRepository.findById(allocationId).get();
	}
	
	
	
	
	
	
	
	
	
	
	

}
