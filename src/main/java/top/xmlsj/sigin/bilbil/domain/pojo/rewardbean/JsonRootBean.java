package top.xmlsj.sigin.bilbil.domain.pojo.rewardbean;

import lombok.Data;

@Data
public class JsonRootBean {

    private int code;
    private String message;
    private int ttl;
    private RewardData rewardData;

}
