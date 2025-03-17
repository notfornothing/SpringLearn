package cn.leijiba.spring.simpletransaction;

import org.h2.tools.Server;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

public class H2Server {
    public static void main(String[] args) throws Exception {
        // 获取用户主目录
        String userHome = System.getProperty("user.home");
        // 数据库文件路径（用户主目录下的 test.mv.db）
        String dbDir = userHome;
        String dbPath = dbDir + "/test"; // 数据库文件路径

        // 如果数据库文件不存在，则创建
        createDatabaseIfNotExists(dbDir, dbPath);

        // 启动 TCP 服务器
        Server server = Server.createTcpServer(
                "-tcpPort", "9092",
                "-tcpAllowOthers"
        ).start();
        System.out.println("H2 TCP Server started on port 9092");
    }

    private static void createDatabaseIfNotExists(String dbDir, String dbPath) throws Exception {
        // 确保目录存在
        File dir = new File(dbDir);
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("Created directory: " + dbDir);
            } else {
                throw new RuntimeException("Failed to create directory: " + dbDir);
            }
        }

        // JDBC URL
        String url = "jdbc:h2:file:" + dbPath;

        // 尝试连接数据库，如果不存在则自动创建
        try (Connection conn = DriverManager.getConnection(url, "sa", "")) {
            System.out.println("Database created or connected successfully at: " + dbPath);
        }
    }
}
