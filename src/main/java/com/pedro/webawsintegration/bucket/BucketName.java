package com.pedro.webawsintegration.bucket;

public enum BucketName {

    PROFILE_IMAGE("bucket-pedro-aws");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
