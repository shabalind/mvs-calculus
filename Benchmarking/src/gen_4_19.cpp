  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s1 p1;
    s3(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    const s3 v7 = v0[0];
    const std::vector<s0> v4 = v7.p0;
    const s0 v10 = v4[0];
    double v9 = v1;
    v9 = v1;
    const std::vector<std::vector<double>> v15 = v10.p3;
    const std::vector<double> v13 = v15[0];
    const double v20 = v13[0];
    const double v38 = v20 / v1;
    const double v69 = v13[0];
    const double v82 = v69 - v38;
    const std::vector<double> v213 = v15[0];
    const double v72 = v213[0];
    v9 = v82;
    const double v103 = v9 - v69;
    const double v167 = v103 * v72;
    const double v118 = v167 - v82;
    return v118;
  }
  int main() {
    std::vector<s3> v0({ { { { { 0.0 }, { { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 } } }, { { 5.0 }, { { 6.0 }, { 7.0 } }, { { 8.0 } }, { { 9.0 } } }, { { 10.0 }, { { 11.0 }, { 12.0 } }, { { 13.0 } }, { { 14.0 } } } }, { { { 15.0 }, { { 16.0 }, { 17.0 } }, { { 18.0 } }, { { 19.0 } } }, { { 20.0 }, { { 21.0 }, { 22.0 } }, { { 23.0 } }, { { 24.0 } } } } }, { { { { 25.0 }, { { 26.0 }, { 27.0 } }, { { 28.0 } }, { { 29.0 } } }, { { 30.0 }, { { 31.0 }, { 32.0 } }, { { 33.0 } }, { { 34.0 } } }, { { 35.0 }, { { 36.0 }, { 37.0 } }, { { 38.0 } }, { { 39.0 } } } }, { { { 40.0 }, { { 41.0 }, { 42.0 } }, { { 43.0 } }, { { 44.0 } } }, { { 45.0 }, { { 46.0 }, { 47.0 } }, { { 48.0 } }, { { 49.0 } } } } } });
    double v1(50.0);
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
