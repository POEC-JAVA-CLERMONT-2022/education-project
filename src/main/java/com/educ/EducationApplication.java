package com.educ;

import com.educ.data.RoleRepository;
import com.educ.entity.*;
import com.educ.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class EducationApplication {

	@Autowired
	private RoleService roleService;

	@Autowired
	private ModuleeService moduleeService;

	@Autowired
	private VideoService videoService;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserService userService;

	@Autowired
	private ReviewService reviewService;

	public static void main(String[] args) {
		SpringApplication.run(EducationApplication.class, args);
	}
	
	@EventListener(classes= {ApplicationStartedEvent.class})
	public void applicationStarted() {

		/* Load roles by default */
		Role roleM= roleService.createRole("Member");
		Role roleA=this.roleService.createRole("Admin");
		Role roleT=this.roleService.createRole("Teacher");
		Role roleS=this.roleService.createRole("Student");


		//User user = userService.findByEmail("g@gmail.com");
		//User user = userService.getById(1L);
		//List<User> users=userService.findAll();
		//System.out.println(user);





		//Modulee modulee = moduleeService.getById(1L);
		//System.out.println(modulee);
		//Video video = videoService.findByUrl("https");
		Video video = videoService.getById(1L);
		System.out.println(video);

		//Review review = reviewService.getById(1L);
		//System.out.println(review)

	}
}
