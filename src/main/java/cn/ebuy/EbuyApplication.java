package cn.ebuy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.ebuy.mapper")
public class EbuyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbuyApplication.class,args);
    }
}


