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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s1>> p0;
    s0 p1;
    s3(std::vector<std::vector<s1>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s3 f29(const s3 &v0) {
    s3 v8 = v0;
    return v8;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s3 v4 = f29(v0);
    const double v2 = v1 / v1;
    const s0 v11 = v4.p1;
    const std::vector<std::vector<double>> v23 = v11.p0;
    double v21 = v2;
    const std::vector<double> v46 = v23[0];
    std::vector<double> v95 = v46;
    v95[0] = v1;
    const double v131 = v95[0];
    v95[0] = v21;
    const double v171 = v21 * v131;
    return v171;
  }
  int main() {
    s3 v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } });
    double v1(18.0);
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
