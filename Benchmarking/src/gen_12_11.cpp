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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s0> p0;
    s1 p1;
    s6(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f58(const double &v0) {
    double v7 = v0;
    double v4 = v0;
    double v1 = v7;
    double v5 = v0;
    double v2 = v5;
    double v3 = v1;
    v7 = v5;
    double v11 = v3;
    double v13 = v11;
    double v8 = v11;
    double v6 = v2;
    v5 = v3;
    v7 = v0;
    double v17 = v8;
    v5 = v7;
    double v37 = v11;
    const std::vector<double> v16 { v6, v2, v5, v17 };
    const double v27 = v16[0];
    const double v48 = v16[0];
    const std::vector<double> v36 { v48, v4, v27, v17, v13, v37 };
    const double v43 = v36[4];
    return v43;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s6>> &v0, const double &v1) {
    const double v2 = f58(v1);
    const double v5 = v2 * v2;
    const double v13 = f58(v5);
    return v13;
  }
  int main() {
    std::vector<std::vector<s6>> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } } } } } }, { { { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } } } } }, { { { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } } }, { { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } } } } } } } });
    double v1(45.0);
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
