package com.org.doctorapp.client;

import com.org.doctorapp.exception.DoctorNotFoundException;
import com.org.doctorapp.exception.IdNotFoundExcetion;
import com.org.doctorapp.model.Doctor;
import com.org.doctorapp.model.Specialization;
import com.org.doctorapp.service.DoctorServiceImpl;
import com.org.doctorapp.service.IDoctorService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IDoctorService doctorService = new DoctorServiceImpl();
//        Specialization specialization = Specialization.GYNAEC;
//        String speciality  = specialization.getSpeciality();
//        String special = Specialization.GYNAEC.getSpeciality();
//        Doctor doctor = new Doctor("Nikhil", speciality,2000,9,8);
//        Doctor doctor = new Doctor("Raju", speciality,1000,3,2);
//        Doctor doctor = new Doctor("Sohil", speciality,6000,10,15);
//        Doctor doctor = new Doctor("Priya", speciality,5000,8,3);
//        doctorService.addDoctor(doctor);

//          Doctor doctor=new Doctor();
//          doctorService.updateDoctor(3,2000);

//          doctorService.deleteDoctor(4);

//        try {
//            System.out.println(doctorService.getById(3));;
//        } catch (IdNotFoundExcetion e) {
//            e.printStackTrace();
//        }

        List<Doctor> doctors=doctorService.getAll();
        for (Doctor doctor:doctors){
            System.out.println(doctor);
        }

        System.out.println("-----------------------");
        List<Doctor> doctors1= null;
        try {
            doctors1 = doctorService.getBySpecialityAndExp("GYNAECOLOGIST",8);
        } catch (DoctorNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Doctor doctor:doctors1){
            System.out.println(doctor);
        }

        System.out.println("-----------------------");
        List<Doctor> doctors2=null;
        try {
            doctors2 = doctorService.getBySpecialityAndLessFees("GYNAECOLOGIST",5000);
        } catch (DoctorNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Doctor doctor:doctors1){
            System.out.println(doctor);
        }
    }
}
