package kz.iitu.projects.ex7;

import kz.iitu.projects.ex7.config.Conf;
import kz.iitu.projects.ex7.entity.Books;
import kz.iitu.projects.ex7.entity.Users;
import kz.iitu.projects.ex7.entity.Address;
import kz.iitu.projects.ex7.entity.Page;
import kz.iitu.projects.ex7.repository.BookRepository;
import kz.iitu.projects.ex7.repository.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);

        UserRepository userRepository = context.getBean("userRepository", UserRepository.class);
        BookRepository bookRepository = context.getBean("bookRepository", BookRepository.class);

        Users users = new Users();
        users.setName("Alex");

        Address address = new Address();
        address.setHouseNo(90);
        address.setStreet("Zhandosov St.");
        users.setAddress(address);
        address.setUser(users);

        Books books = new Books();
        books.setTitle("War and peace");
        books.setAuthpr("Fedor");

        Page page = new Page();
        page.setPageNo(1);
        page.setChapterNo(1);
        page.setBook(books);



        userRepository.saveAndFlush(users);
        bookRepository.saveAndFlush(books);




}
}
