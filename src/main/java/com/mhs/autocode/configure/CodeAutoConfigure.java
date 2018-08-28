package com.mhs.autocode.configure;

import com.mhs.autocode.config.autoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mhs.autocode.service.CodeGenerationService;

@Configuration
@ConditionalOnClass(CodeGenerationService.class)
@EnableConfigurationProperties(autoConfig.class)
public class CodeAutoConfigure {
    @Autowired
    private autoConfig properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "auto",value = "enabled",havingValue = "true")
    void exampleService (){
      new CodeGenerationService(properties);
    }

}
