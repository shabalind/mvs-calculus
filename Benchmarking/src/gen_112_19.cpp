  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s1(std::vector<s0> v0): p0(v0) { }
  };
  struct s2 {
    s1 p0;
    std::vector<std::vector<s1>> p1;
    s2(s1 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    s2 v7 = v0;
    const std::vector<std::vector<s1>> v4 = v0.p1;
    v7.p1 = v4;
    const s1 v2 = v7.p0;
    const std::vector<s0> v5 = v2.p0;
    const s0 v9 = v5[0];
    v7.p0 = v2;
    const std::vector<std::vector<double>> v25 = v9.p0;
    s0 v40 = v9;
    s0 v33 = v40;
    const std::vector<std::vector<double>> v46 = v33.p0;
    const std::vector<double> v100 = v46[0];
    const std::vector<std::vector<double>> v151 = v33.p0;
    std::vector<std::vector<double>> v93 = v151;
    v40.p0 = v93;
    v40.p0 = v25;
    const double v77 = v100[0];
    return v77;
  }
  int main() {
    s2 v0({ { { { { { 0.0 } } } } }, { { { { { { { 1.0 } } } } } } } });
    double v1(2.0);
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
