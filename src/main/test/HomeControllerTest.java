import com.contedevel.lab01.controllers.HomeController;
import org.junit.Assert;
import org.junit.Test;

public class HomeControllerTest {

    @Test
    public void test() {
        HomeController controller = new HomeController();
        Assert.assertEquals("Hello, World!", controller.getHelloStr(null));
        Assert.assertEquals("Hello, Arma!", controller.getHelloStr("Arma"));
    }
}
