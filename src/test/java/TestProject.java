import static org.junit.Assert.*;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.bob.api.CommonResult;
import com.bob.api.ParameterRes;
import com.google.gson.Gson;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.Test;

public class TestProject {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestProject.class);
    @Test
    public void testRunApi(){
        ParameterRes parameterRes = new ParameterRes();
        parameterRes.setPressure("120 Mpa");
        parameterRes.setCurrent("20 A");
        parameterRes.setTemperature("100 deg");

        String json = JSONUtil.parse(CommonResult.success(parameterRes)).toString();
        Gson gson = new Gson();
        String json1 = gson.toJson(CommonResult.success(parameterRes));
        String json2 = JSON.toJSONString(CommonResult.success(parameterRes));
        System.out.println(json);
        System.out.println(json1);
        System.out.println(json2);

        System.out.println();
        System.out.println(CommonResult.failed());
        System.out.println(CommonResult.failed());
    }
}
