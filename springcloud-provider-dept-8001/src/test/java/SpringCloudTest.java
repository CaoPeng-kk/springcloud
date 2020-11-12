import com.caop.springcloud.SpringCloudProviderApplication;
import com.caop.springcloud.mapper.DeptMapper;
import com.caop.springcloud.pojo.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: caopeng
 * @Description:
 * @Date: Created in 23:03 2020/11/5
 */
@SpringBootTest(classes = SpringCloudProviderApplication.class)
@RunWith(SpringRunner.class)
public class SpringCloudTest {

    @Autowired
    DeptMapper deptMapper;

    @Test
    public void select() {
        Dept dept = deptMapper.selectDept(1);
        System.out.println(dept);
        System.out.println(1);
    }
}
