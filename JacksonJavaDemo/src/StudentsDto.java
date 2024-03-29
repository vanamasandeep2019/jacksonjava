import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class StudentsDto {
	
	private String id;
	
    private String name;
	
	private String gender;
	
	private String age;
	
    public String getId() {
		return id;
	}
    
    public void setId(String id) {
		this.id = id;
	}
    
    public String getName() {
		return name;
	}
    
    public void setName(String name) {
		this.name = name;
	}
    
    public String getGender() {
		return gender;
	}
    
    public void setGender(String gender) {
		this.gender = gender;
	}
    
    public String getAge() {
		return age;
	}
    
    public void setAge(String age) {
		this.age = age;
	}
}
