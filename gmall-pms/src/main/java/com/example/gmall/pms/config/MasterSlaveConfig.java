package com.example.gmall.pms.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author gaoqi
 * @create 2020/7/5 20:50
 */

@Configuration
public class MasterSlaveConfig {
    /**
     * 配置mysql主从：
     * 1.引入sharding-jdbc依赖；
     * 2.写 sharding-jdbc-config.yml配置文件，指明主从mysql连接的4大参数和主从规则；
     * 3.自定义配置类，将自定义datasource添加进组件；
     */
    @Bean
    public DataSource getDataSource() throws IOException, SQLException {

        File file = ResourceUtils.getFile("classpath:sharding-jdbc-config.yml");
        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(file);
        return dataSource;

    }}
