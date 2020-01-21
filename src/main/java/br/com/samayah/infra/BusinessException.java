package br.com.samayah.infra;

import lombok.Data;
import lombok.NonNull;

@Data
public class BusinessException extends Exception {

	private static final long serialVersionUID = -1703407560441026366L;
	
	@NonNull
	private String message; 
	
}
