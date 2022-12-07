package t3h.vn.t3h_2210.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
public class BookController {

    @GetMapping("get") // GET data
    public Object get(@RequestParam(required = false) String name) {
        return "<h1 style=\"color:red\">Get book data" + name + "</h1>";
    }

    @PostMapping("post")
    public Object post(@RequestBody Object book) {
        return book;
    }

    @PutMapping("put/{id}") // Update data
    public Object post(@RequestBody Object book, @PathVariable Long id) {
        return book;
    }

    @DeleteMapping("delete/{id}")
    public Object delete(@PathVariable Long id) {
        return "<h1 style=\"color:red\">Deleted book data" + id + "</h1>";
    }
}