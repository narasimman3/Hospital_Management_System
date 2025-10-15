package com.hms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.Model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
    
}
