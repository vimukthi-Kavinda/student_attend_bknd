package fct.kln.studntattend.service;

import fct.kln.studntattend.model.bean.ResponseBean;

public interface AttendanceService {

	public ResponseBean markAttendanceStudent(Object body);

	public ResponseBean getStudents(Object body);

	public ResponseBean getTeacherAttendance(Object body);

	public ResponseBean getMonthlyAttendanceTeacher(Object body);

	public ResponseBean getAttendance(Object body);

	public ResponseBean getMonthlyAttendance(Object body);

	public ResponseBean addChild(Object body);

	public ResponseBean addTeacher(Object body);

	public ResponseBean markAttendanceTeacher(Object body);

	public ResponseBean removeChild(String studentid);

	public ResponseBean removeTeacher(String tid);

	public ResponseBean assignClassTeacher(String tid, String classid);

	public ResponseBean editChild(Object body);

	public ResponseBean editTeacher(Object body);

	public ResponseBean editParent(Object body);

	
}
