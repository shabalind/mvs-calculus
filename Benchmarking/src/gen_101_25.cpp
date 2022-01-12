  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s0 p1;
    s3(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s12 {
    s3 p0;
    std::vector<std::vector<s3>> p1;
    s12(s3 v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s12 &v0, const double &v1) {
    double v6 = v1;
    const double v15 = v1 + v1;
    const std::vector<std::vector<s3>> v16 = v0.p1;
    const std::vector<s3> v38 = v16[0];
    const s3 v28 = v38[0];
    v6 = v15;
    const s0 v37 = v28.p0;
    const std::vector<std::vector<double>> v84 = v37.p0;
    const std::vector<double> v75 = v84[0];
    const double v117 = v75[0];
    const double v137 = v6 - v117;
    return v137;
  }
  int main() {
    s12 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } }, { { { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } } } });
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
