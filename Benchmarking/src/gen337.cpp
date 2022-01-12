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
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const s0 &v1, const double &v2) {
    const s1 v7 = v0[0];
    const s0 v3 = v7.p0;
    double v6 = v2;
    const std::vector<std::vector<double>> v14 = v3.p1;
    const std::vector<std::vector<double>> v13 = v3.p0;
    const std::vector<double> v11 = v13[1];
    std::vector<double> v19 = v11;
    std::vector<std::vector<double>> v37 = v14;
    v37[0] = v19;
    v37[0] = v11;
    const std::vector<std::vector<double>> v18 = v1.p2;
    std::vector<std::vector<double>> v25 = v18;
    v19[0] = v6;
    const std::vector<double> v50 = v37[0];
    const std::vector<double> v21 = v25[0];
    v37[0] = v21;
    const double v130 = v50[0];
    return v130;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } }, { { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 } }, { { 34.0 }, { 35.0 } } } } });
    s0 v1({ { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } }, { { 40.0 }, { 41.0 } } });
    double v2(42.0);
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
