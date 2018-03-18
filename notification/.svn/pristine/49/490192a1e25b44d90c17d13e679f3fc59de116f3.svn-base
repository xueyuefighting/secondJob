package com.yonyou.dbProvider;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.interfaces.IDBSourceProvider;
import com.yonyou.pojo.Credit;

@Service
public class ScanningCreditDBSourceProviderImpl implements IDBSourceProvider<Credit>{
	
	@Autowired  @Qualifier("secondaryJdbcTemplate") 
	private JdbcTemplate jdbcTemplate;
	
	
	/* 
	 * 返回需要通知的融资方列表
	 */
	@Transactional(value="secondaryTransactionManager")
	@Override
	public List obtainSpecifyData(String sql, Object[] object) {
		RowMapper<Credit> rowMapper = new BeanPropertyRowMapper<Credit>(Credit.class);
		List<Credit> creditList = jdbcTemplate.query(sql, object, rowMapper);
		System.out.println("jdbcTemplate2"+jdbcTemplate);
		List<String> agencyList=new ArrayList<String>();
		if(creditList.size()>0){
			for(Credit credit:creditList)
			agencyList.add(credit.getCreditAgencyId());
			}		
		return  agencyList;
	}

}
