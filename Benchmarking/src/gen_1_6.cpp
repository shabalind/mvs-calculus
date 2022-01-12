  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s0 p2;
    s1(s0 v0, std::vector<s0> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    s1 p0;
    std::vector<std::vector<s0>> p1;
    s2(s1 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f4(const std::vector<s0> &v0) {
    const s0 v2 = v0[0];
    const s0 v7 = v0[0];
    const s0 v6 = v0[0];
    const std::vector<std::vector<double>> v3 = v7.p1;
    s0 v9 = v2;
    std::vector<s0> v14 = v0;
    v14 = v0;
    const std::vector<std::vector<double>> v15 = v2.p0;
    v9.p1 = v3;
    const std::vector<std::vector<double>> v27 = v6.p0;
    const std::vector<std::vector<double>> v16 = v9.p1;
    v9.p1 = v16;
    v14[0] = v9;
    v9.p0 = v27;
    v9.p0 = v15;
    v14[0] = v7;
    std::vector<s0> v53 = v14;
    v53 = v14;
    v9.p0 = v15;
    return v53;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const std::vector<std::vector<s0>> &v1, const double &v2) {
    std::vector<std::vector<s0>> v8 = v1;
    const std::vector<s0> v4 = v8[0];
    const std::vector<s0> v12 = f4(v4);
    const std::vector<double> v11 { v2 };
    std::vector<double> v3 = v11;
    const double v13 = v3[0];
    const std::vector<s0> v20 = f4(v4);
    std::vector<double> v29 = v11;
    const std::vector<s0> v26 = f4(v20);
    const double v24 = v2 / v2;
    v29[0] = v13;
    double v27 = v2;
    const std::vector<s0> v16 = f4(v12);
    v8[0] = v16;
    const std::vector<double> v40 { v24 };
    v3[0] = v2;
    v3[0] = v27;
    const s0 v83 = v26[0];
    const std::vector<s0> v46 = f4(v4);
    const double v53 = v29[0];
    double v87 = v53;
    const std::vector<std::vector<double>> v90 = v83.p0;
    v8[1] = v46;
    const std::vector<double> v81 = v90[0];
    v8[0] = v46;
    v29 = v40;
    v29 = v81;
    v29[0] = v53;
    return v87;
  }
  int main() {
    std::vector<s2> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } }, { { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } }, { { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } } }, { { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } } }, { { { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } }, { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } } }, { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } }, { { { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } } }, { { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } } }, { { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } } } } });
    std::vector<std::vector<s0>> v1({ { { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } } }, { { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } } });
    double v2(80.0);
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
