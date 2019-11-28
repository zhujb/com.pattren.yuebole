package com.pattern.domain.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private int id;
    private String name;
    private double sales;

    private List<Company> subCompanys;

    public Company(int id, String name, double sales) {
        this.id = id;
        this.name = name;
        this.sales = sales;

        subCompanys=new ArrayList<>();
    }

    /**
     * 添加子公司
     * @param company
     */
    public void add(Company company){
        subCompanys.add(company);
    }

    /**
     * 删除子公司
     * @param company
     */
    public void remove(Company company){
        subCompanys.remove(company);
    }

    /**
     * 获取全部子公司
     * @return
     */
    public List<Company> getSubCompanys() {
        return subCompanys;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sales=" + sales +
                '}';
    }
}
