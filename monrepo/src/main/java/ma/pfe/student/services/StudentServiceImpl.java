package ma.pfe.student.services;


import ma.pfe.student.mappers.StudentMapper;
import ma.pfe.student.models.StudentDTO;
import ma.pfe.student.models.StudentIdDTO;
import ma.pfe.student.repositories.StudentRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service1")
public class StudentServiceImpl implements StudentService {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository studentRepository;
    private StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);

    public StudentServiceImpl(@Qualifier("repo1") StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Long save(StudentDTO dto) {
        LOGGER.debug("start method save dto : {} ", dto);
        StudentDTO re = studentMapper.studentEntityToDto(studentRepository.save(studentMapper.studentDtoToEntity(dto)));
        return re.getStudentId().getId();
    }

    @Override
    public Long update(StudentDTO dto) {
        LOGGER.debug("start method save dto : {} ", dto);
        StudentDTO re = studentMapper.studentEntityToDto(studentRepository.save(studentMapper.studentDtoToEntity(dto)));
        return re.getStudentId().getId();
    }

    @Override
    public Boolean deleteById(StudentIdDTO idDto) {
        LOGGER.debug("start method delete idDto : {} ", idDto);
        studentRepository.deleteById(studentMapper.studentIdDtoToStudentId(idDto));
        return true;
    }

    @Override
    public List<StudentDTO> selectAll() {
        LOGGER.debug("start method select All");
        return studentMapper.studentEntiesToDtos(studentRepository.findAll());
    }

    @Override
    public StudentDTO findById(StudentIdDTO idDto) {
        LOGGER.debug("start method findById idDto : {} ", idDto);
        return studentMapper.studentEntityToDto(
                studentRepository
                        .findById(studentMapper.studentIdDtoToStudentId(idDto))
                        .orElse(null));
    }


}
