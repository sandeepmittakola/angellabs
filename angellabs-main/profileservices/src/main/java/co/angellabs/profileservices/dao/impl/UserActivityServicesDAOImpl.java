package co.angellabs.profileservices.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import co.angellabs.entities.dto.Company;
//import co.angellabs.entities.dto.Roles;
//import co.angellabs.entities.dto.User;

import co.angellabs.entities.dto.Company;
import co.angellabs.entities.dto.Roles;
import co.angellabs.entities.dto.User;
import co.angellabs.entities.dto.UserAdditionalInfo;
//import co.angellabs.entities.dto.UserAdditionalInfo;
import co.angellabs.entities.dto.UserCompanyRoles;
import co.angellabs.profileservices.dao.UserActivityServicesDAO;
import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class UserActivityServicesDAOImpl implements UserActivityServicesDAO {

	protected static Logger logger = Logger.getLogger("service");

	@Autowired
	private SessionFactory profileSessionFactory;

	@Transactional
	/*
	 * Retrieving activities (likes,comments,follows)
	 */
	public List<UserCompanyRoles> getActivites(int userId) {

		logger.debug("getting user activity details*********************************************************"
				+ userId);

		

		String sqlstr = "SELECT distinct companyid,userid,roleid,(select  DATEDIFF( NOW(),ucr.createdDate)) as days"
				+ "  FROM usercompanyroles ucr"
				+ "   WHERE companyid in (select distinct(companyid) from usercompanyroles where userid=2)";

		SQLQuery query = profileSessionFactory.getCurrentSession()
				.createSQLQuery(sqlstr).addScalar("companyid")
				.addScalar("userid").addScalar("roleid").addScalar("days");

		List<UserCompanyRoles> results = query.list();

		List<UserCompanyRoles> useractivities = new ArrayList<UserCompanyRoles>();

		for (Iterator it = results.iterator(); it.hasNext();) {
			UserCompanyRoles activity = new UserCompanyRoles();
			Object[] item = (Object[]) it.next();

			activity.setCompanyId(Long.parseLong(item[0].toString()));
			activity.setUserId(Long.parseLong(item[1].toString()));
			activity.setRoleId(Long.parseLong(item[2].toString()));
			activity.setDays(Integer.parseInt(item[3].toString()));

			// gets the days information

			// gets the user infor
			//
			String usrSql = "select * from users where userId="
					+ activity.getUserId();
			SQLQuery queryusr = profileSessionFactory.getCurrentSession()
					.createSQLQuery(usrSql).addScalar("userid")
					.addScalar("username").addScalar("email")
					.addScalar("password");
			List usrresult = queryusr.list();
			List<User> user = new ArrayList<User>();
			for (Iterator itur = usrresult.iterator(); itur.hasNext();) {
				User userdtls = new User();
				Object[] usritem = (Object[]) itur.next();

				userdtls.setUserId(Integer.parseInt(usritem[0].toString()));
				userdtls.setName((usritem[1].toString()));
				userdtls.setEmail(usritem[2].toString());

				activity.setUser(userdtls);
			}

			// gets the compnay infor
			
			System.out.println("Before Company Loop");
			String companySql = "select * from company where companyId="+ activity.getCompanyId();
			SQLQuery query1 = profileSessionFactory.getCurrentSession()
					.createSQLQuery(companySql).addScalar("companyid").addScalar("companyname").addScalar("logo").addScalar("website");

			List<Company> resultcomp = query1.list();
			
			for (Iterator itr = resultcomp.iterator(); itr.hasNext();) {
				Company comctivity = new Company();
				Object[] comitem = (Object[]) itr.next();

				comctivity.setCompanyId(Long.parseLong(comitem[0].toString()));
				comctivity.setCompanyName((comitem[1].toString()));
				comctivity.setWebsite(comitem[3].toString());
				activity.setCompany(comctivity);
			}
			// gets the role information

			String roleSql = "select * from rolemaster where roleid="
					+ activity.getRoleId();
			SQLQuery queryrole = profileSessionFactory.getCurrentSession()
					.createSQLQuery(roleSql).addScalar("roleid")
					.addScalar("name");

			List roleresult = queryrole.list();
			List<Roles> role = new ArrayList<Roles>();
			for (Iterator itrole = roleresult.iterator(); itrole.hasNext();) {
				Roles roles = new Roles();
				Object[] roleitem = (Object[]) itrole.next();

				roles.setRoleId(Long.parseLong(roleitem[0].toString()));
				roles.setRolename((roleitem[1].toString()));

				activity.setRoles(roles);
			}

			useractivities.add(activity);

		}
		return useractivities;

	}

}
