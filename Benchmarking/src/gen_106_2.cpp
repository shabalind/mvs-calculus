  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f96(const s0 &v0) {
    s0 v6 = v0;
    const std::vector<std::vector<double>> v1 = v0.p1;
    const std::vector<double> v3 = v1[1];
    const std::vector<std::vector<double>> v4 = v6.p0;
    v6 = v0;
    const std::vector<std::vector<double>> v16 = v6.p0;
    const std::vector<std::vector<double>> v9 = v6.p1;
    const s0 v8(v1, v9);
    const std::vector<std::vector<double>> v13 = v6.p0;
    v6.p0 = v9;
    const std::vector<std::vector<double>> v21 = v8.p1;
    v6.p0 = v21;
    std::vector<std::vector<double>> v30 = v13;
    v30 = v9;
    v6.p1 = v30;
    const s0 v19(v16, v16);
    v6.p0 = v4;
    s0 v64 = v19;
    v64.p0 = v4;
    v30[1] = v3;
    const std::vector<std::vector<double>> v105 = v0.p0;
    v6.p1 = v105;
    return v64;
  }
  s0 f91(const s0 &v0, const s0 &v1) {
    s0 v5 = v0;
    s0 v2 = v5;
    s0 v10 = v2;
    return v10;
  }
  s0 f90(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v5 = v1.p1;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<s0> v10 { v1, v0, v1, v0, v1 };
    const std::vector<double> v3 = v5[0];
    const std::vector<std::vector<double>> v7 = v1.p0;
    const s0 v2 = f96(v1);
    const s0 v18 = f96(v1);
    const s0 v8 = f96(v18);
    const s0 v27 = f91(v8, v2);
    const std::vector<std::vector<double>> v20 = v18.p0;
    const std::vector<double> v16 = v5[0];
    const std::vector<std::vector<double>> v26 = v1.p1;
    const s0 v28 = f96(v8);
    std::vector<std::vector<double>> v29 = v5;
    const s0 v32 = v10[4];
    const std::vector<std::vector<double>> v55 = v28.p1;
    const s0 v24 = f91(v32, v1);
    const std::vector<std::vector<double>> v42 = v24.p0;
    const s0 v63 = f96(v27);
    s0 v52 = v8;
    std::vector<std::vector<double>> v47 = v29;
    const s0 v35(v55, v29);
    v52.p1 = v20;
    v52.p1 = v42;
    v52.p0 = v26;
    v52.p0 = v5;
    v52.p0 = v42;
    v52.p0 = v47;
    v52 = v35;
    v47 = v7;
    v52.p1 = v42;
    const s0 v135 = f91(v18, v52);
    v52.p0 = v42;
    v29[1] = v16;
    v52.p0 = v4;
    v47[1] = v3;
    const s0 v366 = f91(v135, v63);
    return v366;
  }
  s0 f65(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    const s0 v1(v5, v5);
    const s0 v2 = f91(v1, v0);
    std::vector<std::vector<double>> v8 = v5;
    s0 v3 = v2;
    const std::vector<std::vector<double>> v11 = v3.p0;
    const s0 v6 = f96(v3);
    const s0 v9 = f91(v1, v2);
    const std::vector<std::vector<double>> v14 = v9.p1;
    v3.p1 = v5;
    v3.p1 = v11;
    const std::vector<std::vector<double>> v16 = v6.p0;
    v3.p1 = v16;
    const std::vector<std::vector<double>> v25 = v9.p1;
    const s0 v27 = f90(v9, v3);
    v3.p1 = v25;
    const std::vector<s0> v26 { v9 };
    const s0 v44(v11, v8);
    const s0 v49 = v26[0];
    const s0 v61 = f91(v49, v1);
    const std::vector<std::vector<double>> v29 = v9.p1;
    const s0 v35 = f91(v44, v44);
    const s0 v46(v14, v25);
    v3.p1 = v29;
    const std::vector<s0> v95 { v46, v35, v61, v46, v35, v27 };
    const s0 v74 = v95[4];
    return v74;
  }
  s0 f43(const s0 &v0) {
    s0 v1 = v0;
    const s0 v6 = f90(v1, v0);
    const std::vector<std::vector<double>> v2 = v1.p0;
    s0 v7 = v1;
    const std::vector<std::vector<double>> v4 = v1.p0;
    s0 v8 = v1;
    v7.p0 = v2;
    const std::vector<std::vector<double>> v9 = v1.p1;
    v1.p0 = v4;
    const std::vector<std::vector<double>> v24 = v0.p1;
    const s0 v21 = f96(v0);
    const std::vector<std::vector<double>> v17 = v6.p1;
    const s0 v23 = f91(v8, v8);
    const s0 v32 = f91(v21, v23);
    const std::vector<std::vector<double>> v27 = v32.p1;
    v7.p1 = v4;
    s0 v30 = v7;
    const std::vector<std::vector<double>> v37 = v6.p1;
    const std::vector<std::vector<double>> v43 = v6.p0;
    s0 v16 = v30;
    v30.p1 = v43;
    v1.p0 = v2;
    v8.p1 = v37;
    v7.p0 = v24;
    v30.p0 = v24;
    v30.p0 = v27;
    v8.p1 = v9;
    const std::vector<std::vector<double>> v68 = v23.p1;
    v16.p0 = v9;
    s0 v132 = v16;
    v132.p1 = v37;
    const std::vector<std::vector<double>> v89 = v21.p0;
    const std::vector<std::vector<double>> v104 = v23.p0;
    v30.p1 = v43;
    v30.p0 = v17;
    v8.p1 = v89;
    v1.p0 = v68;
    v132.p0 = v104;
    v16.p1 = v4;
    return v132;
  }
  s0 f38(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p1;
    std::vector<std::vector<double>> v3 = v7;
    const std::vector<double> v2 = v7[0];
    const std::vector<std::vector<double>> v10 = v0.p1;
    const s0 v4 = f43(v0);
    v3[1] = v2;
    const std::vector<std::vector<double>> v9 = v0.p1;
    const std::vector<std::vector<double>> v11 = v0.p1;
    const s0 v5 = f96(v4);
    const s0 v6 = f96(v5);
    const std::vector<double> v15 = v10[1];
    v3[0] = v15;
    const std::vector<std::vector<double>> v19 = v5.p0;
    const s0 v16(v19, v3);
    const s0 v14 = f96(v16);
    std::vector<std::vector<double>> v21 = v3;
    const s0 v12 = f91(v14, v16);
    v3 = v19;
    const s0 v43(v21, v7);
    const std::vector<std::vector<double>> v29 = v43.p0;
    const s0 v20(v3, v29);
    v21[1] = v2;
    const s0 v84 = f96(v6);
    const std::vector<std::vector<double>> v27 { v2 };
    v21[1] = v2;
    std::vector<std::vector<double>> v48 = v7;
    const std::vector<std::vector<std::vector<double>>> v33 { v7, v9, v19, v48, v9, v48, v11 };
    v48[0] = v2;
    const std::vector<std::vector<double>> v54 = v20.p0;
    const std::vector<std::vector<double>> v53 = v12.p0;
    const s0 v28 = f65(v84);
    std::vector<std::vector<double>> v37 = v27;
    const std::vector<std::vector<double>> v76 = v33[3];
    const std::vector<std::vector<double>> v97 = v33[2];
    const std::vector<double> v39 = v37[0];
    v37[0] = v39;
    std::vector<std::vector<double>> v74 = v11;
    s0 v102 = v28;
    v48[0] = v39;
    v102.p1 = v76;
    const std::vector<std::vector<double>> v125 = v28.p0;
    v102.p1 = v125;
    v48 = v74;
    v102.p0 = v54;
    v102.p1 = v53;
    v102.p1 = v11;
    v102.p1 = v11;
    v102.p1 = v97;
    v102.p1 = v21;
    return v102;
  }
  s0 f29(const s0 &v0) {
    s0 v6 = v0;
    const s0 v3 = f38(v0);
    const std::vector<std::vector<double>> v5 = v0.p1;
    const std::vector<std::vector<double>> v2 = v3.p1;
    v6.p0 = v2;
    v6.p1 = v2;
    const s0 v4 = f96(v3);
    v6.p0 = v2;
    v6.p1 = v5;
    const s0 v13 = f65(v3);
    const std::vector<std::vector<double>> v34 = v0.p0;
    const std::vector<std::vector<double>> v20 = v3.p0;
    v6.p1 = v5;
    const s0 v21 = f65(v6);
    v6.p1 = v20;
    const std::vector<std::vector<double>> v30 = v21.p0;
    const std::vector<std::vector<double>> v50 = v4.p0;
    const std::vector<std::vector<double>> v24 = v13.p0;
    v6.p0 = v50;
    const std::vector<std::vector<double>> v33 = v13.p1;
    s0 v26 = v3;
    v6.p1 = v24;
    v26.p0 = v33;
    const std::vector<std::vector<double>> v48 = v0.p0;
    v26.p1 = v30;
    const std::vector<std::vector<double>> v72 = v13.p0;
    const std::vector<std::vector<double>> v101 = v3.p0;
    std::vector<std::vector<double>> v44 = v72;
    v26.p1 = v48;
    const s0 v87 = f96(v26);
    v26.p0 = v101;
    v26.p0 = v33;
    v26.p0 = v44;
    v6.p1 = v34;
    return v87;
  }
  s0 f11(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<std::vector<double>> v1 = v5.p0;
    const s0 v7 = f90(v0, v5);
    const s0 v4 = f91(v0, v0);
    v5.p0 = v1;
    const std::vector<std::vector<double>> v2 = v5.p0;
    const std::vector<std::vector<double>> v15 = v4.p1;
    v5.p0 = v2;
    v5.p0 = v15;
    v5.p1 = v15;
    return v7;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    s0 v2 = v0;
    const std::vector<std::vector<double>> v3 = v2.p1;
    s0 v6 = v2;
    const std::vector<std::vector<double>> v10 = v0.p1;
    const s0 v8 = f11(v0);
    const s0 v14 = f91(v2, v6);
    const std::vector<std::vector<double>> v4 = v8.p1;
    v2.p0 = v4;
    const s0 v13 = f43(v0);
    const std::vector<std::vector<double>> v21 = v14.p0;
    const std::vector<std::vector<double>> v20 = v0.p0;
    v6.p0 = v3;
    v6.p0 = v3;
    s0 v26 = v6;
    v2.p0 = v21;
    const s0 v39(v21, v21);
    const s0 v49 = f29(v13);
    std::vector<std::vector<double>> v36 = v10;
    v6.p1 = v4;
    const s0 v72 = f91(v26, v49);
    v2.p0 = v36;
    v6.p1 = v20;
    s0 v64 = v8;
    const s0 v224 = f96(v72);
    const std::vector<std::vector<double>> v136 = v224.p1;
    const std::vector<s0> v99 { v64, v64, v39, v13, v49 };
    const s0 v102 = v99[1];
    const std::vector<std::vector<double>> v94 = v102.p1;
    const std::vector<double> v91 = v94[0];
    v6.p1 = v136;
    const double v178 = v91[0];
    v2.p0 = v10;
    v64.p0 = v4;
    return v178;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } });
    double v1(4.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
