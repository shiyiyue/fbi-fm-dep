package dep.gateway.domain.T000;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import dep.gateway.domain.BaseBean;
import dep.gateway.domain.ResHead;

/**
 * Created by IntelliJ IDEA.
 * User: zhangxiaobo
 */
@XStreamAlias("root")
public class T0007Res extends BaseBean {
    @XStreamAlias("Head")
    public ResHead head = new ResHead();
}
