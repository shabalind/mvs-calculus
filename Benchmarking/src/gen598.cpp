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
    std::vector<std::vector<s1>> p0;
    s1 p1;
    s2(std::vector<std::vector<s1>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s2> p0;
    std::vector<double> p1;
    s3(std::vector<s2> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  std::vector<s3> f106(const std::vector<s3> &v0) {
    const s3 v6 = v0[2];
    std::vector<s3> v7 = v0;
    v7[0] = v6;
    std::vector<s3> v10 = v7;
    v7[1] = v6;
    return v10;
  }
  s0 f105(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p1;
    const std::vector<std::vector<double>> v5 = v0.p0;
    const std::vector<double> v4 = v7[0];
    const std::vector<double> v6 = v7[0];
    const std::vector<std::vector<double>> v2 = v0.p1;
    const s0 v9(v5, v7);
    const double v1 = v6[0];
    std::vector<std::vector<double>> v12 = v2;
    const std::vector<std::vector<double>> v11 = v0.p0;
    const std::vector<std::vector<double>> v10 = v9.p0;
    const std::vector<double> v8 = v2[0];
    v12[0] = v4;
    v12[0] = v4;
    v12[0] = v8;
    double v31 = v1;
    const std::vector<double> v28 = v10[1];
    s0 v25 = v9;
    s0 v15 = v0;
    std::vector<double> v16 = v8;
    v12[0] = v6;
    double v19 = v31;
    const std::vector<double> v32 = v7[0];
    const std::vector<double> v20 = v11[0];
    const std::vector<std::vector<double>> v24 = v15.p1;
    std::vector<double> v41 = v20;
    const std::vector<std::vector<double>> v46 = v0.p1;
    const s0 v65(v11, v46);
    std::vector<std::vector<double>> v40 = v46;
    v41[0] = v1;
    v25.p1 = v24;
    const std::vector<std::vector<double>> v47 = v9.p1;
    v15.p1 = v7;
    v40[0] = v41;
    const std::vector<std::vector<double>> v23 = v0.p1;
    const std::vector<std::vector<double>> v44 = v25.p0;
    v25.p1 = v47;
    v16[0] = v19;
    const std::vector<std::vector<double>> v45 = v65.p1;
    std::vector<double> v35 = v16;
    const std::vector<std::vector<double>> v74 = v65.p1;
    v41[0] = v19;
    const std::vector<double> v56 = v40[0];
    v25.p1 = v12;
    v15.p1 = v45;
    v15.p1 = v23;
    v12[0] = v56;
    v25.p1 = v74;
    v25.p1 = v74;
    v12[0] = v32;
    v15.p0 = v44;
    v12[0] = v35;
    v12[0] = v28;
    return v25;
  }
  s3 f103(const s3 &v0) {
    const std::vector<double> v6 = v0.p1;
    std::vector<double> v7 = v6;
    const std::vector<s3> v4 { v0, v0, v0 };
    s3 v1 = v0;
    const double v3 = v6[1];
    v1.p1 = v6;
    v7[1] = v3;
    std::vector<s3> v11 = v4;
    const std::vector<s3> v12 = f106(v11);
    const double v8 = v7[1];
    s3 v42 = v1;
    v42.p1 = v6;
    v11[1] = v1;
    v7[0] = v8;
    v11[2] = v42;
    const std::vector<double> v14 = v42.p1;
    v42.p1 = v14;
    const s3 v31 = v12[2];
    v1.p1 = v7;
    v7[0] = v8;
    return v31;
  }
  s1 f101(const s1 &v0, const s3 &v1) {
    s1 v7 = v0;
    const s0 v9 = v7.p1;
    v7.p1 = v9;
    const std::vector<s0> v11 = v7.p0;
    v7.p0 = v11;
    const std::vector<s0> v22 = v7.p0;
    v7.p0 = v22;
    v7.p0 = v22;
    s1 v54 = v0;
    const std::vector<s0> v48 = v0.p0;
    v54.p0 = v22;
    v54.p0 = v48;
    return v54;
  }
  s3 f98(const s3 &v0, const s1 &v1) {
    const s3 v7 = f103(v0);
    s3 v4 = v0;
    const std::vector<s2> v5 = v7.p0;
    const std::vector<s2> v14 = v7.p0;
    const s3 v17 = f103(v4);
    v4.p0 = v5;
    const s3 v8 = f103(v17);
    const std::vector<double> v27 = v8.p1;
    const s3 v19(v14, v27);
    const s3 v50 = f103(v17);
    v4 = v50;
    return v19;
  }
  s3 f59(const s0 &v0, const s3 &v1) {
    const std::vector<double> v10 = v1.p1;
    const s3 v11 = f103(v1);
    const std::vector<s2> v17 = v11.p0;
    std::vector<s2> v25 = v17;
    const s3 v48(v25, v10);
    return v48;
  }
  s3 f58(const s3 &v0) {
    s3 v2 = v0;
    const s3 v4 = f103(v0);
    const s3 v13 = f103(v0);
    const s3 v1 = f103(v2);
    const std::vector<double> v5 = v1.p1;
    v2.p1 = v5;
    v2.p1 = v5;
    const std::vector<double> v7 = v13.p1;
    const s3 v15 = f103(v2);
    v2.p1 = v7;
    const std::vector<s2> v18 = v4.p0;
    const s3 v19 = f103(v15);
    std::vector<s2> v22 = v18;
    const s2 v49 = v22[0];
    s2 v54 = v49;
    const std::vector<s2> v71 = v0.p0;
    const s1 v43 = v54.p1;
    s1 v40 = v43;
    const s1 v58 = f101(v40, v19);
    v2.p0 = v71;
    s1 v33 = v58;
    const s3 v57 = f98(v2, v33);
    return v57;
  }
  s3 f19(const s3 &v0) {
    const s3 v5 = f58(v0);
    const std::vector<s2> v6 = v0.p0;
    const std::vector<double> v3 = v5.p1;
    const s2 v1 = v6[0];
    std::vector<s2> v11 = v6;
    std::vector<s2> v12 = v6;
    const s3 v28 = f58(v0);
    const s1 v25 = v1.p1;
    s2 v19 = v1;
    v11[0] = v1;
    const s1 v10 = v19.p1;
    const s3 v24(v11, v3);
    const s1 v18 = v19.p1;
    const s2 v13 = v12[0];
    v19.p1 = v18;
    v19.p1 = v25;
    v12[0] = v13;
    s1 v26 = v18;
    s1 v42 = v25;
    const s3 v41 = f98(v24, v26);
    const s1 v71 = v19.p1;
    v42 = v71;
    const s0 v31 = v10.p1;
    v26.p1 = v31;
    const s0 v30 = v42.p1;
    s0 v72 = v30;
    const s2 v52 = v12[0];
    const s1 v81 = f101(v42, v41);
    const std::vector<s2> v55 { v52, v13, v19, v13, v19, v13, v13 };
    v42.p1 = v72;
    v19.p1 = v81;
    const s3 v37 = f98(v28, v18);
    const s0 v114 = f105(v72);
    const s2 v124 = v55[3];
    const s2 v62 = v12[0];
    const s0 v121 = v81.p1;
    const s3 v95 = f59(v121, v37);
    v26.p1 = v30;
    v11[0] = v62;
    v12[0] = v13;
    const std::vector<std::vector<double>> v79 = v114.p1;
    v72.p1 = v79;
    v11[0] = v124;
    v72 = v121;
    return v95;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s3 v7 = f103(v0);
    const s3 v4 = f19(v7);
    const s3 v5 = f103(v4);
    const std::vector<double> v23 = v5.p1;
    const double v68 = v23[0];
    return v68;
  }
  int main() {
    s3 v0({ { { { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } } }, { { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } } }, { 18.0, 19.0 } });
    double v1(20.0);
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
