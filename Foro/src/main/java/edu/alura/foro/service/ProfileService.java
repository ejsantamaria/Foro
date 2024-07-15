package edu.alura.foro.service;

import edu.alura.foro.entity.Profile;
import edu.alura.foro.repository.IProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    @Autowired
    IProfileRepository profileRepository;

    public Profile createProfile(Profile profile){
        return profileRepository.save(profile);
    }

    public List<Profile> getAllProfiles(){
        return profileRepository.findAll();
    }

    public Profile updateProfile(Profile profile){
        return profileRepository.save(profile);
    }

    public void deleteProfile(long id){
        Profile profile = profileRepository.getOne(id);
        profileRepository.delete(profile);
    }

    public Profile getProfile(long id){
        return profileRepository.getOne(id);
    }
}
