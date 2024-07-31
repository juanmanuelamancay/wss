package com.jma.weightedscoringsystem.crud.controler;

import com.jma.weightedscoringsystem.crud.model.ApplicationModel;
import com.jma.weightedscoringsystem.crud.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jma/weightedscoringsystem")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;;

    @GetMapping("/save")
    public void saveApplication(ApplicationModel applicationModel){
        applicationService.saveApplication(applicationModel);
    }

    @GetMapping("/all")
    public Iterable<ApplicationModel> getAllApplications(){
        return applicationService.getAllApplications();
    }

    @GetMapping("/get/{id}")
    public ApplicationModel getApplicationById(Long id){
        return applicationService.getApplicationById(id);
    }

    @GetMapping("/update")
    public void updateApplication(ApplicationModel applicationModel){
        applicationService.updateApplication(applicationModel);
    }

    @GetMapping("/delete/{id}")
    public void deleteApplicationById(Long id){
        applicationService.deleteApplicationById(id);
    }
}
