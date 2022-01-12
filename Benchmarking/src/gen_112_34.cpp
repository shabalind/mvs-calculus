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
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s0 v3 = v0.p1;
    const std::vector<std::vector<double>> v7 = v3.p0;
    const std::vector<std::vector<double>> v2 = v3.p1;
    const std::vector<double> v13 = v2[0];
    const std::vector<double> v16 = v7[0];
    const double v48 = v13[0];
    const double v35 = v16[0];
    double v25 = v35;
    const double v31 = v48 / v25;
    const double v103 = v31 - v35;
    return v103;
  }
  int main() {
    s2 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } });
    double v1(15.0);
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
