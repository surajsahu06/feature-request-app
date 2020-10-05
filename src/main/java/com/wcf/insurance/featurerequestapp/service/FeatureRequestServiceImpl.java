package com.wcf.insurance.featurerequestapp.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import com.wcf.insurance.featurerequestapp.db.FeatureRequestEntity;
import com.wcf.insurance.featurerequestapp.db.FeatureRequestRepository;
import com.wcf.insurance.featurerequestapp.model.FeatureRequest;

@Slf4j
@Service
public class FeatureRequestServiceImpl implements FeatureRequestService {

  private FeatureRequestRepository featureRequestRepository;

  public FeatureRequestServiceImpl(FeatureRequestRepository featureRequestRepository) {
    this.featureRequestRepository = featureRequestRepository;
  }

  @Override
  public FeatureRequestEntity createFeatureRequest(FeatureRequest featureRequest) {
    FeatureRequestEntity featureRequestEntity = FeatureRequestEntity.builder()
      .client(featureRequest.getClient())
      .clientPriority(featureRequest.getClientPriority())
      .title(featureRequest.getTitle())
      .description(featureRequest.getTitle())
      .productArea(featureRequest.getProductArea())
      .targetDate(featureRequest.getTargetDate()).build();
    log.info("created feature request {}", featureRequest);
    return featureRequestRepository.save(featureRequestEntity);

  }
}
