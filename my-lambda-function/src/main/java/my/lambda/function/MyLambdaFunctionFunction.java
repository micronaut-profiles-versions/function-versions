package my.lambda.function;

import io.micronaut.function.FunctionBean;
import java.util.function.Supplier;

@FunctionBean("my-lambda-function")
public class MyLambdaFunctionFunction implements Supplier<String> {

    @Override
    public String get() {
        return "my-lambda-function";
    }
}
