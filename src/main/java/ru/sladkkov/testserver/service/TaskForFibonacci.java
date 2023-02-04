package ru.sladkkov.testserver.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Slf4j
@Service
public class TaskForFibonacci {

    @Scheduled(fixedDelay = 10000000)
    public void fibonacci() {
        Stream.iterate(new long[]{0, 1}, t -> new long[]{t[1], t[1] + t[0]})
                .limit(20)
                .forEach(t -> log.info(t[0] + " " + t[1]));
    }
}
