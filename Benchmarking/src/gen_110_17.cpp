  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<double>> p0;
    s1(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s6 {
    std::vector<std::vector<s0>> p0;
    s1 p1;
    s6(std::vector<std::vector<s0>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s6>> &v0, const double &v1) {
    const std::vector<s6> v7 = v0[1];
    double v3 = v1;
    const s6 v2 = v7[0];
    const s1 v5 = v2.p1;
    const s1 v10 = v2.p1;
    double v39 = v3;
    const std::vector<std::vector<double>> v45 = v10.p0;
    const std::vector<std::vector<double>> v59 = v5.p0;
    std::vector<std::vector<double>> v38 = v59;
    v38 = v45;
    double v63 = v1;
    const std::vector<double> v79 = v38[0];
    std::vector<double> v87 = v79;
    const double v123 = v87[0];
    v38[0] = v79;
    v87[0] = v63;
    v63 = v39;
    return v123;
  }
  int main() {
    std::vector<std::vector<s6>> v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } } } }, { { { 9.0 } } } } }, { { { { { { { 10.0 } }, { { 11.0 }, { 12.0 } } } }, { { { { 13.0 } }, { { 14.0 }, { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 } } } } }, { { { 19.0 } } } } } });
    double v1(20.0);
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
