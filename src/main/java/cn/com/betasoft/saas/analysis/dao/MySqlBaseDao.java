package cn.com.betasoft.saas.analysis.dao;

import cn.com.betasoft.saas.analysis.model.SysUserModel;

import java.util.List;

/**
 * created by lichenzhe on 2017/12/11
 */
public interface MySqlBaseDao {
    public List<SysUserModel> selectUser();
}
