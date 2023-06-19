package com.mehmed.hospitalmanagementsystem.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmed.hospitalmanagementsystem.dto.AppointmentDto;
import com.mehmed.hospitalmanagementsystem.dto.EmailDto;
import com.mehmed.hospitalmanagementsystem.model.AppointmentModel;
import com.mehmed.hospitalmanagementsystem.model.DoctorSchedule;
import com.mehmed.hospitalmanagementsystem.model.PatientModel;
import com.mehmed.hospitalmanagementsystem.repository.AppointmentRepository;
import com.mehmed.hospitalmanagementsystem.repository.DoctorRepository;
import com.mehmed.hospitalmanagementsystem.repository.DoctorScheduleRepository;
import com.mehmed.hospitalmanagementsystem.repository.PatientRepository;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Autowired
	private DoctorScheduleRepository doctorScheduleRepository;
	
	@Autowired
	private PatientRepository patientRepository;

	@Autowired
	private RestUtilService restUtilService;
	
	/*
	 * @Autowired private ModelMapper modelMapper;
	 */
	
	
	public void bookAppointment(AppointmentDto appointmentDto) {
		DoctorSchedule doctorSchedule = getDoctorSchedule(appointmentDto.getDoctorId());

		if (doctorSchedule.getTotalAppointmentSlots() >= doctorSchedule.getAvailableSlots() &&  
				0< doctorSchedule.getAvailableSlots()){
			PatientModel patientModel = getPatientModel(appointmentDto.getPatientId());
			AppointmentModel appointmentModel = new AppointmentModel();
			appointmentModel.setAppointmentId(appointmentDto.getAppointmentId());
			appointmentModel.setDoctorId(appointmentDto.getDoctorId());
			appointmentModel.setPatientId(appointmentDto.getPatientId());
			appointmentModel.setDate(appointmentDto.getDate());
			appointmentModel.setTime(appointmentDto.getTime());
			appointmentModel.setBookingConfirmed(true);
			appointmentModel.setPrescription(appointmentDto.getPrescription());
			appointmentRepository.save(appointmentModel);
			Long availableSlots = doctorSchedule.getAvailableSlots();
			doctorSchedule.setAvailableSlots(--availableSlots);
			doctorScheduleRepository.save(doctorSchedule);
			
			
			EmailDto emailDto = new EmailDto();
			emailDto.setTo(patientModel.getEmail());
			emailDto.setFrom("arshadalam2099@gmail.com");
			emailDto.setSubject("Regarding Appointment");
			emailDto.setBody("Your Appointment has been booked Successfully !\n"
					+ "Appointment Id : "+appointmentDto.getAppointmentId()+"\n"
					+ "Timing : "+appointmentDto.getTime()+"\n"
					+ "Doctor Id :"+appointmentDto.getDoctorId()+"\n"
					+ "Prescription : "+appointmentDto.getPrescription());
			
			restUtilService.post("http://localhost:9090/emailService/sendPlainEmailFunctionality", emailDto);
			
		}
		else
		{	
			PatientModel patientModel = getPatientModel(appointmentDto.getPatientId());
			EmailDto emailDto = new EmailDto();
			emailDto.setTo(patientModel.getEmail());
			emailDto.setFrom("arshadalam2099@gmail.com");
			emailDto.setSubject("Regarding Cancellation");
			emailDto.setBody("We are Sorry , Slots are not available !");
		
			restUtilService.post("http://localhost:9090/emailService/sendPlainEmailFunctionality", emailDto);
		}
	}

	public DoctorSchedule getDoctorSchedule(Long doctorId) {
		return doctorScheduleRepository.findByDoctorId(doctorId);

	}
	
	public PatientModel getPatientModel(Long patientId) {
		return patientRepository.findByPatientId(patientId);
	}

}
