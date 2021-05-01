package com.xiaoma.demo.controller;

import com.xiaoma.demo.domain.Random;
import com.xiaoma.demo.service.RandomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author: kaixiang Zhao
 * @date: 2021-03-21 10:29
 */
@Slf4j
@RestController
@RequestMapping("random")
public class RandomController {

    @Autowired
    private RandomService randomService;

    @GetMapping("selectById")
    public Integer selectById(){
        Random random = randomService.selectByPrimaryKey(1L);
        java.util.Random rand = new java.util.Random();
        String message =null;
        if(random.getRestrict() !=null){
            message = handelMessage(random.getRestrict());

            log.info("=========获取数字 {} ==========="+message,random.getRestrict());
            return random.getRestrict();
        }else {
            int nextInt = rand.nextInt(random.getRandNum());
            message = handelMessage(nextInt);
            log.info("=========获取数字 {}==========="+message,nextInt);
            return nextInt;
        }
    }

    private String handelMessage(Integer restrict) {
        return restrict == 0 ? "谢谢惠顾"
                :(restrict == 1 ? "获取一元红包"
                :(restrict == 2 ? "你给我5元红包"
                :(restrict == 3 ? "你学一声猪叫"
                :(restrict == 4 ? "一起看电影"
                :(restrict == 5 ? "你请我吃饭"
                :(restrict == 6 ? "我请你吃饭"
                :"在一起"))))));
    }

    @GetMapping("test")
    public String test(){
        return "8888";
    }
}
