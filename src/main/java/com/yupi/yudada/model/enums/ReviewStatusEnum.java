package com.yupi.yudada.model.enums;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 审核状态枚举
 */
public enum ReviewStatusEnum {
    REVIEWING("待审核",0),

    PASS("审核通过",1),

    REJECT("拒绝",2);


    private final String text;
    private final int value;

    ReviewStatusEnum(String text, int value) {
        this.text = text;
        this.value = value;
    }


    /**
     * 根据value获取枚举
     *
     * @param value
     * @return
     */
    public static ReviewStatusEnum getReviewStatusEnum(Integer value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (ReviewStatusEnum reviewStatusEnum : ReviewStatusEnum.values()) {
            if (reviewStatusEnum.value == value) {
                return reviewStatusEnum;
            }
        }
        return null;
    }

    public static List<Integer> getValues(){
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    public String getText() {
        return text;
    }

    public int getValue() {
        return value;
    }
}
