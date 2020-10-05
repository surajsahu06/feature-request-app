package com.wcf.insurance.featurerequestapp.service;

import org.mockito.Mock;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import com.wcf.insurance.featurerequestapp.db.FeatureRequestRepository;

public class FeatureRequestServiceImplTest {

  @Mock
  FeatureRequestRepository featureRequestRepository;

  private FeatureRequestService featureRequestService;

  @BeforeTestMethod
  public void setup() {
    featureRequestService = new FeatureRequestServiceImpl(featureRequestRepository);
  }
  //TODO : add  unit tests here for service;
}
