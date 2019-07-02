package com.fahamtech.schoolmanagementsystem.repositor;

import com.fahamtech.schoolmanagementsystem.model.AdminstratorModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "admin", path = "admin")
@CrossOrigin(origins = {"*"})
public interface AdminRepository extends MongoRepository<AdminstratorModel, String> {
    AdminstratorModel findByNameAndPassword(@Param("name") String name, @Param("password") String password);
}
