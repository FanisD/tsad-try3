package gr.hua.dit.ds.demo3.controller;

import gr.hua.dit.ds.demo3.entity.DonationRequest;
import gr.hua.dit.ds.demo3.entity.User;
import gr.hua.dit.ds.demo3.repository.DonationRequestRepository;
import gr.hua.dit.ds.demo3.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;
    private final DonationRequestRepository donationRequestRepository;

    public UserController(UserRepository userRepository, DonationRequestRepository donationRequestRepository) {
        this.userRepository = userRepository;
        this.donationRequestRepository = donationRequestRepository;
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/{userId}/donation-requests")
    public ResponseEntity<List<DonationRequest>> getUserDonationRequests(@PathVariable Long userId) {
        List<DonationRequest> donationRequests = donationRequestRepository.findByUserId(userId);
        return ResponseEntity.ok(donationRequests);
    }

}
