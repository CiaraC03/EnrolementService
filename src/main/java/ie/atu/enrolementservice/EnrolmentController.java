package ie.atu.enrolementservice;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrolmentController {

    @PostMapping("/enrollment")
    public String enrolStudent(@RequestBody Students students){
        String message = String.format("Student %s with  enrollment id %s has been successfully registered. ", students.getStudentName(), students.getEnrollmentId());
        return message;
    }
}
