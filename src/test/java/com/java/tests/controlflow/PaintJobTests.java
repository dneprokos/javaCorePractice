package com.java.tests.controlflow;

public class PaintJobTests {
    //TODO: Implement tests
    /*
    Examples of input/output:

*getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid

*getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.

*getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.


3. In some cases, Bob does not know the width and height of the wall but he knows the area of a wall. He needs you to write another method.

Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket (both of type double).

The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.

If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1to indicate an invalid value.

If all parameters are valid, the method needs to calculate the number of buckets and return it.


Examples of input/output:

*getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5

*getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.

*getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .
     */
}
