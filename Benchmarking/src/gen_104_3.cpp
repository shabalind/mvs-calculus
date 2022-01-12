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
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f92(const s0 &v0) {
    const s2 v3(v0, v0);
    const s2 v4(v0, v0);
    const std::vector<s2> v1 { v4, v3, v4 };
    std::vector<s2> v5 = v1;
    v5[0] = v4;
    v5[1] = v3;
    const s2 v11 = v5[2];
    const s0 v24 = v11.p0;
    v5[0] = v11;
    return v24;
  }
  s0 f78(const s0 &v0) {
    s0 v1 = v0;
    s0 v4 = v0;
    const s0 v8 = f92(v0);
    const std::vector<std::vector<double>> v17 = v4.p1;
    v1.p0 = v17;
    const s2 v22(v8, v1);
    const s0 v26 = v22.p1;
    const std::vector<std::vector<double>> v36 = v26.p0;
    const s0 v86(v36, v17);
    return v86;
  }
  double f41(const double &v0) {
    double v3 = v0;
    double v7 = v3;
    double v2 = v0;
    double v1 = v3;
    double v4 = v2;
    double v8 = v4;
    double v9 = v4;
    const std::vector<double> v14 { v1, v7 };
    std::vector<double> v15 = v14;
    const double v21 = v14[1];
    const double v13 = v14[0];
    const double v12 = v14[0];
    v15[1] = v8;
    v15[1] = v3;
    std::vector<double> v24 = v14;
    const double v17 = v9 / v21;
    const double v37 = v15[0];
    v15[0] = v37;
    const double v43 = v24[1];
    std::vector<double> v22 = v15;
    const double v29 = v22[0];
    const double v27 = v14[1];
    const double v20 = v24[0];
    v24[0] = v43;
    v8 = v13;
    double v42 = v12;
    const std::vector<double> v55 { v43, v27, v29, v20, v17, v21, v42 };
    std::vector<double> v56 = v55;
    double v49 = v7;
    double v80 = v13;
    std::vector<double> v116 = v56;
    v8 = v49;
    std::vector<double> v83 = v116;
    const double v113 = v83[1];
    v56[0] = v80;
    return v113;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s0 &v1, const std::vector<s1> &v2, const s1 &v3, const double &v4) {
    const std::vector<s0> v6 = v0.p0;
    const s0 v10 = v6[1];
    const s0 v11 = f78(v10);
    const std::vector<std::vector<double>> v12 = v10.p0;
    const std::vector<std::vector<double>> v17 = v11.p0;
    const std::vector<double> v22 = v17[0];
    const s0 v29 = v6[1];
    const double v35 = v22[0];
    const std::vector<double> v25 = v12[1];
    const std::vector<std::vector<double>> v46 = v29.p0;
    const double v20 = v22[0];
    const double v52 = f41(v20);
    const std::vector<double> v68 = v46[1];
    std::vector<double> v30 = v68;
    v30[0] = v35;
    const std::vector<std::vector<double>> v66 { v22, v25, v22, v25, v30, v22 };
    v30[0] = v20;
    const std::vector<double> v79 = v66[2];
    v30[0] = v52;
    const double v135 = v79[0];
    return v135;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } });
    s0 v1({ { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } });
    std::vector<s1> v2({ { { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } }, { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } } }, { { { { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } }, { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } } }, { { { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } } } } });
    s1 v3({ { { { { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } }, { { { 72.0 }, { 73.0 } }, { { 74.0 }, { 75.0 } } }, { { { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } } }, { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 } } } });
    double v4(84.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
