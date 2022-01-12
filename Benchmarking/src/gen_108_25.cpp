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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s1 p1;
    s3(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s3> p0;
    s0 p1;
    s6(std::vector<s3> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s0 p0;
    std::vector<s6> p1;
    s7(s0 v0, std::vector<s6> v1): p0(v0), p1(v1) { }
  };
  struct s12 {
    s3 p0;
    s7 p1;
    s12(s3 v0, s7 v1): p0(v0), p1(v1) { }
  };
  s3 f77(const s3 &v0) {
    return v0;
  }
  __attribute__((noinline))
  double f0(const s12 &v0, const double &v1) {
    const s3 v2 = v0.p0;
    const s3 v14 = f77(v2);
    double v80 = v1;
    const s1 v56 = v14.p1;
    const std::vector<s0> v46 = v56.p0;
    const s0 v62 = v46[1];
    const std::vector<std::vector<double>> v49 = v62.p1;
    const std::vector<double> v116 = v49[0];
    const double v133 = v116[0];
    const double v211 = v80 / v133;
    return v211;
  }
  int main() {
    s12 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { { { 24.0 }, { 25.0 } }, { { 26.0 } } } } } } }, { { { { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { { { 30.0 }, { 31.0 } }, { { 32.0 } } }, { { { 33.0 }, { 34.0 } }, { { 35.0 } } } }, { { { { { 36.0 }, { 37.0 } }, { { 38.0 } } } } } } } }, { { { 39.0 }, { 40.0 } }, { { 41.0 } } } } } } });
    double v1(42.0);
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
