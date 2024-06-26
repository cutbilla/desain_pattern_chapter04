package single_responsibility;

import single_responsibility.Author;

public interface AuthorRepo {
    boolean checkAuthorId(int authorId);
    void save(Author author);
}
