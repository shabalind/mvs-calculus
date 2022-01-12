  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<std::vector<s1>> p1;
    s2(std::vector<s0> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    std::vector<s0> p1;
    s3(s2 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  std::vector<double> f71(const std::vector<double> &v0) {
    const double v6 = v0[0];
    double v7 = v6;
    std::vector<double> v4 = v0;
    v4[0] = v6;
    const double v1 = v4[0];
    const double v10 = v4[0];
    v4[0] = v10;
    std::vector<double> v8 = v4;
    std::vector<double> v5 = v8;
    const std::vector<double> v2 { v10, v10, v1, v1 };
    const double v9 = v7 * v1;
    const double v12 = v8[0];
    std::vector<double> v15 = v4;
    const double v16 = v5[0];
    const double v24 = v2[0];
    const double v22 = v2[2];
    const double v36 = v2[1];
    std::vector<double> v21 = v0;
    std::vector<double> v29 = v4;
    v8[0] = v24;
    v4[0] = v7;
    const double v46 = v21[0];
    const std::vector<double> v26 { v16, v36, v7, v46 };
    const double v54 = v26[3];
    v5[0] = v24;
    v29[0] = v36;
    v4[0] = v54;
    v21[0] = v22;
    double v53 = v54;
    const double v30 = v2[1];
    std::vector<double> v34 = v26;
    std::vector<double> v55 = v26;
    std::vector<double> v39 = v55;
    const double v49 = v4[0];
    v55[0] = v49;
    const double v76 = v15[0];
    const double v40 = v30 * v22;
    const std::vector<std::vector<double>> v47 { v2, v2, v34, v39, v55, v39 };
    v8[0] = v40;
    std::vector<double> v35 = v21;
    v34[2] = v12;
    const std::vector<double> v59 = v47[5];
    std::vector<double> v92 = v29;
    v8[0] = v53;
    v35[0] = v53;
    const double v72 = v59[3];
    v92[0] = v72;
    v4[0] = v9;
    v92[0] = v76;
    std::vector<double> v135 = v92;
    v35 = v135;
    v15[0] = v46;
    return v35;
  }
  std::vector<double> f49(const std::vector<double> &v0) {
    std::vector<double> v8 = v0;
    std::vector<double> v2 = v0;
    const double v6 = v2[2];
    const double v1 = v2[0];
    v2[1] = v6;
    std::vector<double> v18 = v8;
    double v15 = v1;
    const double v14 = v8[1];
    v8[0] = v14;
    v8[2] = v15;
    std::vector<double> v22 = v18;
    std::vector<double> v17 = v22;
    v17[2] = v1;
    return v17;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    double v2 = v1;
    const std::vector<s0> v4 = v0.p1;
    const double v7 = v1 * v1;
    const std::vector<double> v9 { v2, v1, v7 };
    const std::vector<double> v6 = f49(v9);
    std::vector<double> v3 = v9;
    const s0 v14 = v4[0];
    const std::vector<std::vector<double>> v10 = v14.p0;
    v3[0] = v2;
    const std::vector<double> v19 = v10[0];
    v3 = v6;
    const double v24 = v19[0];
    const double v33 = v3[2];
    const std::vector<double> v54 = f49(v3);
    std::vector<double> v57 = v19;
    const std::vector<double> v25 = f71(v57);
    v3[2] = v7;
    const std::vector<double> v175 = f71(v25);
    v57[0] = v33;
    double v63 = v7;
    const double v60 = v54[2];
    const double v120 = v24 / v60;
    v57[0] = v63;
    const double v52 = v175[0];
    v3[2] = v7;
    const double v133 = v120 / v52;
    return v133;
  }
  int main() {
    s3 v0({ { { { { { 0.0 }, { 1.0 } } } }, { { { { { { { 2.0 }, { 3.0 } } } }, { { { { 4.0 }, { 5.0 } } } } } }, { { { { { { 6.0 }, { 7.0 } } } }, { { { { 8.0 }, { 9.0 } } } } } }, { { { { { { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } } } } } } } }, { { { { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } } } } });
    double v1(18.0);
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
