package com.example.Service;
import java.util.List;

import com.example.Model.Office;

public interface AppSerIf {

    boolean addEmp(Office off);

    List<Office> allEmp();

}
