package com.mycompany.demo_java_web02.dao.entity;

import com.mycompany.demo_java_web02.dao.entity.SinhVien;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-27T00:54:52")
@StaticMetamodel(LopHoc.class)
public class LopHoc_ { 

    public static volatile SingularAttribute<LopHoc, Integer> ma;
    public static volatile SingularAttribute<LopHoc, String> ten;
    public static volatile CollectionAttribute<LopHoc, SinhVien> sinhVienCollection;

}