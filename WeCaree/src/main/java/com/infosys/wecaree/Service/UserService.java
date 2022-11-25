package com.infosys.wecaree.Service;

import com.infosys.wecaree.DTO.UserDTO;
import com.infosys.wecaree.Entity.User;
import com.infosys.wecaree.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAllUsers(){
        return userRepository.findAll().stream().map(this::convertEntityToDTO).collect(Collectors.toList());
    }
    private UserDTO convertEntityToDTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setCoachId(user.getUserId());
        userDTO.setName(user.getName());
        userDTO.setPassword(user.getPassword());
        userDTO.setDateOfBirth(user.getDateOfBirth());
        userDTO.setEmail(user.getEmail());
        userDTO.setGender(user.getGender());
        userDTO.setPincode(user.getPincode());
        userDTO.setCity(user.getCity());
        userDTO.setCountry(user.getCountry());
        userDTO.setMobileNumber(user.getMobileNumber());
        userDTO.setState(user.getState());
        return userDTO;
    }
    public User create(User user){
        return userRepository.save(user);
    }
    public User update(User user){
        return userRepository.save(user);
    }
    public void deleteById(String id){
        userRepository.deleteById(id);
    }

    public Optional<User> getById(String id) {
        return userRepository.findById(id);
    }
}
