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

  @JsonProperty(value = "title")
  private String title;

  @JsonProperty(value = "description")
  private String description;

  @JsonProperty(value = "client")
  private String client;

  @JsonProperty(value = "client_priority")
  private Integer clientPriority;

  @JsonProperty(value = "target_date")
  private String targetDate;

  @JsonProperty("product_area")
  private String productArea;


}
