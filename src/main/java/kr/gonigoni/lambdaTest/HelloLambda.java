package kr.gonigoni.lambdaTest;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class HelloLambda {
    public String testHandler(String event, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Received: " + event);
        return event;
    }
}
