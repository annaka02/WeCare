package com.infosys.wecaree.RestController;


import com.infosys.wecaree.DTO.CoachDTO;
import com.infosys.wecaree.Entity.Coach;
import com.infosys.wecaree.Service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coach")
public class CoachRestController {

    @Autowired
    private CoachService coachService;

    @GetMapping("/coach")
    public List<CoachDTO> getAllCoach(){
        return coachService.getAllCoach();
    }

    @GetMapping("/id")
    public Optional<Coach> getById(@PathVariable String id){
        return coachService.getById(id);
    }

    @PostMapping("/create")
    public Coach create(@RequestBody Coach coach){
        return coachService.create(coach);
    }

    @PutMapping("/update")
    public Coach update(@RequestBody Coach coach){
        return coachService.update(coach);
    }

}
