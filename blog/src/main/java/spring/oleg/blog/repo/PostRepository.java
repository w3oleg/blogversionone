package spring.oleg.blog.repo;

import org.springframework.data.repository.CrudRepository;
import spring.oleg.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
