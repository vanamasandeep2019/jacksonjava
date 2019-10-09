import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDemo {
	
	public static void main(String[] args) {
		
		ObjectMapper objectMapper=new ObjectMapper();
		try {
			StudentsDto student=objectMapper.readValue(new File("src\\StudentData.json"), StudentsDto.class);
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getGender());
			
			
			List<StudentsDto> students=objectMapper.readValue(new File("src\\StudentsData.json"), objectMapper.getTypeFactory().constructCollectionLikeType(List.class, StudentsDto.class));
		for (StudentsDto studentsDto : students) {
			System.out.println(studentsDto.getId());
			System.out.println(studentsDto.getName());
			System.out.println(studentsDto.getGender());
		}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
