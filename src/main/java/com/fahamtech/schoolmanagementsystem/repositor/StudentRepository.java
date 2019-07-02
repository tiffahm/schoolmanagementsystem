package com.fahamtech.schoolmanagementsystem.repositor;

import com.fahamtech.schoolmanagementsystem.model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = {"*"})
@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentRepository extends MongoRepository<StudentModel, String> {
    StudentModel findByNameAndPassword(@Param("name") String name, @Param("password") String password);
}
