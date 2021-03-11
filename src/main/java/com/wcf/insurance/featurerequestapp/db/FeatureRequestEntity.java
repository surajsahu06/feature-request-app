package com.wcf.insurance.featurerequestapp.db;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "feature_request")
public class FeatureRequestEntity {

    @Column
    @GeneratedValue
    @Id
    private Integer id;

    private String title;

    private String description;

    private String client;

    private Integer clientPriority;

    private String targetDate;

    @Column(name = "product_area", nullable = false)
    private String productArea;

}
