package JavaApi.src.SocketDemo.p2;

import java.io.Serializable;

// 用户  (可序列化 实现Serializable)
public class User implements Serializable {
    private String username;
    private String pwd;

    public User(){}

    public User(String username, String pwd) {
        this.username = username;
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
