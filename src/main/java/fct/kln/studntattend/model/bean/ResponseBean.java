package fct.kln.studntattend.model.bean;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class ResponseBean {

	String code;
	String message;
	Object data;
	
	
}
