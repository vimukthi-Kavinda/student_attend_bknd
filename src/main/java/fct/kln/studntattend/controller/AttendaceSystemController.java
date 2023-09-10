package fct.kln.studntattend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fct.kln.studntattend.model.bean.ResponseBean;
import fct.kln.studntattend.service.AttendanceService;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/attendancesys")
public class AttendaceSystemController {

	@Autowired
	private AttendanceService attendanceSrevice;
	
	Logger logger = LoggerFactory.getLogger(AttendaceSystemController.class);

	@PostMapping("/studentattend")
	public ResponseEntity<?> markAttendanceStudent(
			@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
			@RequestBody Object body) {
		ResponseEntity<?> responseEntity = null;

		logger.info("Student Attendance marking starting");
		ResponseBean responseBean = attendanceSrevice.markAttendanceStudent(body);

		logger.info("Student Attendance marking returning");
		return responseEntity;
	}
	
	@PostMapping("/teacherattend")
	public ResponseEntity<?> markAttendanceTeacher(
			@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
			@RequestBody Object body) {
		ResponseEntity<?> responseEntity = null;

		logger.info("Teacher Attendance marking starting");
		ResponseBean responseBean = attendanceSrevice.markAttendanceTeacher(body);

		logger.info("Teacher Attendance marking returning");
		return responseEntity;
	}
	
	
	@PostMapping("/addstudent")
	public ResponseEntity<?> addChild(
			@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
			@RequestBody Object body) {
		ResponseEntity<?> responseEntity = null;

		logger.info("Add student starting");
		ResponseBean responseBean = attendanceSrevice.addChild(body);

		logger.info("Add student returning");
		return responseEntity;
	}
	
	@PostMapping("/addteacher")
	public ResponseEntity<?> addTeacher(
			@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
			@RequestBody Object body) {
		ResponseEntity<?> responseEntity = null;

		logger.info("add Teacher starting");
		ResponseBean responseBean = attendanceSrevice.addTeacher(body);

		logger.info("add Teacher returning");
		return responseEntity;
	}
	
	

	// gets total attendance of a month by strudent
	@GetMapping("/getattendmonth")
	public ResponseEntity<?> getMonthlyAttendance(
			@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
			@RequestBody(required = false) Object body, @RequestParam(defaultValue = "false") boolean search

	) {
		logger.info("get attend month starting");
		ResponseEntity<?> responseEntity = null;

		ResponseBean responseBean = attendanceSrevice.getMonthlyAttendance(body);
		logger.info("get attend month returning");
		return responseEntity;

	}

	// gets student attendance
	@GetMapping("/getattendance")
	public ResponseEntity<?> getAttendance(
			@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
			@RequestBody(required = false) Object body, @RequestParam(defaultValue = "false") boolean search

	) {
		logger.info("get attendance starting");
		ResponseEntity<?> responseEntity = null;

		ResponseBean responseBean = attendanceSrevice.getAttendance(body);
		logger.info("get attendance returning");
		return responseEntity;

	}

	@GetMapping("/getstudent")
	public ResponseEntity<?> getStudents(
			@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
			@RequestBody(required = false) Object body, @RequestParam(defaultValue = "false") boolean search

	) {
		logger.info("get student starting");
		ResponseEntity<?> responseEntity = null;

		ResponseBean responseBean = attendanceSrevice.getStudents(body);
		logger.info("get student returning");
		return responseEntity;

	}
	
	
	@GetMapping("/getteacher")
	public ResponseEntity<?> getTeachers(
			@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
			@RequestBody(required = false) Object body, @RequestParam(defaultValue = "false") boolean search

	) {

		logger.info("get teacher starting");
		ResponseEntity<?> responseEntity = null;

		ResponseBean responseBean = attendanceSrevice.getStudents(body);
		logger.info("get teacher returning");
		return responseEntity;

	}
	
	
	
	
	// gets total attendance of a month by teacher
		@GetMapping("/getteacherattendmonth")
		public ResponseEntity<?> getMonthlyAttendanceTeacher(
				@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
				@RequestBody(required = false) Object body, @RequestParam(defaultValue = "false") boolean search

		) {
			logger.info("get teacher attend month starting");
			ResponseEntity<?> responseEntity = null;

			ResponseBean responseBean = attendanceSrevice.getMonthlyAttendanceTeacher(body);
			logger.info("get teacher attend month returning");
			return responseEntity;

		}

		// gets teacher attendance
		@GetMapping("/getteacherattendance")
		public ResponseEntity<?> getTeacherAttendance(
				@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
				@RequestBody(required = false) Object body, @RequestParam(defaultValue = "false") boolean search

		) {
			logger.info("get teacher attendance starting");

			ResponseEntity<?> responseEntity = null;

			ResponseBean responseBean = null;
			try {
			
			responseBean=attendanceSrevice.getTeacherAttendance(body);
			
			responseEntity=new ResponseEntity<>(responseBean,HttpStatus.OK);

			}catch(Exception e) {
				e.printStackTrace();
			}
			
			logger.info("get teacher attendance returning");
			
			return responseEntity;

		}

}
