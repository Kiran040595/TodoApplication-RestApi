package  com.example.todo;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.todo.*;

@RestController
public class TodoController{
    TodoService todoService = new TodoService();
    @GetMapping("/todos") 
    public ArrayList<Todo> getTodos(){
        return todoService.getTodos();
    }
    @GetMapping("/todos/{todoId}")
    public Todo getTodoById(@PathVariable("todoId") int todoId){
        return todoService.getTodoById(todoId);
    }
    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }
    @PutMapping("/todos/{id}") 
    public Todo updateTodo(@PathVariable("id")int id,@RequestBody Todo todo){
        return todoService.updateTodo(id, todo);
    }
    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable("id") int id){
        todoService.deleteTodo(id);
    }
}
