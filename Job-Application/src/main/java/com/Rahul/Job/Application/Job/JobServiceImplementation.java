package com.Rahul.Job.Application.Job;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImplementation implements JobService{

    private List<Job> jobs = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<Job> findAll() {
        return jobs;
    }
    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job getJobById(Long id) {
        for (Job job: jobs){
            if(job.getId().equals(id))
                return job;
        }
        return null;
    }

    @Override
    public boolean deleteJobById(Long id) {

        return jobs.removeIf(job -> job.getId() != null && job.getId().equals(id));
    }

    @Override
    public boolean updateJob(Long id, Job updatedJob) {
        for( Job job: jobs)
            if(job.getId().equals(id)){
                job.setTitle(updatedJob.getTitle());
                job.setDescription(updatedJob.getDescription());
                job.setMinSalary(updatedJob.getMinSalary());
                job.setMaxSalary(updatedJob.getMaxSalary());
                job.setLocation(updatedJob.getLocation());
                return true;

            }
        return false;
    }
}
