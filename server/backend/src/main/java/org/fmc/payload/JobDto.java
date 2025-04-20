package backend.jobportal.payload;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobDto {

    private int jobId;
    private String title;
    private String companyName;
    private String jobDescription;
    private String skills;
    private String jobType;
    private String salaryRange;
    private String experience;
    private String street;
    private String city;
    private String PinCode;
    private String country;
    private MultipartFile companyLogo;
    private String jobCategory;
    private int employerId;



}
