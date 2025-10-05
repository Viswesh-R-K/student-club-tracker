package com.tracker.controller;

import com.tracker.model.Activity;
import com.tracker.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    @Autowired
    private ActivityRepository activityRepository;

    @GetMapping
    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }

    @PostMapping
    public Activity createActivity(@RequestBody Activity activity) {
        return activityRepository.save(activity);
    }

    @GetMapping("/{id}")
    public Activity getActivityById(@PathVariable Long id) {
        return activityRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Activity updateActivity(@PathVariable Long id, @RequestBody Activity activityDetails) {
        Activity activity = activityRepository.findById(id).orElse(null);
        if (activity != null) {
            activity.setName(activityDetails.getName());
            activity.setDescription(activityDetails.getDescription());
            activity.setDate(activityDetails.getDate());
            return activityRepository.save(activity);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteActivity(@PathVariable Long id) {
        activityRepository.deleteById(id);
    }
}
