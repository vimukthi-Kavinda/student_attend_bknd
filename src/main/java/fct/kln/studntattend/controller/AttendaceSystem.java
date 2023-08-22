package fct.kln.studntattend.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
public class AttendaceSystem {

	@Autowired
	private AttendanceService attendanceSrevice;

	@PostMapping("/markattendance")
	public ResponseEntity<?> markAttendance(
			@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
			@RequestBody Object body) {
		ResponseEntity<?> responseEntity = null;

		ResponseBean responseBean = attendanceSrevice.markAttendance(body);

		return responseEntity;
	}

	// gets total attendance of a month by strudent
	@GetMapping("/getattendmonth")
	public ResponseEntity<?> getMonthlyAttendance(
			@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
			@RequestBody(required = false) Object body, @RequestParam(defaultValue = "false") boolean search

	) {

		ResponseEntity<?> responseEntity = null;

		ResponseBean responseBean = attendanceSrevice.getMonthlyAttendance(body);

		return responseEntity;

	}

	// gets student attendance
	@GetMapping("/getattendance")
	public ResponseEntity<?> getAttendance(
			@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
			@RequestBody(required = false) Object body, @RequestParam(defaultValue = "false") boolean search

	) {

		ResponseEntity<?> responseEntity = null;

		ResponseBean responseBean = attendanceSrevice.getAttendance(body);

		return responseEntity;

	}

	@GetMapping("/getstudent")
	public ResponseEntity<?> getStudents(
			@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
			@RequestBody(required = false) Object body, @RequestParam(defaultValue = "false") boolean search

	) {

		ResponseEntity<?> responseEntity = null;

		ResponseBean responseBean = attendanceSrevice.getStudents(body);

		return responseEntity;

	}
	
	
	@GetMapping("/getteacher")
	public ResponseEntity<?> getTeachers(
			@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
			@RequestBody(required = false) Object body, @RequestParam(defaultValue = "false") boolean search

	) {

		ResponseEntity<?> responseEntity = null;

		ResponseBean responseBean = attendanceSrevice.getStudents(body);

		return responseEntity;

	}
	
	
	
	
	// gets total attendance of a month by teacher
		@GetMapping("/getteacherattendmonth")
		public ResponseEntity<?> getMonthlyAttendanceTeacher(
				@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
				@RequestBody(required = false) Object body, @RequestParam(defaultValue = "false") boolean search

		) {

			ResponseEntity<?> responseEntity = null;

			ResponseBean responseBean = attendanceSrevice.getMonthlyAttendanceTeacher(body);

			return responseEntity;

		}

		// gets teacher attendance
		@GetMapping("/getteacherattendance")
		public ResponseEntity<?> getTeacherAttendance(
				@ApiParam(hidden = true, required = true) @RequestHeader(value = "ip", required = false) String ip,
				@RequestBody(required = false) Object body, @RequestParam(defaultValue = "false") boolean search

		) {

			ResponseEntity<?> responseEntity = null;

			ResponseBean responseBean = attendanceSrevice.getTeacherAttendance(body);

			return responseEntity;

		}

}
