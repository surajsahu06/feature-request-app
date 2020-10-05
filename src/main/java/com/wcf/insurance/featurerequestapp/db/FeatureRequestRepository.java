package com.wcf.insurance.featurerequestapp.db;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRequestRepository extends CrudRepository<FeatureRequestEntity, Integer> {
}
