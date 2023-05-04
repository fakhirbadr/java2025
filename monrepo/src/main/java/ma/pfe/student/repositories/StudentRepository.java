package ma.pfe.student.repositories;

import ma.pfe.student.entities.StudentEntity;
import ma.pfe.student.entities.StudentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("repo1")
public interface StudentRepository
        extends JpaRepository<StudentEntity, StudentId> {


}
