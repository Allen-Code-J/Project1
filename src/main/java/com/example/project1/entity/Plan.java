package com.example.project1.entity;

import lombok.*;
@Data
public class Plan {
    private Object planCostShares;
    private String planType;
    private Object[] linkedPlanServices;
    private String _org;
    private String objectId;
    private String objectType;
    private String creationDate;
}