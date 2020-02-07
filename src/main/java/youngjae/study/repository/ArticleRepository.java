package youngjae.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import youngjae.study.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{

}
