package com.ail.home.dozer;

import lombok.Getter;
import lombok.Setter;

public class DestinationClass {

    @Getter
    @Setter
    private String pk;

    @Getter
    @Setter
    private String str;

    @Getter
    @Setter
    private Integer numberDst;

    @Getter
    @Setter
    private DestinationInclude included;

    public static class DestinationInclude {
        @Getter
        @Setter
        private String d;
    }

}
