package app;

import com.github.javafaker.Faker;
import dao.BookDAO;
import entity.Book;
import org.apache.log4j.Logger;

public class App {

    static Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        Faker faker = new Faker();
        BookDAO bookDAO = new BookDAO();

        log.info(bookDAO.getBookById(6L));
        bookDAO.insertIntoTable(new Book(faker.book().author()));
        bookDAO.deleteFromTable(5L);
        bookDAO.updateBook("noul autor DAO", 7L);

        log.info(bookDAO.getAllBooks());

//        log.trace("Trace Message!");
//        log.debug("Debug Message!");
//        log.info("Info Message!");
//        log.warn("Warn Message!");
//        log.error("Error Message!");
//        log.fatal("Fatal Message!");
    }
}
