package fct.kln.studntattend.service;

import fct.kln.studntattend.model.bean.ResponseBean;

public interface AttendanceService {

	public ResponseBean markAttendance(Object body);

	public ResponseBean getStudents(Object body);
	
}
