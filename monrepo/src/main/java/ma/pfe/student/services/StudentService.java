package ma.pfe.student.services;


import ma.pfe.student.models.StudentDTO;
import ma.pfe.student.models.StudentIdDTO;

import java.util.List;

public interface StudentService {
    Long save(StudentDTO s);

    Long update(StudentDTO s);

    Boolean deleteById(StudentIdDTO idDto);

    List<StudentDTO> selectAll();

    StudentDTO findById(StudentIdDTO idDto);
}
