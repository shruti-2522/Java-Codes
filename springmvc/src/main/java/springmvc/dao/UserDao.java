package springmvc.dao;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	

	@Transactional
	public int saveUser(springmvc.model.User user)
	{
		int id=(Integer)this.hibernatetemplate.save(user);
		return id;
	}

}
