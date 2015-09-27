package com.cfi.chhavi.kitchenhelper;

/**
 * Created by chhavi on 27/9/15.
 */
public class SchoolItem{
    String school_name;
    int daal_servings;
    int rice_servings;
    int vegetables_servings;
    int bread_servings;

    public SchoolItem(String school_name, int daal_servings, int rice_servings, int vegetables_servings, int bread_servings){
        this.daal_servings=daal_servings;
        this.rice_servings=rice_servings;
        this.vegetables_servings=vegetables_servings;
        this.bread_servings=bread_servings;
        this.school_name=school_name;
    }
}
