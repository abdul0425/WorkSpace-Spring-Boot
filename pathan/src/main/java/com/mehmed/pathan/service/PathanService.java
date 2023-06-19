package com.mehmed.pathan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.pathan.dto.PathanDto;
import com.mehmed.pathan.exception.ResponseNotFoundException;
import com.mehmed.pathan.model.PathanModel;
import com.mehmed.pathan.repository.PathanRepo;

@Service
public class PathanService {

	@Autowired
	private PathanRepo pathanRepo;
	
	public PathanModel saveMovie(PathanDto pathanDto) {
		// TODO Auto-generated method stub
		PathanModel model = new PathanModel();
		model.setActor(pathanDto.getActor());
		model.setActress(pathanDto.getActress());
		model.setRating(pathanDto.getRating());
		
		return pathanRepo.save(model);
	}
	
	public PathanModel updateDetails(PathanModel model, Long  id) {
		// check whether id is correct or not
		Optional<PathanModel> optional = pathanRepo.findById(id);
		if(optional.isPresent()) {
			PathanModel pathanModel = optional.get();
			pathanModel.setActor(model.getActor());
			pathanModel.setActress(model.getActress());
			pathanModel.setRating(model.getRating());
			return pathanRepo.save(pathanModel);
		}
		else {
			throw new ResponseNotFoundException("PathanModel", "id", id);
		}
	}

	public PathanModel getDetails(Long id) {
		// TODO Auto-generated method stub
		return pathanRepo.findById(id).get();
	}

	public String deleteDetails(Long id) {
		// TODO Auto-generated method stub
		Optional<PathanModel> optional = pathanRepo.findById(id);
		if(optional.isPresent()) {
			pathanRepo.deleteById(id);
			return "Details Deleted Succesfully !";
		}
		else {
			throw new ResponseNotFoundException("Details", "id", id);
		}
		
	}
	
	public List<PathanModel> getAll() {
		return pathanRepo.findAll();
	}

}
