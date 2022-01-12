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
    std::vector<s0> p0;
    std::vector<s1> p1;
    s2(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    const s2 v7 = v0[0];
    const std::vector<s0> v5 = v7.p0;
    const s0 v2 = v5[1];
    const std::vector<std::vector<double>> v12 = v2.p1;
    const std::vector<std::vector<double>> v10 = v2.p1;
    const std::vector<std::vector<double>> v26 = v2.p1;
    const std::vector<double> v92 = v12[1];
    const double v90 = v92[0];
    const std::vector<double> v217 = v26[0];
    const std::vector<double> v127 = v10[1];
    const double v124 = v127[0];
    const double v145 = v217[0];
    const double v103 = v124 - v145;
    const double v161 = v103 + v90;
    const double v285 = v103 - v161;
    return v285;
  }
  int main() {
    std::vector<s2> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } }, { { { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } } } });
    double v1(16.0);
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
