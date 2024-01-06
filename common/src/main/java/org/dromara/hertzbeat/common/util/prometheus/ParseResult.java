package org.dromara.hertzbeat.common.util.prometheus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParseResult {
    public List<Row> rowList;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Row {
        public String name;
        public String job;
        public String instance;
        public Map<String, String> labels;
        public Double value;
        public Long timestamp;
    }
}
