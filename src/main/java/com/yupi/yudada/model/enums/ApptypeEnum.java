package com.yupi.yudada.model.enums;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 审核状态枚举
 */
public enum ApptypeEnum {
    SCORE("得分类",0),

    TEST("测评类",1);

    private final String text;
    private final int value;

    ApptypeEnum(String text, int value) {
        this.text = text;
        this.value = value;
    }


    /**
     * 根据value获取枚举
     *
     * @param value
     * @return
     */
    public static ApptypeEnum getReviewStatusEnum(Integer value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (ApptypeEnum apptypeEnum : ApptypeEnum.values()) {
            if (apptypeEnum.value == value) {
                return apptypeEnum;
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
