package ru.sfedu.computer_vision.api.implementation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class Task1_2Test {
    private static final Logger log = LogManager.getLogger(Task1_2Test.class);
    TaskImpl task = new TaskImpl();
    String TEST_IMAGE_PATH = "D:/Computer_Vision/images/";

    @Test
    void task2() {
        String TEST_IMAGE_NAME = "testimage.jpg";
        task.task2(6, TEST_IMAGE_PATH, TEST_IMAGE_NAME);
    }

}