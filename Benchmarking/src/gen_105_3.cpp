  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f14(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    std::vector<std::vector<double>> v1 = v6;
    s0 v3 = v0;
    v3.p0 = v6;
    const std::vector<std::vector<double>> v4 = v0.p1;
    v3.p0 = v6;
    s0 v17 = v3;
    const std::vector<std::vector<double>> v8 = v17.p1;
    const std::vector<std::vector<double>> v11 = v0.p0;
    const std::vector<double> v5 = v11[0];
    s0 v18 = v3;
    v18.p1 = v8;
    const std::vector<double> v10 = v8[1];
    const s0 v22(v6, v8);
    v18.p0 = v11;
    s0 v15 = v0;
    const std::vector<std::vector<double>> v12 = v18.p0;
    std::vector<std::vector<double>> v20 = v8;
    const std::vector<double> v19 = v8[0];
    v17.p0 = v1;
    const std::vector<std::vector<std::vector<double>>> v25 { v4, v20, v20, v8 };
    v1[0] = v10;
    std::vector<double> v16 = v10;
    const std::vector<std::vector<double>> v21 = v22.p0;
    std::vector<double> v52 = v5;
    std::vector<std::vector<double>> v40 = v4;
    const std::vector<double> v26 = v12[0];
    const std::vector<std::vector<double>> v38 { v16, v52, v16, v26, v26, v5 };
    s0 v29 = v22;
    const std::vector<std::vector<double>> v27 = v17.p0;
    s0 v36 = v0;
    std::vector<std::vector<std::vector<double>>> v81 = v25;
    const std::vector<double> v39 = v38[3];
    s0 v46 = v0;
    v15.p0 = v1;
    v36.p1 = v40;
    v40[1] = v39;
    const std::vector<double> v37 = v40[1];
    v81[0] = v20;
    const std::vector<std::vector<double>> v90 = v46.p1;
    const std::vector<std::vector<double>> v102 = v36.p1;
    const std::vector<std::vector<double>> v60 = v29.p0;
    const std::vector<std::vector<double>> v69 = v25[3];
    const std::vector<std::vector<double>> v47 = v0.p1;
    v52 = v39;
    v18.p0 = v27;
    const std::vector<std::vector<double>> v63 = v15.p1;
    std::vector<std::vector<std::vector<double>>> v105 = v81;
    const double v76 = v37[0];
    double v54 = v76;
    v15.p0 = v27;
    v29.p0 = v60;
    const std::vector<double> v89 = v47[1];
    double v172 = v76;
    const std::vector<double> v122 = v69[1];
    const std::vector<std::vector<double>> v119 = v105[2];
    v20[1] = v89;
    const double v80 = v19[0];
    v105[3] = v90;
    v17.p1 = v102;
    v20[0] = v89;
    v81[1] = v63;
    v52[0] = v80;
    double v104 = v172;
    v52[0] = v54;
    s0 v127 = v29;
    const std::vector<double> v124 = v119[0];
    v17.p1 = v47;
    const double v107 = v122[0];
    v127.p1 = v119;
    v16[0] = v104;
    std::vector<double> v430 = v124;
    v20[0] = v430;
    v16[0] = v107;
    v29.p0 = v21;
    v36.p1 = v63;
    return v127;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s0 &v1, const double &v2) {
    const s0 v11 = f14(v1);
    s0 v5 = v11;
    const std::vector<std::vector<double>> v8 = v5.p1;
    const std::vector<double> v16 = v8[0];
    const std::vector<std::vector<double>> v14 = v5.p0;
    std::vector<double> v22 = v16;
    std::vector<std::vector<double>> v63 = v14;
    v5.p0 = v63;
    v63[0] = v16;
    v22[0] = v2;
    const double v55 = v22[0];
    return v55;
  }
  int main() {
    s1 v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } });
    s0 v1({ { { 9.0 } }, { { 10.0 }, { 11.0 } } });
    double v2(12.0);
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
