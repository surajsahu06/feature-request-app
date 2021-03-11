package com.wcf.insurance.featurerequestapp.service;

import com.wcf.insurance.featurerequestapp.db.FeatureRequestEntity;
import com.wcf.insurance.featurerequestapp.db.FeatureRequestRepository;
import com.wcf.insurance.featurerequestapp.model.FeatureRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class FeatureRequestServiceImpl implements FeatureRequestService {

    private final FeatureRequestRepository featureRequestRepository;

    public FeatureRequestServiceImpl(FeatureRequestRepository featureRequestRepository) {
        this.featureRequestRepository = featureRequestRepository;
    }

    @Override
    public FeatureRequestEntity createFeatureRequest(FeatureRequest featureRequest) {
        List<FeatureRequestEntity> list = featureRequestRepository.findAllByClient(featureRequest.getClient());
        log.info("list of request  {}", list);

        Integer clientPriority = featureRequest.getClientPriority();
        if (list.isEmpty()) {
            log.info("feature request not found in the system for client {}", featureRequest.getClient());
        } else {
            clientPriority = list.get(0).getClientPriority();
        }

        FeatureRequestEntity featureRequestEntity = FeatureRequestEntity.builder()
                .client(featureRequest.getClient())
                .clientPriority(clientPriority)
                .title(featureRequest.getTitle())
                .description(featureRequest.getTitle())
                .productArea(featureRequest.getProductArea())
                .targetDate(featureRequest.getTargetDate()).build();
        log.info("created feature request {}", featureRequest);
        return featureRequestRepository.save(featureRequestEntity);
    }
}
