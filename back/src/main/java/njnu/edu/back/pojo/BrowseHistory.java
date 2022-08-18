package njnu.edu.back.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/18/14:52
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrowseHistory {
    String id;
    String userId;
    Date browseTime;
    String ip;
    String dataId;
}
