package gr.hua.dit.ds.demo3.controller;

import gr.hua.dit.ds.demo3.entity.DonationRequest;
import gr.hua.dit.ds.demo3.repository.DonationRequestRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/donation-requests")
public class DonationRequestController {

    private final DonationRequestRepository donationRequestRepository;

    public DonationRequestController(DonationRequestRepository donationRequestRepository) {
        this.donationRequestRepository = donationRequestRepository;
    }

    @PostMapping("/apply")
    public ResponseEntity<DonationRequest> applyForDonation(@RequestBody DonationRequest donationRequest) {
        DonationRequest savedRequest = donationRequestRepository.save(donationRequest);
        return ResponseEntity.ok(savedRequest);
    }

}
