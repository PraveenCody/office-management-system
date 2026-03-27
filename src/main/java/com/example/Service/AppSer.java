package com.example.Service;
import java.util.List;

import com.example.Dao.AppDao;
import com.example.Model.Office;

public class AppSer implements AppSerIf {

    AppDao dao = new AppDao();

    public boolean addEmp(Office off){
        dao.add(off);
        return true;
    }

    @Override
    public List<Office> allEmp() {
        List<Office> list = dao.all();
        return list;
    }

}
