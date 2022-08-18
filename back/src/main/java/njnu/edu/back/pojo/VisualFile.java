package njnu.edu.back.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/18/9:49
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisualFile {
    String id;
    String fileName;
    String type;
    String content;
}
