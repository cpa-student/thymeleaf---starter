package comp31.thymeleaf.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import comp31.thymeleaf.model.Course;
import comp31.thymeleaf.model.PersonList;
import comp31.thymeleaf.model.Pet;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {


    @GetMapping({"/","/index"})
    public String getMethodName() {
        return "index";
    }
    

    @GetMapping("/person-table")
    public String getTablePage(Model model) {

        PersonList people = new PersonList(10);
        model.addAttribute("headings", new String[] { "First", "Last", "email", "phone" });
        model.addAttribute("people", people);
        return "person-table";
    }


    @GetMapping("/course-list")
    public String getCourses(Model model) {
        List<Course> courses = List.of(
                new Course("COMP101", "Intro to Computer Science", "A"),
                new Course("MATH101", "Calculus II", "B+"),
                new Course("COMM120", "Calculus II", "A-"));
        model.addAttribute("courses", courses);
        return "course-list";
    }

    @GetMapping("/pet-form")
    public String getForm(Model model) {

        String[] petTypes = new String[] {"Cat","Dog","Hamster","Iguana","Other"};

        Pet pet = new Pet();
        pet.setName("My Pet");
        model.addAttribute("pet", pet);
        model.addAttribute("types",petTypes);
        return "pet-form";
    }

    @PostMapping("/pet-form")
    public String postForm(Pet pet) {

        System.err.println(pet.getName() + " " + pet.getType());
        return "redirect:/index";
    }


}
