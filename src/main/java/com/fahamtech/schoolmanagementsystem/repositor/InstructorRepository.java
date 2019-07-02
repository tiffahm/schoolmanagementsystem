package com.fahamtech.schoolmanagementsystem.repositor;

import com.fahamtech.schoolmanagementsystem.model.InstructorModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = {"*"})
@RepositoryRestResource(collectionResourceRel = "instructors", path = "instructors")
public interface InstructorRepository extends MongoRepository<InstructorModel, String> {
    InstructorModel findByNameAndPassword(@Param("name") String name, @Param("password") String password);
}
