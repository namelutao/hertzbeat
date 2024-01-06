package org.dromara.hertzbeat.common.util.prometheus;


import java.io.IOException;
import java.io.InputStream;

public class ParsePrometheusMetricsUtils {
    public static ParseResult parse(InputStream stream) throws IOException {
        int c;
        while ((c = stream.read()) != -1) {
            System.out.print((char)c);
        }

        return new ParseResult();
    }
}
