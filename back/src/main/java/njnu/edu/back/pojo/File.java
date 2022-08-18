package njnu.edu.back.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/17/21:25
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class File {
    String id;
    String fileName;
    String size;
    String address;
    String time;        //可选属性
    String location;
    String uploader;
    String visualType;
    String visualId;

}
