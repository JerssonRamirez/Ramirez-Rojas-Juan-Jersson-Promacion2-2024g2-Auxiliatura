package tcp;

import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L; 

    private String nickname;
    private String ip;

    public Persona(String nickname, String ip) {
        this.nickname = nickname;
        this.ip = ip;
    }

    public String getNickname() {
        return nickname;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nickname='" + nickname + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}