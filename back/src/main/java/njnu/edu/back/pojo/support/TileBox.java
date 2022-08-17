package njnu.edu.back.pojo.support;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/21:11
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TileBox {
    double xMin;
    double xMax;
    double yMin;
    double yMax;
    String name;
    Integer srid;
}
