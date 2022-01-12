  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s1>> p0;
    s1 p1;
    s2(std::vector<std::vector<s1>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f111(const double &v0) {
    double v3 = v0;
    v3 = v0;
    double v1 = v0;
    double v7 = v1;
    double v5 = v3;
    double v4 = v5;
    double v16 = v3;
    double v9 = v16;
    double v10 = v9;
    double v8 = v1;
    double v17 = v1;
    double v41 = v5;
    const std::vector<double> v19 { v9 };
    const double v27 = v19[0];
    std::vector<double> v35 = v19;
    const double v18 = v19[0];
    v35[0] = v18;
    std::vector<double> v37 = v35;
    v37[0] = v27;
    v37[0] = v17;
    std::vector<double> v32 = v35;
    std::vector<double> v38 = v35;
    const double v29 = v32[0];
    const std::vector<std::vector<double>> v66 { v38, v35, v32, v37, v19, v32, v37 };
    double v40 = v41;
    v35[0] = v4;
    v37[0] = v10;
    v32[0] = v29;
    const double v34 = v32[0];
    const std::vector<double> v54 = v66[6];
    v38[0] = v29;
    v37[0] = v7;
    v35[0] = v7;
    v17 = v4;
    v37[0] = v34;
    v38[0] = v0;
    v32[0] = v40;
    const double v52 = v54[0];
    v41 = v8;
    return v52;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const std::vector<s2> &v1, const s1 &v2, const std::vector<s1> &v3, const double &v4) {
    const double v7 = f111(v4);
    const s0 v9 = v2.p1;
    const std::vector<std::vector<double>> v19 = v9.p0;
    const std::vector<double> v32 = v19[0];
    const double v46 = v32[0];
    std::vector<double> v26 = v32;
    v26[0] = v46;
    v26[0] = v7;
    const double v80 = v26[0];
    const double v62 = f111(v46);
    const double v194 = v62 + v80;
    const double v66 = v7 * v194;
    const double v141 = v66 / v46;
    double v63 = v141;
    return v63;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { { 0.0 }, { 1.0 }, { 2.0 } } }, { { { 3.0 }, { 4.0 }, { 5.0 } } } } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } } }, { { { 9.0 }, { 10.0 }, { 11.0 } } } } } });
    std::vector<s2> v1({ { { { { { { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 }, { 17.0 } } } } } }, { { { { 18.0 }, { 19.0 }, { 20.0 } } }, { { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { { { { { 24.0 }, { 25.0 }, { 26.0 } } }, { { { 27.0 }, { 28.0 }, { 29.0 } } } } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } } }, { { { 33.0 }, { 34.0 }, { 35.0 } } } } }, { { { { { { { 36.0 }, { 37.0 }, { 38.0 } } }, { { { 39.0 }, { 40.0 }, { 41.0 } } } } } }, { { { { 42.0 }, { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 }, { 47.0 } } } } } });
    s1 v2({ { { { 48.0 }, { 49.0 }, { 50.0 } } }, { { { 51.0 }, { 52.0 }, { 53.0 } } } });
    std::vector<s1> v3({ { { { { 54.0 }, { 55.0 }, { 56.0 } } }, { { { 57.0 }, { 58.0 }, { 59.0 } } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } } }, { { { 63.0 }, { 64.0 }, { 65.0 } } } } });
    double v4(66.0);
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
