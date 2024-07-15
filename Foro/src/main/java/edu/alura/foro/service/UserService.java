package edu.alura.foro.service;

import edu.alura.foro.entity.User;
import edu.alura.foro.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepository _userRepository;

    public List<User> getAllUsers(){
        return _userRepository.findAll();
    }
    public User getUser(long id){
        return _userRepository.getOne(id);
    }
    public User addUser(User user){
        return _userRepository.saveAndFlush(user);
    }
    public User updateUser(User user){
        return _userRepository.saveAndFlush(user);
    }
}
