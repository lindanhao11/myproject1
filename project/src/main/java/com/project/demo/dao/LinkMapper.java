package com.project.demo.dao;

import com.project.demo.dao.base.BaseMapper;
import com.project.demo.entity.Link;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 友情链接：Mapper接口
 *
 */
@Mapper
public interface LinkMapper extends BaseMapper<Link>
{
    /**
     * 查询友情链接：
     *
     * @param linkId 友情链接：ID
     * @return 友情链接：
     */
    Link selectLinkById(Integer linkId);

    /**
     * 查询友情链接：列表
     *
     * @param link 友情链接：
     * @return 友情链接：集合
     */
    List<Link> selectLinkList(Link link);

    /**
     * 新增友情链接：
     *
     * @param link 友情链接：
     * @return 结果
     */
    int insertLink(Link link);

    /**
     * 修改友情链接：
     *
     * @param link 友情链接：
     * @return 结果
     */
    int updateLink(Link link);

    /**
     * 删除友情链接：
     *
     * @param linkId 友情链接：ID
     * @return 结果
     */
    int deleteLinkById(Integer linkId);

    /**
     * 批量删除友情链接：
     *
     * @param linkIds 需要删除的数据ID
     * @return 结果
     */
    int deleteLinkByIds(Integer[] linkIds);
}
