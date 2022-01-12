  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<double> p0;
    s0 p1;
    s1(std::vector<double> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s1 &v1, const s1 &v2, const s2 &v3, const double &v4) {
    const std::vector<std::vector<double>> v7 = v0.p1;
    const std::vector<double> v6 = v7[0];
    const std::vector<std::vector<double>> v8 = v0.p1;
    const double v13 = v6[0];
    const std::vector<double> v25 = v8[0];
    const double v56 = v25[0];
    const double v49 = v13 * v56;
    const double v75 = v6[0];
    double v48 = v49;
    v48 = v75;
    return v48;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 } } });
    s1 v1({ { 3.0, 4.0 }, { { { 5.0 }, { 6.0 } }, { { 7.0 } } } });
    s1 v2({ { 8.0, 9.0 }, { { { 10.0 }, { 11.0 } }, { { 12.0 } } } });
    s2 v3({ { { { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 } } } });
    double v4(19.0);
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
