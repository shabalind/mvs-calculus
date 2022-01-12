  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f34(const s0 &v0) {
    s0 v1 = v0;
    s0 v7 = v1;
    const std::vector<std::vector<double>> v8 = v0.p0;
    v1 = v7;
    v1.p0 = v8;
    const std::vector<std::vector<double>> v6 = v1.p1;
    v1.p1 = v6;
    v7.p1 = v6;
    const std::vector<std::vector<double>> v12 = v1.p0;
    const std::vector<std::vector<double>> v18 = v0.p1;
    const std::vector<std::vector<double>> v15 = v0.p0;
    const std::vector<std::vector<double>> v21 = v1.p0;
    const std::vector<std::vector<double>> v33 = v1.p1;
    v7.p1 = v6;
    const std::vector<std::vector<double>> v26 = v7.p1;
    const std::vector<std::vector<double>> v17 = v7.p0;
    const std::vector<std::vector<double>> v24 = v0.p1;
    v7.p0 = v12;
    const std::vector<std::vector<std::vector<double>>> v54 { v24, v26, v26, v6, v24, v18, v26 };
    s0 v36 = v1;
    const std::vector<std::vector<double>> v61 = v0.p1;
    v36.p0 = v12;
    std::vector<std::vector<std::vector<double>>> v29 = v54;
    v1.p1 = v33;
    v7.p0 = v17;
    std::vector<std::vector<std::vector<double>>> v43 = v54;
    v36.p0 = v21;
    const std::vector<std::vector<double>> v63 = v7.p1;
    v1.p1 = v61;
    const std::vector<std::vector<double>> v37 = v0.p0;
    v43[3] = v61;
    const std::vector<std::vector<double>> v42 = v1.p1;
    const std::vector<std::vector<double>> v56 = v36.p1;
    const std::vector<std::vector<double>> v101 = v0.p1;
    v1 = v7;
    v1.p0 = v15;
    const std::vector<std::vector<double>> v59 = v36.p0;
    v1.p1 = v63;
    const std::vector<std::vector<double>> v80 = v43[1];
    const std::vector<std::vector<double>> v57 = v7.p0;
    const std::vector<std::vector<double>> v152 = v29[0];
    v36.p0 = v59;
    v36.p1 = v6;
    const std::vector<std::vector<std::vector<double>>> v118 { v101 };
    v7.p1 = v80;
    std::vector<std::vector<std::vector<double>>> v138 = v118;
    const s0 v65(v37, v24);
    v1.p1 = v56;
    const std::vector<std::vector<double>> v73 = v138[0];
    const std::vector<std::vector<double>> v145 = v65.p1;
    const std::vector<std::vector<double>> v131 = v65.p0;
    std::vector<std::vector<std::vector<double>>> v82 = v43;
    const std::vector<std::vector<double>> v151 = v0.p0;
    const std::vector<std::vector<double>> v213 = v82[4];
    v7.p0 = v21;
    v36.p0 = v57;
    v7.p1 = v213;
    const std::vector<std::vector<double>> v132 = v36.p1;
    v1.p1 = v145;
    const std::vector<std::vector<double>> v196 = v36.p1;
    v36.p1 = v132;
    v36.p0 = v151;
    v36.p1 = v42;
    v7.p1 = v196;
    const s0 v221(v131, v152);
    v1.p1 = v6;
    v36.p1 = v73;
    return v221;
  }
  s2 f33(const s2 &v0) {
    s2 v6 = v0;
    const std::vector<s1> v4 = v6.p0;
    std::vector<s1> v2 = v4;
    const s1 v8 = v2[0];
    const s1 v11 = v4[0];
    const std::vector<s0> v7 = v8.p0;
    v2[0] = v8;
    std::vector<s1> v3 = v2;
    std::vector<s0> v15 = v7;
    v6.p0 = v4;
    std::vector<s1> v13 = v2;
    std::vector<s0> v12 = v15;
    const s1 v10 = v13[0];
    const s0 v20 = v12[0];
    const s0 v24 = f34(v20);
    const s0 v18 = f34(v24);
    s0 v25 = v18;
    const std::vector<s1> v21 = v0.p0;
    v13[0] = v11;
    v13[0] = v10;
    v12[1] = v18;
    s1 v14 = v8;
    const s0 v46 = v14.p1;
    v14 = v10;
    v13[0] = v8;
    v2[0] = v11;
    const s1 v22 = v21[0];
    const s2 v28(v3, v25);
    v6.p1 = v46;
    v13[0] = v22;
    return v28;
  }
  s0 f28(const s0 &v0) {
    const std::vector<std::vector<double>> v1 = v0.p1;
    const std::vector<double> v9 = v1[1];
    std::vector<std::vector<double>> v4 = v1;
    const s0 v11 = f34(v0);
    const s0 v2 = f34(v0);
    const s0 v12 = f34(v2);
    const std::vector<std::vector<double>> v21 = v11.p0;
    const s0 v19 = f34(v0);
    const std::vector<double> v28 = v4[0];
    const s0 v16 = f34(v19);
    const std::vector<double> v27 = v21[1];
    const s0 v26 = f34(v12);
    const std::vector<std::vector<double>> v66 = v16.p0;
    std::vector<std::vector<double>> v57 = v4;
    v57[1] = v28;
    s0 v103 = v26;
    v103.p0 = v66;
    v103.p1 = v57;
    const std::vector<std::vector<double>> v86 = v2.p1;
    v57 = v86;
    const s0 v46 = f34(v103);
    v57[0] = v27;
    v4[0] = v9;
    return v46;
  }
  s2 f20(const s2 &v0, const s2 &v1) {
    const s0 v3 = v0.p1;
    s0 v7 = v3;
    const std::vector<std::vector<double>> v4 = v3.p1;
    v7.p1 = v4;
    s0 v6 = v7;
    const std::vector<std::vector<double>> v2 = v3.p0;
    std::vector<std::vector<double>> v8 = v2;
    const std::vector<double> v9 = v8[0];
    const s0 v5(v2, v4);
    std::vector<std::vector<double>> v12 = v8;
    const s2 v13 = f33(v0);
    const std::vector<std::vector<double>> v14 = v5.p1;
    v12[1] = v9;
    const std::vector<double> v18 = v8[0];
    v6.p0 = v12;
    v8[1] = v9;
    const std::vector<double> v25 = v2[1];
    v8[0] = v25;
    const s2 v26 = f33(v0);
    v7.p1 = v4;
    std::vector<std::vector<double>> v19 = v4;
    const std::vector<std::vector<double>> v15 = v5.p0;
    const std::vector<std::vector<double>> v34 = v5.p1;
    v7.p0 = v15;
    const s0 v17 = f28(v6);
    v8[0] = v9;
    v12[0] = v25;
    v7.p0 = v15;
    const s2 v29 = f33(v26);
    s0 v30 = v6;
    const std::vector<std::vector<double>> v38 = v3.p0;
    v19[1] = v18;
    const s0 v40 = f34(v5);
    const std::vector<std::vector<double>> v28 = v40.p0;
    const std::vector<std::vector<double>> v35 = v17.p0;
    v12 = v35;
    s0 v41 = v3;
    const s0 v96 = f34(v30);
    v30.p1 = v19;
    std::vector<std::vector<double>> v69 = v38;
    const std::vector<std::vector<double>> v119 = v17.p1;
    const std::vector<std::vector<double>> v56 = v96.p1;
    v41.p1 = v56;
    v41.p1 = v119;
    const s0 v113 = v1.p1;
    std::vector<std::vector<double>> v82 = v4;
    v82[2] = v18;
    std::vector<std::vector<double>> v100 = v28;
    s0 v98 = v5;
    std::vector<std::vector<double>> v44 = v14;
    const std::vector<double> v78 = v38[1];
    s2 v108 = v29;
    const std::vector<std::vector<double>> v109 = v41.p1;
    v98.p1 = v34;
    v30.p0 = v35;
    v108.p1 = v96;
    v12[1] = v78;
    v98 = v113;
    std::vector<std::vector<double>> v66 = v69;
    v30.p1 = v82;
    v6 = v98;
    v7.p0 = v100;
    v69[1] = v9;
    v6.p1 = v44;
    v108.p1 = v98;
    v41.p0 = v66;
    const std::vector<s1> v202 = v13.p0;
    v6.p1 = v109;
    s2 v107 = v108;
    v6.p1 = v119;
    v107.p0 = v202;
    return v107;
  }
  s0 f14(const s0 &v0) {
    const s0 v3 = f28(v0);
    const s0 v43 = f28(v3);
    const s0 v46 = f28(v43);
    const s0 v48 = f34(v46);
    return v48;
  }
  s0 f5(const s2 &v0, const s0 &v1) {
    const s0 v6 = v0.p1;
    const s0 v5 = f14(v6);
    s0 v10 = v6;
    v10 = v5;
    return v10;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const s2 &v1, const double &v2) {
    s2 v7 = v1;
    const std::vector<s1> v3 = v7.p0;
    const std::vector<s2> v5 { v1, v1, v1, v1, v1, v7 };
    const s1 v4 = v3[0];
    const s2 v8 = v5[4];
    const std::vector<s1> v18 = v8.p0;
    std::vector<s1> v13 = v3;
    const s2 v6 = f20(v1, v7);
    const s1 v22 = v0[0];
    v7.p0 = v18;
    v7.p0 = v18;
    v13 = v3;
    v7.p0 = v13;
    v7.p0 = v18;
    const s0 v19 = v6.p1;
    const s0 v51 = f28(v19);
    s1 v30 = v4;
    const s0 v16 = f5(v1, v19);
    v13[0] = v22;
    const std::vector<std::vector<double>> v37 = v16.p1;
    v30.p1 = v51;
    const std::vector<double> v42 = v37[0];
    const double v63 = v42[0];
    const s0 v83 = v6.p1;
    v13[0] = v22;
    s0 v122 = v83;
    double v65 = v63;
    v122.p1 = v37;
    double v72 = v65;
    v13[0] = v30;
    v7.p1 = v122;
    return v72;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } }, { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } });
    s2 v1({ { { { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } }, { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } } } }, { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } } });
    double v2(50.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
