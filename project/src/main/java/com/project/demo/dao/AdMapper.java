package com.project.demo.dao;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.Ad;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 广告信息：Mapper接口
 *
 */
@Mapper
public interface AdMapper extends BaseMapper<Ad> {
    /**
     * 查询广告信息：
     *
     * @param adId 广告信息：ID
     * @return 广告信息：
     */
    Ad selectAdById(Integer adId);

    /**
     * 查询广告信息：列表
     *
     * @param ad 广告信息：
     * @return 广告信息：集合
     */
    List<Ad> selectAdList(Ad ad);

    /**
     * 新增广告信息：
     *
     * @param ad 广告信息：
     * @return 结果
     */
    int insertAd(Ad ad);

    /**
     * 修改广告信息：
     *
     * @param ad 广告信息：
     * @return 结果
     */
    int updateAd(Ad ad);

    /**
     * 删除广告信息：
     *
     * @param adId 广告信息：ID
     * @return 结果
     */
    int deleteAdById(Integer adId);

    /**
     * 批量删除广告信息：
     *
     * @param adIds 需要删除的数据ID
     * @return 结果
     */
    int deleteAdByIds(Integer[] adIds);
}
