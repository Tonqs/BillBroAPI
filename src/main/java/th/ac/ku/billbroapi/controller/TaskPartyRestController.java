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

    @GetMapping("/captain/{cId}")
    public List<TaskParty> getAllCaptainID(@PathVariable int cId){
        return repository.findBycId(cId);
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
    public TaskParty update(@PathVariable int id, @RequestBody TaskParty taskParty){
        TaskParty record = repository.findById(id).get();
        record.setT_name(taskParty.getT_name());
        record.setT_res(taskParty.getT_res());
        record.setT_state(taskParty.getT_state());
        record.setT_date(taskParty.getT_date());
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
