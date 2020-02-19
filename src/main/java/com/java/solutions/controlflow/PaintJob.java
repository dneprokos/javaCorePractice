package com.java.solutions.controlflow;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }

        double area = width * height;
        int bucketsToBuy = (int)Math.ceil(area / areaPerBucket) - extraBuckets;
        return bucketsToBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        double area = width * height;
        int bucketsToBuy = (int)Math.ceil(area / areaPerBucket);
        return bucketsToBuy;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        int bucketsToBuy = (int)Math.ceil(area / areaPerBucket);
        return bucketsToBuy;
    }
}
