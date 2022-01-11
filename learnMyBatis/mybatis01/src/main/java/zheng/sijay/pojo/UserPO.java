package zheng.sijay.pojo;

/**
 * @author 郑世杰
 */
public class UserPO {
    private int id;
    private String name;
    private String pwd;

    public UserPO() {
    }

    public UserPO(String name) {
        this.name = name;
    }

    public UserPO(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public UserPO(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "UserPO{" + "id=" + id + ", name='" + name + '\'' + ", pwd='" + pwd + '\'' + '}';
    }
}