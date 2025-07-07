package com.sky.utils;

import com.sky.properties.AwsS3Properties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

@Slf4j
@Component
public class AwsS3Util {

    @Autowired
    private S3Client s3Client;

    @Autowired
    private AwsS3Properties properties;

    /**
     * 文件上传
     *
     * @param bytes      文件字节
     * @param objectName S3中的对象名（含路径）
     * @return 可访问的URL
     */
    public String upload(byte[] bytes, String objectName) {
        try {
            PutObjectRequest putObjectRequest = PutObjectRequest.builder()
                    .bucket(properties.getBucketName())
                    .key(objectName)
                    .build();

            s3Client.putObject(putObjectRequest, RequestBody.fromBytes(bytes));

            // 构建访问路径：https://bucket.s3.region.amazonaws.com/objectName
            String url = String.format("https://%s.s3.%s.amazonaws.com/%s",
                    properties.getBucketName(),
                    properties.getRegion(),
                    objectName);

            log.info("文件上传到: {}", url);
            return url;

        } catch (Exception e) {
            log.error("上传到S3失败", e);
            return null;
        }
    }
}
