package com.effectivemaven.chapter01;

import org.slf4j.*;

public class ExampleAction {
    final Logger logger =
        LoggerFactory.getLogger(ExampleAction.class);

    private java.util.List<String> values;

    public boolean execute() {
        logger.info( "Example action executed" );
        return true;
    }
}

