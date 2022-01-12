  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s0 p2;
    s1(s0 v0, std::vector<std::vector<s0>> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    std::vector<s0> p1;
    s3(s2 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f36(const double &v0) {
    double v2 = v0;
    double v7 = v2;
    double v3 = v7;
    return v3;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    const double v7 = f36(v1);
    double v5 = v7;
    const double v4 = f36(v5);
    double v17 = v1;
    v17 = v5;
    const double v41 = v5 + v4;
    const double v190 = v5 / v17;
    const double v137 = v41 + v190;
    return v137;
  }
  int main() {
    std::vector<s3> v0({ { { { { { 0.0, 1.0 }, { { 2.0 } } }, { { 3.0, 4.0 }, { { 5.0 } } }, { { 6.0, 7.0 }, { { 8.0 } } } }, { { { 9.0, 10.0 }, { { 11.0 } } }, { { { { 12.0, 13.0 }, { { 14.0 } } } }, { { { 15.0, 16.0 }, { { 17.0 } } } } }, { { 18.0, 19.0 }, { { 20.0 } } } } }, { { { 21.0, 22.0 }, { { 23.0 } } } } } });
    double v1(24.0);
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
