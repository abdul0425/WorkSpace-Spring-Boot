package com.mehmed.cafe.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mehmed.cafe.constant.CafeConstants;
import com.mehmed.cafe.dao.UserRepo;
import com.mehmed.cafe.model.UserModel;
import com.mehmed.cafe.utils.CafeUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	public UserRepo repo;
	
	@Override
	public ResponseEntity<String> signUp(UserModel userModel) {
		// TODO Auto-generated method stub
		log.info("Inside signUp {} " + userModel);
		try {
			if (validateSignUp(userModel)) {
				UserModel model = repo.findByEmail(userModel.getEmail());
				if(Objects.isNull(model)) {
					userModel.setRole("user");
					userModel.setStatus("false");
					
					repo.save(userModel);
					
					return CafeUtils.getResponseEntity("Successfully Registered !", HttpStatus.OK);
				}
				else {
					return CafeUtils.getResponseEntity("Email already exists.", HttpStatus.BAD_REQUEST);
				}
			} else {
				return CafeUtils.getResponseEntity(CafeConstants.INALID_DATA, HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	private boolean validateSignUp(UserModel model) {
		if (model.getName() != null && model.getEmail() != null && model.getContactNumber() != null
				&& model.getPassword() != null)
			return true;
		else
			return false;
	}

}
