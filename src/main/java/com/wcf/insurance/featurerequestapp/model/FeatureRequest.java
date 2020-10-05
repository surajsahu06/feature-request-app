package com.wcf.insurance.featurerequestapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class FeatureRequest {

  private String title;

  private String description;

  private String client;

  @JsonProperty(value = "target_date")
  private String targetDate;

  @JsonProperty(value = "product_area")
  private String productArea;


}
