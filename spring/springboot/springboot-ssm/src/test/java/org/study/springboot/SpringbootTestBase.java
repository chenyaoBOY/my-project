package org.study.springboot;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.study.ssm.SpringbootSSM;

/**
 * @author chenyao
 * @date 2020/5/27 15:48
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootSSM.class})
public class SpringbootTestBase {
}
