package youngjae.study.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import youngjae.study.domain.Article;
import youngjae.study.repository.ArticleRepository;

@Controller
@RequestMapping("/article")
public class ArticleController {
	
    @Autowired
    private ArticleRepository articleRepository;
    
    @PostMapping("")
    public String setArticle(Article article, Model model) {
    	article.setRegisterDate(LocalDateTime.now());
    	System.out.println(article);
    	articleRepository.save(article);
    	return "redirect:/article/" + article.getId();
    }
    
    @GetMapping("/{id}")
    public String getArticle(Model model, @PathVariable Long id) {
    	Article article = articleRepository.findById(id).get();
    	model.addAttribute("article", article);
    	return "article/detail";
    }
    
    @GetMapping("")
    public String getArticleList(Model model) {
    	List<Article> articleList = articleRepository.findAll();
    	model.addAttribute("articleList", articleList);
    	articleList.forEach(System.out::println);
    	return "article/list";
    }
    
    @GetMapping("/update/{id}")
    public String getArticleUpdate(Model model, @PathVariable Long id) {
    	Article article = articleRepository.findById(id).get();
    	System.out.println(article);
    	model.addAttribute("article", article);
    	return "article/update";
    }
    
    @PostMapping("/update/{id}")
    public String setArticleUpdate(Model model, @PathVariable Long id, Article updatedArticle) {
    	Article article = articleRepository.findById(id).get();
    	article.setTitle(updatedArticle.getTitle());
    	article.setContent(updatedArticle.getContent());
    	article.setUpdateDate(LocalDateTime.now());
    	articleRepository.save(article);
    	return "redirect:/article/" + article.getId();
    	
    }
    
}
