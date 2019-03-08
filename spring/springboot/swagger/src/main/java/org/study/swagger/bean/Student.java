package org.study.swagger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "学生类")
public class Student extends Person {
    @ApiModelProperty(value = "学生编号")
    private int number;
    @ApiModelProperty(value = "学生分数")
    private int score;
    @ApiModelProperty(value = "学生id")
    private int studentId;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
