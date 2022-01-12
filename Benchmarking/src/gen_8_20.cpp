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
    s1(std::vector<s0> v0): p0(v0) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s1 p1;
    s3(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s2 p0;
    s3 p1;
    s0 p2;
    s0 p3;
    s5(s2 v0, s3 v1, s0 v2, s0 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s10 {
    std::vector<s3> p0;
    s5 p1;
    s10(std::vector<s3> v0, s5 v1): p0(v0), p1(v1) { }
  };
  double f86(const double &v0) {
    double v7 = v0;
    double v4 = v7;
    double v1 = v0;
    double v2 = v0;
    double v3 = v0;
    double v14 = v2;
    double v10 = v2;
    double v18 = v1;
    v4 = v14;
    double v17 = v4;
    double v35 = v10;
    const std::vector<double> v22 { v17, v35, v3, v18 };
    const double v26 = v22[1];
    return v26;
  }
  double f70(const double &v0) {
    double v3 = v0;
    double v6 = v3;
    const double v5 = f86(v3);
    const double v7 = f86(v0);
    double v8 = v5;
    double v4 = v3;
    double v13 = v8;
    const double v14 = f86(v7);
    const double v25 = f86(v3);
    const double v24 = f86(v13);
    double v33 = v24;
    double v64 = v6;
    const double v35 = f86(v7);
    double v50 = v4;
    double v57 = v25;
    double v37 = v24;
    const std::vector<double> v29 { v35, v33, v5, v57, v6, v37 };
    const double v49 = f86(v35);
    double v41 = v50;
    const double v56 = f86(v64);
    const double v73 = v29[2];
    const double v44 = v29[4];
    const std::vector<double> v52 { v49, v49, v14, v24, v44, v41 };
    std::vector<double> v71 = v52;
    double v87 = v56;
    const double v94 = v29[1];
    v71[4] = v94;
    v71[1] = v64;
    const double v92 = v29[0];
    const double v79 = v71[1];
    v71[5] = v87;
    const double v66 = v79 + v92;
    v71[4] = v73;
    return v66;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s10 &v1, const double &v2) {
    double v4 = v2;
    const double v52 = v2 + v4;
    const double v42 = f70(v52);
    const double v60 = f70(v42);
    return v60;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } } });
    s10 v1({ { { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } }, { { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } } } }, { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } }, { { { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } } } } } }, { { { { { { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } }, { { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } } } }, { { { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } }, { { { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } } } } } }, { { { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } } }, { { { { 72.0 }, { 73.0 } }, { { 74.0 }, { 75.0 } } }, { { { { { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } }, { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 } } }, { { { 84.0 }, { 85.0 } }, { { 86.0 }, { 87.0 } } } } } }, { { { 88.0 }, { 89.0 } }, { { 90.0 }, { 91.0 } } }, { { { 92.0 }, { 93.0 } }, { { 94.0 }, { 95.0 } } } } });
    double v2(96.0);
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
