package com.jma.weightedscoringsystem.crud.service;

import com.jma.weightedscoringsystem.crud.model.ApplicationModel;
import com.jma.weightedscoringsystem.crud.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    @Autowired
    ApplicationRepository applicationRepository;

    public void saveApplication(ApplicationModel applicationModel){
        applicationRepository.save(applicationModel);
    }

    public Iterable<ApplicationModel> getAllApplications(){
        return applicationRepository.findAll();
    }

    public ApplicationModel getApplicationById(Long id){
        return applicationRepository.findById(id).get();
    }

    public void updateApplication(ApplicationModel applicationModel){
        applicationRepository.save(applicationModel);
    }

    public void deleteApplicationById(Long id){
        applicationRepository.deleteById(id);
    }

}
