  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    double p1;
    s2(s0 v0, double v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s0 p1;
    s3(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s3 p0;
    s2 p1;
    s4(s3 v0, s2 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const double &v1) {
    const s4 v2 = v0[0];
    const s2 v5 = v2.p1;
    double v7 = v1;
    double v9 = v1;
    const s0 v4 = v5.p0;
    v9 = v7;
    const std::vector<std::vector<double>> v12 = v4.p0;
    v7 = v1;
    const std::vector<double> v40 = v12[1];
    const std::vector<std::vector<double>> v24 = v4.p0;
    const std::vector<double> v50 = v24[1];
    const double v68 = v5.p1;
    const double v26 = v50[0];
    std::vector<double> v32 = v40;
    v32[0] = v7;
    v32[0] = v9;
    v32[0] = v68;
    const double v81 = v32[0];
    v32[0] = v26;
    return v81;
  }
  int main() {
    std::vector<s4> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } }, 15.0 } } });
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
