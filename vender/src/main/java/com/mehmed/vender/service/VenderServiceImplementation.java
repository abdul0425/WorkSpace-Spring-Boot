package com.mehmed.vender.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.vender.dto.VenderDto;
import com.mehmed.vender.exception.VenderNotFoundException;
import com.mehmed.vender.model.VenderModel;
import com.mehmed.vender.repository.VenderRepo;
@Service
public class VenderServiceImplementation implements VenderService{

	
	public VenderRepo repo;
	
	@Autowired
	public VenderServiceImplementation(VenderRepo repo) {
		super();
		// TODO Auto-generated constructor stub
		this.repo=repo;
	}

	@Override
	public VenderModel saveVender(VenderDto dto) {
		// TODO Auto-generated method stub
		VenderModel venderModel = new VenderModel();
		venderModel.setVenderName(dto.getVenderName());
		venderModel.setLocation(dto.getLocation());
		venderModel.setContact(dto.getContact());
		
		return repo.save(venderModel);
	}

	@Override
	public VenderModel updateVender(VenderDto dto, Long id) {
		// TODO Auto-generated method stub
		Optional<VenderModel> optional = repo.findById(id);
		if(optional.isPresent()) {
			VenderModel venderModel = optional.get();
			venderModel.setVenderName(dto.getVenderName());
			venderModel.setLocation(dto.getLocation());
			venderModel.setContact(dto.getContact());
			
			return repo.save(venderModel);
		}
		throw new VenderNotFoundException("Requested Vender id : "+id+" is Not Available");
	}

	@Override
	public String deleteVender(Long id) {
		// TODO Auto-generated method stub
		Optional<VenderModel> optional = repo.findById(id);
		if(optional.isPresent()) {
			repo.delete(optional.get());
			return "Vender Deleted Successfully with id : "+id;
		}
		throw new VenderNotFoundException("Requested Vender id : "+id+" is Not Available");
	}

	@Override
	public VenderModel getVender(Long id) {
		// TODO Auto-generated method stub
		Optional<VenderModel> optional = repo.findById(id);
		if(optional.isPresent())
			return optional.get();
		throw new VenderNotFoundException("Requested Vender id : "+id+" is Not Available");
	}

	@Override
	public List<VenderModel> getAllVenders() {
		// TODO Auto-generated method stub
		if(!repo.findAll().isEmpty())
			return repo.findAll();
		throw new VenderNotFoundException("Table is Empty, No Vender Available");
	}

}
