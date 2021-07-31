package com.workup.workup;

import com.workup.workup.models.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class WorkUpApplication {

  public static void main(String[] args) {
    SpringApplication.run(WorkUpApplication.class, args);
  }
}
