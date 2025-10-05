package com.tracker.controller;

import com.tracker.model.Club;
import com.tracker.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    @Autowired
    private ClubRepository clubRepository;

    @GetMapping
    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    @PostMapping
    public Club createClub(@RequestBody Club club) {
        return clubRepository.save(club);
    }

    @GetMapping("/{id}")
    public Club getClubById(@PathVariable Long id) {
        return clubRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Club updateClub(@PathVariable Long id, @RequestBody Club clubDetails) {
        Club club = clubRepository.findById(id).orElse(null);
        if (club != null) {
            club.setName(clubDetails.getName());
            club.setDescription(clubDetails.getDescription());
            return clubRepository.save(club);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteClub(@PathVariable Long id) {
        clubRepository.deleteById(id);
    }
}
