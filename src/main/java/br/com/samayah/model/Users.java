package br.com.samayah.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data 
@NoArgsConstructor 
public class Users {
 
   	@Id
	@NonNull
    private String username;
   	 
	@NonNull
    private String password;
		
	@NonNull
    private Boolean enabled;
	
	@NonNull
    private String email;
	
	@NonNull
	private Date dataCadastro;

}