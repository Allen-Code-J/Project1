package com.example.project1.controller;

import java.util.Map;
import com.example.project1.entity.Plan;
import com.example.project1.dao.PlanDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.HashMap;
import org.springframework.web.bind.annotation.*;



@RestController
@Slf4j
public class itemController {
    @Autowired
    PlanDao planRep;
    Map<String, Plan> plans = new HashMap<>();


    @PostMapping("/plan")
    public String createPlan(@RequestBody Plan plan) {
        String objectId = plan.getObjectId();
        plans.put(objectId, plan);
        return objectId;
    }


    @GetMapping("/plan/{objectId}")
    public Object getItem(@PathVariable String objectId) {

        return plans.get(objectId);
    }

    @DeleteMapping("/plan/{objectId}")
    public boolean deleteItem(@PathVariable String objectId) {
        if (plans.containsKey(objectId)) {
            planRep.deletePlan(objectId);
            plans.remove(objectId);
            return true;
        } else {
            return false;
        }
    }
}


