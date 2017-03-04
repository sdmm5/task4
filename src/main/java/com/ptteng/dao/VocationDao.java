package com.ptteng.dao;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by maweijiang on 2017/3/2.
 */
@Component
public interface VocationDao {
    public List getVocationsWithDirection(int v_direction);
}
