package com.rafaat.demo;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FeatureCTest {

    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(FeatureCTest.class);

    @Test
    public void path_exist() throws IOException {

        Path path= Paths.get("/Users/sgandikota/Local Documents/Movies/English/");

        Stream<Path> walk= Files.walk(path);
        List<String> contentList= walk.filter(Files::isRegularFile).map(x -> x.toString()).collect(Collectors.toList());

        String movieList = StringUtils.join(contentList," ||| ");
        System.out.println("testA1 - " + Thread.currentThread());

        logger.info("The List of Movie's i have is {} {}",System.lineSeparator(),movieList);


    }

    @Test
    public void checkTrial() throws IOException {

        System.out.println("Trial Check!");

    }

}
