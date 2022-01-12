  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    std::vector<s0> p1;
    s3(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s1 v3 = v0.p0;
    const std::vector<s0> v6 = v3.p0;
    const s0 v16 = v6[0];
    const std::vector<std::vector<double>> v20 = v16.p0;
    const s0 v27 = v3.p1;
    const std::vector<double> v23 = v20[0];
    const std::vector<std::vector<double>> v50 = v27.p0;
    const double v33 = v23[0];
    std::vector<double> v56 = v23;
    std::vector<double> v41 = v56;
    v56[0] = v33;
    const std::vector<double> v130 = v50[0];
    v41 = v130;
    const double v82 = v23[0];
    v41[0] = v82;
    const double v278 = v41[0];
    return v278;
  }
  int main() {
    s3 v0({ { { { { { 0.0 } } } }, { { { 1.0 } } } }, { { { { 2.0 } } }, { { { 3.0 } } }, { { { 4.0 } } } } });
    double v1(5.0);
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
