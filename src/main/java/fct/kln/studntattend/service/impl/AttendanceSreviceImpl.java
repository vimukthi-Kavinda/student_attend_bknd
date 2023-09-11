package fct.kln.studntattend.service.impl;

import java.sql.Timestamp;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fct.kln.studntattend.model.bean.AttendanceBean;
import fct.kln.studntattend.model.bean.ResponseBean;
import fct.kln.studntattend.model.entity.Student;
import fct.kln.studntattend.model.entity.StudentRegister;
import fct.kln.studntattend.model.entity.StudentRegisterId;
import fct.kln.studntattend.model.entity.Teacher;
import fct.kln.studntattend.model.entity.TeacherRegister;
import fct.kln.studntattend.model.entity.TeacherRegisterId;
import fct.kln.studntattend.repository.StudentRegistryRepository;
import fct.kln.studntattend.repository.StudentRepository;
import fct.kln.studntattend.repository.TeacherRegisterRepository;
import fct.kln.studntattend.repository.TeacherRepository;
import fct.kln.studntattend.service.AttendanceService;
import fct.kln.studntattend.util.MessageVarList;

@Service
public class AttendanceSreviceImpl implements AttendanceService {

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	StudentRegistryRepository studentRegistryRepository;

	@Autowired
	TeacherRegisterRepository teacherRegisterRepository;

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	TeacherRepository teacherRepository;

	@Override
	public ResponseBean markAttendanceStudent(Object body) {

		ResponseBean responseBean = new ResponseBean();

		AttendanceBean ab = modelMapper.map(body, AttendanceBean.class);

		try {
			if (ab.getStudentid() != null && !ab.getStudentid().equals("")) {

				Optional<Student> st = studentRepository.findById(ab.getStudentid());
				if (st.isPresent()) {
					
					StudentRegister srg = new StudentRegister();
					Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
					srg.setStudentId(new StudentRegisterId(st.get(), currentTimestamp));
					studentRegistryRepository.saveAndFlush(srg);
					responseBean.setCode(MessageVarList.CODE_SUCCESS);
					responseBean.setMessage(MessageVarList.ADDING_SUCCESS);

				} else {
					responseBean.setCode(MessageVarList.CODE_FAIL);
					responseBean.setMessage(MessageVarList.NO_STUDENT_FOUND);
				}

			} else {
				responseBean.setCode(MessageVarList.CODE_FAIL);
				responseBean.setMessage(MessageVarList.ADDING_FAIL);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return responseBean;
	}

	@Override
	public ResponseBean markAttendanceTeacher(Object body) {
		ResponseBean responseBean = new ResponseBean();
		AttendanceBean ab = modelMapper.map(body, AttendanceBean.class);

		try {
			if (ab.getTeacherid() != null && !ab.getTeacherid().equals("")) {

				Optional<Teacher> st = teacherRepository.findById(ab.getTeacherid());
				if (st.isPresent()) {
					
					TeacherRegister trg = new TeacherRegister();
					Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
					trg.setTeacherRegisterId(new TeacherRegisterId(st.get(), currentTimestamp));
					teacherRegisterRepository.saveAndFlush(trg);
					responseBean.setCode(MessageVarList.CODE_SUCCESS);
					responseBean.setMessage(MessageVarList.ADDING_SUCCESS);

				} else {
					responseBean.setCode(MessageVarList.CODE_FAIL);
					responseBean.setMessage(MessageVarList.NO_TEACHER_FOUND);
				}
				
			} else {
				responseBean.setCode(MessageVarList.CODE_FAIL);
				responseBean.setMessage(MessageVarList.ADDING_FAIL);

			}
		} catch (Exception e) {
			e.printStackTrace();

		}

		return responseBean;
	}
	
	
	

	@Override
	public ResponseBean getStudents(Object body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBean getTeacherAttendance(Object body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBean getMonthlyAttendanceTeacher(Object body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBean getAttendance(Object body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBean getMonthlyAttendance(Object body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseBean addChild(Object body) {
		
	}

	@Override
	public ResponseBean addTeacher(Object body) {
		
	}

}
