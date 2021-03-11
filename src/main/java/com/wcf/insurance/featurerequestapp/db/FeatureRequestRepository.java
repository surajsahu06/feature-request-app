package com.wcf.insurance.featurerequestapp.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeatureRequestRepository extends CrudRepository<FeatureRequestEntity, Integer> {

    List<FeatureRequestEntity> findAllByClient(String client);
}
