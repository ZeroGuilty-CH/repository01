package HDFS_Example01;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

//用API操作上传文件操作
public class HDFSUpDownLoad {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://node1:8020"), conf, "root");
        fs.copyToLocalFile(new Path("/createjava/JavaSE11_JDBC.docx"), new Path("C:\\Users\\ZeroGuilty\\Desktop\\J1.docx"));
        fs.close();

    }
}
