package gr.hua.dit.ds.demo3.repository;

import gr.hua.dit.ds.demo3.entity.DonationRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonationRequestRepository extends JpaRepository<DonationRequest, Long> {
    List<DonationRequest> findByUserId(Long userId);
}