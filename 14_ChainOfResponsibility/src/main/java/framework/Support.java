package framework;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    /**
     * 解决问题的步骤，support会调用resolve()，如果resolve()返回false，则support方法会将问题转交给下一个Support对象
     *
     * @param trouble 问题
     */
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            down(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    /**
     * 解决问题的方法
     *
     * @param trouble 问题
     * @return 如果返回true，表示问题已经被解决；如果返回false，表示问题没有被处理（推卸给下一个对象）
     */
    protected abstract boolean resolve(Trouble trouble);

    protected void down(Trouble trouble) {
        System.out.println(trouble + "已经解决了，解决问题的是：" + this);
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + "没有被解决.");
    }

    @Override
    public String toString() {
        return "framework.Support{" +
                "name='" + name + '\'' +
                '}';
    }
}
