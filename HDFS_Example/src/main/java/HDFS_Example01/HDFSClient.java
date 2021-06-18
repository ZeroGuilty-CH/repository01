package HDFS_Example01;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;


public class HDFSClient {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        //conf.set("fs.defaultFS","hdfs://node1:8020");
        FileSystem fs = FileSystem.get(new URI("hdfs://node1:8020"),conf,"root");
        fs.mkdirs(new Path("/createjava"));
        fs.close();
    }
}
