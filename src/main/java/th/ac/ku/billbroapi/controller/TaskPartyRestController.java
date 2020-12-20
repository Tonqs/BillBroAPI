package th.ac.ku.billbroapi.controller;

import org.springframework.web.bind.annotation.*;
import th.ac.ku.billbroapi.data.TaskPartyRepository;
import th.ac.ku.billbroapi.model.TaskParty;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/task-party")
public class TaskPartyRestController {
    private TaskPartyRepository repository;

    public TaskPartyRestController(TaskPartyRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<TaskParty> getAll(){
        return repository.findAll();
    }

    @GetMapping("/captain/{captainId}")
    public List<TaskParty> getAllTaskID(@PathVariable int id){
        return repository.findByTaskPartyID(id);
    }

    @GetMapping("/{id}")
    public TaskParty getOne(@PathVariable int id){
        try{
            return repository.findById(id).get();
        }catch (NoSuchElementException e){
            return null;
        }
    }

    @PostMapping
    public TaskParty create(@RequestBody TaskParty taskParty){
        repository.save(taskParty);
        return taskParty;
    }

    @PutMapping("/{id}")
    public TaskParty updateName(@PathVariable int id, @RequestBody TaskParty taskParty){
        TaskParty record = repository.findById(id).get();
        record.setT_name(taskParty.getT_name());
        repository.save(record);
        return record;
    }

    @PutMapping("/{id}")
    public TaskParty updateRes(@PathVariable int id, @RequestBody TaskParty taskParty){
        TaskParty record = repository.findById(id).get();
        record.setT_res(taskParty.getT_res());
        repository.save(record);
        return record;
    }


    @PutMapping("/{id}")
    public TaskParty updateState(@PathVariable int id, @RequestBody TaskParty taskParty){
        TaskParty record = repository.findById(id).get();
        record.setT_state(taskParty.getT_state());
        repository.save(record);
        return record;
    }

    @PutMapping("/{id}")
    public TaskParty updateDate(@PathVariable int id, @RequestBody TaskParty taskParty){
        TaskParty record = repository.findById(id).get();
        record.setT_date(taskParty.getT_date());
        repository.save(record);
        return record;
    }

    @PutMapping("/{id}")
    public TaskParty updateEmail(@PathVariable int id, @RequestBody TaskParty taskParty){
        TaskParty record = repository.findById(id).get();
        record.setT_email(taskParty.getT_email());
        repository.save(record);
        return record;
    }

    @DeleteMapping("/{id}")
    public TaskParty delete(@PathVariable int id){
        TaskParty record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
