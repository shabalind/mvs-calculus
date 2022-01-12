  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f33(const s0 &v0) {
    const std::vector<double> v5 = v0.p1;
    s0 v2 = v0;
    v2.p1 = v5;
    v2.p1 = v5;
    const std::vector<double> v7 = v0.p1;
    v2.p1 = v7;
    v2.p1 = v5;
    const std::vector<std::vector<double>> v21 = v2.p0;
    v2.p1 = v5;
    v2 = v0;
    const std::vector<std::vector<double>> v15 = v0.p0;
    const std::vector<std::vector<double>> v16 = v2.p0;
    const std::vector<double> v12 = v0.p1;
    const s0 v18(v16, v12);
    v2.p0 = v21;
    v2.p0 = v15;
    return v18;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    const s2 v2 = v0[2];
    const s0 v6 = v2.p1;
    const s0 v8 = f33(v6);
    const std::vector<std::vector<double>> v11 = v8.p0;
    const std::vector<double> v32 = v11[0];
    const double v64 = v32[0];
    double v85 = v64;
    return v85;
  }
  int main() {
    std::vector<s2> v0({ { { { { 0.0 } }, { 1.0, 2.0 } }, { { { 3.0 } }, { 4.0, 5.0 } } }, { { { { 6.0 } }, { 7.0, 8.0 } }, { { { 9.0 } }, { 10.0, 11.0 } } }, { { { { 12.0 } }, { 13.0, 14.0 } }, { { { 15.0 } }, { 16.0, 17.0 } } } });
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
