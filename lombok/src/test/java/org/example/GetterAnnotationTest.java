package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GetterAnnotationTest {

    @Test
    void getRunning() {
        GetterAnnotation lombokExamples = new GetterAnnotation();
        Assertions.assertTrue(lombokExamples.getBooleanVariable());
        Assertions.assertEquals("Hello world!", lombokExamples.getStringVariable());
    }
}