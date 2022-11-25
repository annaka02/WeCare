package com.infosys.wecaree.Service;

import com.infosys.wecaree.DTO.CoachDTO;
import com.infosys.wecaree.Entity.Coach;
import com.infosys.wecaree.Repository.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CoachService {

    @Autowired
    private CoachRepository coachRepository;

    public List<CoachDTO> getAllCoach(){
        return coachRepository.findAll().stream().map(this::convertEntityToDTO).collect(Collectors.toList());
    }
    private CoachDTO convertEntityToDTO(Coach coach) {
        CoachDTO coachDTO = new CoachDTO();
        coachDTO.setCoachId(coach.getCoachId());
        coachDTO.setName((coach.getName()));
        coachDTO.setPassword(coach.getPassword());
        coachDTO.setDateOfBirth(coach.getDateOfBirth());
        coachDTO.setMobileNumber(coach.getMobileNumber());
        coachDTO.setGender(coach.getGender());
        coachDTO.setSpeciality(coach.getSpeciality());
            return coachDTO;
    }
    public Coach create(Coach coach){
        return coachRepository.save(coach);
    }
    public Coach update(Coach coach){
        return coachRepository.save(coach);
    }
    public void deleteById(String id){
        coachRepository.deleteById(id);
    }

    public Optional<Coach> getById(String id) {
        return coachRepository.findById(id);
    }
}
