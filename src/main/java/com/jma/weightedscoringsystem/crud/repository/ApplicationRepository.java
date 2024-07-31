package com.jma.weightedscoringsystem.crud.repository;

import com.jma.weightedscoringsystem.crud.model.ApplicationModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends CrudRepository<ApplicationModel, Long> {
}
