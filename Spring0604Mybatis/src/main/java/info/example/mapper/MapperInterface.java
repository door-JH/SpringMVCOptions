package info.example.mapper;

import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;

import info.example.beans.DataBean1;

public interface MapperInterface {
	
	@Insert("insert info SPRING0604_TABLE (data1, data2, data3) values (#{data1}, #{data2}, #{data3})")
	void insert_data(DataBean1 dataBean1);
	
	@Select("select data1, data2, data3 from SPRING0604_TABLE")
	List<DataBean1> select_data();
	
}
