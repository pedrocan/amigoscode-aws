package com.pedro.webawsintegration.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        AWSCredentials awsCredentials =
                new BasicAWSCredentials(
                        "AKIAIEE7RZVNDOFEWUQA",
                        "YC90DLgWQxCui6OJ+8H8Xcp8xEbpowTWebGhVKe8");

        return AmazonS3ClientBuilder
                .standard().withRegion(Regions.EU_WEST_3)
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}
