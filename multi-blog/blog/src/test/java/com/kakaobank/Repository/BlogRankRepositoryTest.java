package com.kakaobank.Repository;

import com.kakaobank.entity.BlogRank;
import com.kakaobank.repository.BlogRankRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class BlogRankRepositoryTest {
    @Autowired
    private BlogRankRepository blogRankRepository;

    @Test
    void findTop10ByOrderByHitDesc() {
        blogRankRepository.saveAll(getEntity());
        List<BlogRank> BlogRankList = blogRankRepository.findTop10ByOrderByHitDesc();
        assertEquals(10, BlogRankList.size());
        assertEquals("여름", BlogRankList.get(0).getKeyword());
        assertEquals("개발자", BlogRankList.get(2).getKeyword());
        assertEquals("RED", BlogRankList.get(5).getKeyword());
        assertEquals("카카오뱅크", BlogRankList.get(9).getKeyword());
    }

    private List<BlogRank> getEntity() {
        List<BlogRank> BlogRankList = asList(
                BlogRank.builder().keyword("카카오뱅크").hit(2).build(),
                BlogRank.builder().keyword("카카오").hit(20).build(),
                BlogRank.builder().keyword("뱅크").hit(5).build(),
                BlogRank.builder().keyword("RED").hit(16).build(),
                BlogRank.builder().keyword("개발").hit(8).build(),
                BlogRank.builder().keyword("개발자").hit(45).build(),
                BlogRank.builder().keyword("테스트").hit(33).build(),
                BlogRank.builder().keyword("GIT").hit(1).build(),
                BlogRank.builder().keyword("여름").hit(92).build(),
                BlogRank.builder().keyword("겨울").hit(77).build(),
                BlogRank.builder().keyword("봄").hit(13).build()
        );
        return BlogRankList;
    }
}