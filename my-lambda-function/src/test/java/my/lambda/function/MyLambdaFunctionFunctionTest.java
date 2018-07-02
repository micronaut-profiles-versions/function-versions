package my.lambda.function;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLambdaFunctionFunctionTest {

    @Test
    public void testFunction() throws Exception {
        EmbeddedServer server = ApplicationContext.run(EmbeddedServer.class);

        MyLambdaFunctionClient client = server.getApplicationContext().getBean(MyLambdaFunctionClient.class);

        assertEquals(client.index().blockingGet(), "my-lambda-function");
        server.stop();
    }
}
