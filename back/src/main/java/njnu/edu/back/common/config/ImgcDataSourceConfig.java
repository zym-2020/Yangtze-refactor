package njnu.edu.back.common.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yiming
 * @Date: 2022/08/16/11:26
 * @Description:
 */
@Configuration
@MapperScan(basePackages = "njnu.edu.back.dao.imgc", sqlSessionTemplateRef  = "imgcSqlSessionTemplate")
public class ImgcDataSourceConfig {
    @Bean(name = "imgcDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.imgc")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "imgcSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("imgcDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/imgc/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "imgcTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("imgcDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "imgcSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("imgcSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
