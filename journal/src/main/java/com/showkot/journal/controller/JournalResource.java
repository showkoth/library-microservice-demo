package com.showkot.journal.controller;


import com.showkot.journal.model.Journal;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/api")
public class JournalResource {

    ConcurrentMap<String, Journal> journals = new ConcurrentHashMap<>();
    @GetMapping("/journal/{id}")
    public Journal getJournal(@PathVariable String id){
        return journals.get(id);
    }

    @GetMapping("/journal")
    public List<Journal> getAllJournals(){
        return new ArrayList<Journal>(journals.values());
    }

    @PostMapping("/journal")
    public Journal addJournal(@RequestBody Journal journal){
        journals.put(journal.getJournalId(),journal);
        return journal;
    }
}
