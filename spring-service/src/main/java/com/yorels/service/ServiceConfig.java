package com.yorels.service;

import com.yorels.data.config.PersistenceJPAConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by yoel.gallegos on 02/03/2017.
 */
@Configuration
@Import(PersistenceJPAConfig.class)
@ComponentScan(basePackages = "com.yorels")
public class ServiceConfig {

}
