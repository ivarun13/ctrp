package io.vp.projects.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.vp.projects.domain.ClinicalTrial;

@Repository
public interface ClinicalRepository extends JpaRepository<ClinicalTrial, Long> {

}
