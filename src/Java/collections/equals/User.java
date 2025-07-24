package Java.collections.equals;

import java.util.Objects;

public class User {

    private int code;
    private String name;

    public User(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public User() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User user){
            if (this == user) return true;
            return this.code == user.code && this.name.equals(user.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Name = %s, code = %s", this.name, this.code);
    }
}
