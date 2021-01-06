import static org.junit.Assert.*;

import com.bob.api.CommonResult;
import com.bob.api.ParameterRes;
import org.junit.Test;

public class TestProject {
    @Test
    public void testRunApi(){
        ParameterRes parameterRes = new ParameterRes();
        parameterRes.setPressure("120 Mpa");
        parameterRes.setCurrent("20 A");
        parameterRes.setTemperature("100 deg");

        System.out.println(CommonResult.success(parameterRes));
        System.out.println(CommonResult.failed());
        System.out.println(CommonResult.failed());
    }
}
