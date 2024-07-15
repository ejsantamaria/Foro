package edu.alura.foro.controller;

import edu.alura.foro.entity.Profile;
import edu.alura.foro.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @GetMapping("profile/{id}")
    public Profile getProfile(@PathVariable long id) {
        return profileService.getProfile(id);
    }

    @GetMapping("profiles")
    public List<Profile> getAllProfiles() {
        return profileService.getAllProfiles();
    }

    @PostMapping("profile")
    public Profile addProfile(@RequestBody Profile profile) {
        return profileService.createProfile(profile);
    }

    @PutMapping("profile")
    public Profile updateProfile(@RequestBody Profile profile) {
        return profileService.updateProfile(profile);
    }
}
