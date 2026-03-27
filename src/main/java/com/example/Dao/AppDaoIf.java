package com.example.Dao;
import java.util.List;

import com.example.Model.Office;

public interface AppDaoIf {

    void add(Office off);

    List<Office>all();

}
