spring-data-jpa-sample
======================
spring-data-jpa-sample  
EclipseLinkをSpringDataで使う場合のサンプルです。  
  
解説(description)
------
#### app-config.xml  
eclipselink.weavingとloadTimeWeaverの設定を必ず行う事  
  
```xml
～～省略～～  
  
	<jpa:repositories base-package="com.heki1224.spring_data_jpa_sample.repositories" />

	<bean id="emf"
		class="org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean">
		<property name="dataSource" ref="dataSource" />
		<property name="packagesToScan" value="com.heki1224.spring_data_jpa_sample.entity" />
		<property name="jpaVendorAdapter">
			<bean
				class="org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter">
				<property name="showSql" value="true" />
			</bean>
		</property>
		<property name="jpaPropertyMap">
			<map>
				<entry key="eclipselink.weaving" value="false" />
			</map>
		</property>
		<property name="loadTimeWeaver">
			<bean
				class="org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver" />
		</property>
	</bean>
  
～～省略～～  
```
  
開発環境(development environment)
------------
Eclipse 4.3  
  
依存ライブラリ(dependencies library)
----------------
spring-data-jpa 1.3.4  
spring-orm 3.2.3  
eclipselink 2.4.2  
slf4j 1.7.5  
logback 1.0.13  
  
参考(Link)
----------------
http://static.springsource.org/spring-data/jpa/docs/1.3.4.RELEASE/reference/html/  
http://www.eclipse.org/eclipselink/documentation/2.4/  
http://stackoverflow.com/questions/10769051/eclipselinkjpavendoradapter-instead-of-hibernatejpavendoradapter-issue  
