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
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s0 v3 = v0.p1;
    const std::vector<std::vector<double>> v6 = v3.p1;
    double v7 = v1;
    const std::vector<double> v15 = v6[0];
    std::vector<double> v2 = v15;
    v2[0] = v7;
    v2[0] = v1;
    const s0 v10 = v0.p1;
    const double v20 = v15[0];
    v2[0] = v1;
    double v105 = v20;
    const std::vector<std::vector<double>> v38 = v10.p0;
    const double v53 = v2[0];
    double v104 = v53;
    const std::vector<double> v67 = v38[0];
    v104 = v105;
    v105 = v104;
    v2 = v67;
    return v104;
  }
  int main() {
    s1 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } });
    double v1(12.0);
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
