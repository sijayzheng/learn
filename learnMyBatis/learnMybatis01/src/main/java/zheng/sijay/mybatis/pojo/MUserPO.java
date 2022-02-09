package zheng.sijay.mybatis.pojo;

/**
 * @author 郑世杰
 */
public class MUserPO {
    private int id;
    private String name;
    private String pwd;

    public MUserPO() {
    }

    public MUserPO(String name) {
        this.name = name;
    }

    public MUserPO(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public MUserPO(int id, String name, String pwd) {
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
        return "MUserPO{" + "id=" + id + ", name='" + name + '\'' + ", pwd='" + pwd + '\'' + '}';
    }
}