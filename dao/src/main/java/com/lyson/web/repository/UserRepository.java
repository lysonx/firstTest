package com.lyson.web.repository;


import com.lyson.web.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User>, PagingAndSortingRepository<User,Integer>{

	public User findByUserName(@Param("userName") String userName);

//	public Page<UserInfo> getUserPage(UserInfo userInfo, Pageable pageable);

	@Query(value = "select m.id,m.name,m.parentId,m.url,mr.menuPermission,m.icon from menu m left join menu_role mr on m.id=mr.menuId left join `role` r on mr.roleId=r.id left join user_role ur on r.id=ur.roleId where ur.userId=:userId and  m.parentId=:parentId and m.enable=1 order by sort asc",nativeQuery = true)
	public List<Object> getMenuByParentId(@Param("userId") Integer userId, @Param("parentId") Integer parentId);

	public User findUserById(@Param("id") Integer id);
}
