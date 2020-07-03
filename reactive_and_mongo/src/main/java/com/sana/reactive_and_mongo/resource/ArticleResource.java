
package com.sana.reactive_and_mongo.resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.sana.reactive_and_mongo.document.Article;
import com.sana.reactive_and_mongo.repository.ArticleRepository;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/rest/Articles")


public class ArticleResource {
    
    private ArticleRepository artRepo;
    
    public ArticleResource(ArticleRepository artRepo)
	{
		this.artRepo= artRepo;
	}
	
	@GetMapping("/findAll")
	public List<Article> getAll()
	{
		return  artRepo.findAll();
	}
        
        @GetMapping("/deleteAll")
        public String deleteAll()
        {
            artRepo.deleteAll();
            return "All data deleted from Database";
        }
        
        @GetMapping("/deletebyid")
        public String deleteById(@RequestParam int id) {
            artRepo.deleteById(id);
            return "Successfully deleted row";
        }
        
        @GetMapping("/findbyid")
        public List findbyid(@RequestParam int id) {
         Article a = artRepo.findById(id).get();
         List list = java.util.Arrays.asList(a);
         return list;
         
        }
        
        @GetMapping("/insert")
        public String insert(@RequestParam(name="id") int id,
                @RequestParam(name="description")String description,
                @RequestParam(name="label") String label,
                @RequestParam(name="vender")String vendor){
            
            Article a = new Article(id,label,description,vendor);
            artRepo.insert(a);
            return "Sucessfully inserted";
        }
}
