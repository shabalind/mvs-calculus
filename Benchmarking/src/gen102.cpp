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
  __attribute__((noinline))
  double f0(const s1 &v0, const s0 &v1, const s1 &v2, const s0 &v3, const double &v4) {
    double v18 = v4;
    v18 = v4;
    const std::vector<double> v12 { v4, v18, v4, v18 };
    const double v17 = v12[2];
    double v34 = v18;
    const double v90 = v12[0];
    std::vector<double> v63 = v12;
    v63[0] = v90;
    std::vector<double> v155 = v63;
    const double v183 = v155[3];
    v63[1] = v34;
    const double v192 = v183 / v17;
    return v192;
  }
  int main() {
    s1 v0({ { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } }, { { { 4.0 } }, { { 5.0 } } } });
    s0 v1({ { { 6.0 } }, { { 7.0 } } });
    s1 v2({ { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } }, { { { 12.0 } }, { { 13.0 } } } });
    s0 v3({ { { 14.0 } }, { { 15.0 } } });
    double v4(16.0);
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
