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
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f3(const double &v0) {
    double v6 = v0;
    double v2 = v6;
    double v1 = v0;
    double v7 = v1;
    double v3 = v6;
    double v4 = v3;
    double v10 = v4;
    double v8 = v4;
    double v21 = v10;
    double v13 = v4;
    double v14 = v6;
    const double v11 = v21 / v13;
    double v27 = v14;
    const std::vector<double> v12 { v7, v7, v6, v6, v21, v4, v11 };
    std::vector<double> v23 = v12;
    v23[4] = v4;
    v23[3] = v14;
    const double v29 = v23[5];
    const double v33 = v23[6];
    v23[2] = v8;
    double v34 = v2;
    const double v19 = v12[1];
    v23[0] = v10;
    v14 = v29;
    v23[6] = v7;
    const std::vector<double> v64 { v33, v1, v11, v34, v4, v27 };
    v27 = v33;
    v23[4] = v33;
    std::vector<double> v53 = v64;
    std::vector<double> v86 = v53;
    v53[4] = v19;
    v23[0] = v10;
    const double v126 = v86[1];
    return v126;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const std::vector<double> &v1, const std::vector<s1> &v2, const std::vector<s2> &v3, const double &v4) {
    std::vector<double> v12 = v1;
    v12 = v1;
    double v18 = v4;
    const double v28 = v12[0];
    std::vector<double> v16 = v1;
    v16[0] = v4;
    const double v41 = f3(v4);
    v12[0] = v4;
    v16[1] = v18;
    v12 = v1;
    v12[0] = v41;
    v16[1] = v28;
    std::vector<double> v50 = v1;
    v12 = v50;
    const double v52 = f3(v41);
    const double v131 = f3(v52);
    std::vector<double> v157 = v16;
    const double v96 = v157[1];
    v16[1] = v131;
    return v96;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } });
    std::vector<double> v1({ 18.0, 19.0 });
    std::vector<s1> v2({ { { { { { 20.0 } }, { { 21.0 }, { 22.0 } } }, { { { 23.0 } }, { { 24.0 }, { 25.0 } } } }, { { { 26.0 } }, { { 27.0 }, { 28.0 } } } } });
    std::vector<s2> v3({ { { { { { { 29.0 } }, { { 30.0 }, { 31.0 } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 } } } }, { { { 35.0 } }, { { 36.0 }, { 37.0 } } } }, { { { { { 38.0 } }, { { 39.0 }, { 40.0 } } }, { { { 41.0 } }, { { 42.0 }, { 43.0 } } } }, { { { 44.0 } }, { { 45.0 }, { 46.0 } } } } }, { { { { { { 47.0 } }, { { 48.0 }, { 49.0 } } }, { { { 50.0 } }, { { 51.0 }, { 52.0 } } } }, { { { 53.0 } }, { { 54.0 }, { 55.0 } } } }, { { { { { 56.0 } }, { { 57.0 }, { 58.0 } } }, { { { 59.0 } }, { { 60.0 }, { 61.0 } } } }, { { { 62.0 } }, { { 63.0 }, { 64.0 } } } } }, { { { { { { 65.0 } }, { { 66.0 }, { 67.0 } } }, { { { 68.0 } }, { { 69.0 }, { 70.0 } } } }, { { { 71.0 } }, { { 72.0 }, { 73.0 } } } }, { { { { { 74.0 } }, { { 75.0 }, { 76.0 } } }, { { { 77.0 } }, { { 78.0 }, { 79.0 } } } }, { { { 80.0 } }, { { 81.0 }, { 82.0 } } } } } });
    double v4(83.0);
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
