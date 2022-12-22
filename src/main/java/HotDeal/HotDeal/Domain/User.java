package HotDeal.HotDeal.Domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
public class User {

    @Id
    private String id;
    private String accountId;  //foreign key?
    private String password;
    private String Email;
    private String PhoneNumber;
    private String nickname;

    //@Indexed(unique = true) 중복제거?

}
