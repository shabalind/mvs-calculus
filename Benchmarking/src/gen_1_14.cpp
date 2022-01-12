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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s2(s0 v0): p0(v0) { }
  };
  struct s3 {
    s2 p0;
    s1 p1;
    s3(s2 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    s2 p1;
    s5(s0 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    std::vector<std::vector<s5>> p0;
    s3 p1;
    s8(std::vector<std::vector<s5>> v0, s3 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s8 &v0, const double &v1) {
    double v8 = v1;
    const s3 v9 = v0.p1;
    const s2 v20 = v9.p0;
    double v16 = v8;
    const s0 v33 = v20.p0;
    const std::vector<std::vector<double>> v53 = v33.p1;
    const std::vector<double> v26 = v53[0];
    const double v64 = v26[0];
    const std::vector<double> v101 = v53[0];
    std::vector<double> v92 = v101;
    v92[0] = v64;
    v92[0] = v16;
    v92 = v101;
    const double v67 = v92[0];
    const double v165 = v67 * v67;
    v92[0] = v64;
    return v165;
  }
  int main() {
    s8 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } } } }, { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } } });
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
