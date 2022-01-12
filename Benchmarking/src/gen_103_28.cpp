  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s5(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s0> p0;
    std::vector<s5> p1;
    s7(std::vector<s0> v0, std::vector<s5> v1): p0(v0), p1(v1) { }
  };
  s7 f75(const s7 &v0) {
    s7 v121 = v0;
    return v121;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const double &v1) {
    const s7 v2 = f75(v0);
    const std::vector<s0> v3 = v2.p0;
    const s0 v9 = v3[0];
    const std::vector<std::vector<double>> v20 = v9.p1;
    const std::vector<double> v19 = v20[1];
    const std::vector<std::vector<double>> v14 = v9.p1;
    const std::vector<double> v59 = v14[1];
    const std::vector<double> v54 = v14[1];
    const std::vector<std::vector<double>> v70 { v59, v59, v54, v59, v19, v59, v19 };
    const std::vector<double> v132 = v70[3];
    const double v168 = v132[0];
    return v168;
  }
  int main() {
    s7 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } }, { { { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } }, { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } } }, { { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } }, { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } }, { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } } } } } });
    double v1(52.0);
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
