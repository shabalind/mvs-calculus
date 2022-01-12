  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s0> p1;
    s2(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f71(const s0 &v0) {
    const std::vector<s0> v1 { v0, v0, v0, v0, v0, v0 };
    const s0 v19 = v1[0];
    std::vector<s0> v43 = v1;
    const s0 v65 = v43[5];
    v43[0] = v19;
    v43[0] = v0;
    return v65;
  }
  s0 f68(const s0 &v0) {
    const s0 v2 = f71(v0);
    s0 v4 = v0;
    const s0 v6 = f71(v4);
    const std::vector<std::vector<double>> v7 = v6.p0;
    std::vector<std::vector<double>> v3 = v7;
    const std::vector<double> v12 = v3[1];
    v3[1] = v12;
    v3[0] = v12;
    const s0 v9 = f71(v0);
    s0 v5 = v9;
    const std::vector<std::vector<double>> v13 = v9.p1;
    const double v8 = v12[0];
    v3[1] = v12;
    const std::vector<std::vector<double>> v21 = v9.p1;
    const std::vector<double> v16 = v21[0];
    std::vector<double> v27 = v12;
    const std::vector<std::vector<double>> v15 = v2.p0;
    std::vector<std::vector<double>> v17 = v15;
    const std::vector<double> v24 = v17[2];
    const s0 v14 = f71(v5);
    v4.p1 = v21;
    v3[0] = v12;
    v27[0] = v8;
    v17[2] = v16;
    const double v28 = v12[0];
    v4.p1 = v13;
    const double v19 = v24[0];
    v5.p0 = v17;
    const std::vector<double> v32 = v17[1];
    v3[1] = v32;
    const s0 v18(v7, v21, v21);
    const s0 v41 = f71(v14);
    const std::vector<std::vector<double>> v42 = v41.p2;
    const std::vector<double> v65 = v3[1];
    v3[2] = v65;
    const std::vector<std::vector<double>> v40 = v18.p0;
    v4.p0 = v3;
    std::vector<double> v46 = v65;
    std::vector<std::vector<double>> v44 = v40;
    std::vector<std::vector<double>> v58 = v42;
    v27[0] = v28;
    v17[0] = v27;
    v3[0] = v27;
    const std::vector<std::vector<double>> v93 = v14.p2;
    const std::vector<std::vector<double>> v34 = v9.p1;
    const std::vector<double> v180 = v93[0];
    const std::vector<std::vector<double>> v84 = v5.p1;
    const s0 v116(v44, v84, v34);
    const s0 v96 = f71(v116);
    v46[0] = v19;
    v58[0] = v46;
    v5.p2 = v58;
    const s0 v183 = f71(v96);
    v3[0] = v180;
    return v183;
  }
  s0 f66(const s0 &v0) {
    const s0 v3 = f71(v0);
    const s0 v2 = f71(v3);
    const s0 v4 = f71(v2);
    const std::vector<std::vector<double>> v8 = v0.p2;
    s0 v16 = v3;
    v16.p1 = v8;
    const std::vector<std::vector<double>> v6 = v16.p2;
    const std::vector<std::vector<double>> v12 = v16.p0;
    v16 = v3;
    v16 = v4;
    const std::vector<std::vector<double>> v35 = v0.p2;
    const s0 v18(v12, v35, v6);
    const std::vector<std::vector<double>> v42 = v4.p1;
    const std::vector<std::vector<double>> v31 = v18.p1;
    const s0 v60(v12, v31, v8);
    std::vector<std::vector<double>> v69 = v8;
    v16.p2 = v69;
    v16.p2 = v42;
    const s0 v41 = f68(v60);
    v16.p2 = v69;
    const std::vector<std::vector<double>> v37 = v41.p2;
    v16.p1 = v6;
    v16.p1 = v37;
    return v41;
  }
  s2 f35(const s2 &v0) {
    const std::vector<s2> v2 { v0 };
    const s2 v17 = v2[0];
    return v17;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const s0 &v1, const std::vector<s0> &v2, const double &v3) {
    const s2 v5 = f35(v0);
    const std::vector<double> v8 { v3, v3, v3, v3, v3 };
    const std::vector<std::vector<double>> v4 = v1.p1;
    std::vector<std::vector<double>> v18 = v4;
    const std::vector<s0> v7 = v5.p1;
    std::vector<std::vector<double>> v11 = v4;
    const s0 v12 = v7[0];
    std::vector<std::vector<double>> v22 = v18;
    const std::vector<double> v14 = v22[0];
    const s0 v24 = f66(v12);
    v11[0] = v14;
    const double v20 = v14[0];
    const double v39 = v14[0];
    std::vector<double> v30 = v8;
    const double v31 = v8[4];
    double v35 = v39;
    const double v47 = v35 * v20;
    v22[0] = v14;
    v30[4] = v39;
    v30[1] = v47;
    v18[0] = v14;
    const std::vector<std::vector<double>> v55 = v24.p1;
    v30[3] = v20;
    const std::vector<double> v120 = v55[0];
    std::vector<double> v84 = v120;
    const double v44 = v84[0];
    const double v102 = v30[2];
    v30[0] = v31;
    v30[4] = v44;
    v30[0] = v3;
    const std::vector<std::vector<double>> v81 = v1.p1;
    const std::vector<double> v174 = v81[0];
    const std::vector<double> v145 = v11[0];
    v22[0] = v145;
    v18[0] = v174;
    v30[2] = v31;
    return v102;
  }
  int main() {
    s2 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 } }, { { 9.0 } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 } }, { { 14.0 } } } } }, { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 } }, { { 19.0 } } } } });
    s0 v1({ { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } }, { { 24.0 } } });
    std::vector<s0> v2({ { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 } }, { { 29.0 } } } });
    double v3(30.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
