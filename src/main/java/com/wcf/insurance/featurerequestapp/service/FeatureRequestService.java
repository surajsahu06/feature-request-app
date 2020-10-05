package com.wcf.insurance.featurerequestapp.service;

import com.wcf.insurance.featurerequestapp.db.FeatureRequestEntity;
import com.wcf.insurance.featurerequestapp.model.FeatureRequest;

public interface FeatureRequestService {

  FeatureRequestEntity createFeatureRequest(FeatureRequest featureRequest);
}
