package flow.dto;

/**
 * Base user information item
 * @author DN
 *
 */
public class UserItem {

	private Long id;
	private String name;
	private String emailAddress;
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getEmailAddress(){
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}
}
