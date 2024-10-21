package ie.atu.enrolementservice;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {

    @Id
    @NotBlank
    private String enrollmentId;
    @NotBlank
    private String studentId;
    @NotBlank
    private String studentName;
    @NotBlank
    private String courseCode;
    @NotBlank
    private String enrollmentDate;

}
