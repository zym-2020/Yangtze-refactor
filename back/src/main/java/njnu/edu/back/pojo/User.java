package njnu.edu.back.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/17/21:20
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String id;
    String name;
    String email;
    String password;
}
