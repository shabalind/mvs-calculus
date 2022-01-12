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
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    std::vector<std::vector<s1>> p1;
    s3(s0 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    s3 v2 = v0;
    double v5 = v1;
    s3 v3 = v2;
    const double v7 = v1 - v5;
    double v11 = v5;
    const s0 v6 = v3.p0;
    double v21 = v11;
    const std::vector<std::vector<double>> v25 = v6.p1;
    const std::vector<double> v16 = v25[1];
    const double v81 = v7 - v5;
    std::vector<double> v62 = v16;
    v11 = v5;
    const double v44 = v16[0];
    v5 = v7;
    v62[0] = v21;
    const double v99 = v44 - v81;
    v62[0] = v11;
    double v114 = v99;
    const double v170 = v62[0];
    const double v187 = v170 * v114;
    return v187;
  }
  int main() {
    s3 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } } }, { { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } } } } } });
    double v1(28.0);
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
