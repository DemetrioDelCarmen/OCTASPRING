package com.octaspring.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.octaspring.dao.LangInterface;
import com.octaspring.entity.Lang;

public class LangService implements LangInterface {
	
	//Atributo JDBC para realizar la manipulacin de datos a traves de la conexion
	private JdbcTemplate jdbcTemplate;
	
	String sql;
	String sqlSelectAll;
	
	public LangService(DataSource dataSource) {
			this.jdbcTemplate  = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void save(Lang lang) {
		// TODO Auto-generated method stub
		sql = "INSERT INTO lang (lang) VALUES(?)";
		jdbcTemplate.update(sql, lang.getLang());
		
	}

	@Override
	public void update(Lang lang) {
		sql = "UPDATE lang SET lang=? WHERE id = ?";
		jdbcTemplate.update(sql, lang.getLang());
	}

	@Override
	public void delete(long id) {
		sql = "DELETE  FROM lang WHERE id = ?";
		jdbcTemplate.update(sql,id);
		
	}

	@Override
	public List<Lang> findByAll() {
		//System.out.println("FIND BY ALL");
		sql = "SELECT * FROM lang";
		return this.jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Lang.class));
	}

	@Override
	public List<Lang> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
