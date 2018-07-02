package my.lambda.function;

import io.micronaut.function.client.FunctionClient;
import io.reactivex.Single;

import javax.inject.Named;

@FunctionClient
public interface MyLambdaFunctionClient {

    @Named("my-lambda-function")
    Single<String> index();

}
