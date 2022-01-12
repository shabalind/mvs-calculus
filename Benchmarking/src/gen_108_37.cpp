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
    s0 p2;
    s1(std::vector<s0> v0, s0 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s2 p1;
    s3(std::vector<s0> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s0 p0;
    s3 p1;
    s7(s0 v0, s3 v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s1 p0;
    s7 p1;
    s9(s1 v0, s7 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s9 &v0, const double &v1) {
    const s1 v4 = v0.p0;
    const std::vector<s0> v8 = v4.p0;
    const s0 v9 = v8[0];
    const std::vector<std::vector<double>> v30 = v9.p0;
    const std::vector<double> v42 = v30[0];
    const std::vector<std::vector<double>> v44 = v9.p1;
    const std::vector<double> v64 = v44[0];
    std::vector<double> v47 = v64;
    const double v49 = v42[0];
    double v80 = v49;
    const double v86 = v47[0];
    const double v183 = v86 * v80;
    return v183;
  }
  int main() {
    s9 v0({ { { { { { 0.0 } }, { { 1.0 } } } }, { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 } } }, { { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } } } }, { { { { 14.0 } }, { { 15.0 } } }, { { { { { 16.0 } }, { { 17.0 } } } }, { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } } } } } } });
    double v1(22.0);
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
