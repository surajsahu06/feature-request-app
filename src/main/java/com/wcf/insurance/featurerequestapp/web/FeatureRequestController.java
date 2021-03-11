package com.wcf.insurance.featurerequestapp.web;

import com.wcf.insurance.featurerequestapp.model.FeatureRequest;
import com.wcf.insurance.featurerequestapp.service.FeatureRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping("/feature-request")
@Controller
public class FeatureRequestController {

    private final FeatureRequestService featureRequestService;

    public FeatureRequestController(FeatureRequestService featureRequestService) {
        this.featureRequestService = featureRequestService;
    }

    @PostMapping
    public ResponseEntity<FeatureRequest> postFeatureRequest(@RequestBody FeatureRequest featureRequest) {
        log.info("received the feature request {}", featureRequest);
        featureRequestService.createFeatureRequest(featureRequest);
        return ResponseEntity.ok().build();
    }
}
