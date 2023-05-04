package ma.pfe.student.mappers;


import ma.pfe.student.entities.StudentEntity;
import ma.pfe.student.entities.StudentId;
import ma.pfe.student.models.StudentDTO;
import ma.pfe.student.models.StudentIdDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface StudentMapper {
    StudentEntity studentDtoToEntity(StudentDTO dto);
    StudentDTO studentEntityToDto(StudentEntity studentEntity) ;
    List<StudentDTO> studentEntiesToDtos(List<StudentEntity> studentEntities) ;
    StudentId studentIdDtoToStudentId(StudentIdDTO studentIdDTO) ;
}