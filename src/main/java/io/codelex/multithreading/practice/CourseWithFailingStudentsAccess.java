package io.codelex.multithreading.practice;

import com.github.javafaker.Faker;
import io.codelex.NoCodeWrittenException;

import java.util.List;

public class CourseWithFailingStudentsAccess {
    private static final Faker faker = Faker.instance();

    public static void main(String[] args) {
        throw new NoCodeWrittenException();
    }

    String findNewStudent() {
        return faker.name().fullName();
    }

    static class StudentsList {

        /**
         * This is an API provided to the client, therefore method signature change is not allowed
         */
        List<String> getStudentsLeftInCourse() {
            throw new NoCodeWrittenException();
        }
    }
}
