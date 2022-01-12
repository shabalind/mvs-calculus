  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s2(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s0>> p0;
    s2 p1;
    s4(std::vector<std::vector<s0>> v0, s2 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const double &v1) {
    std::vector<s4> v2 = v0;
    const s4 v5 = v0[0];
    v2[0] = v5;
    const s4 v12 = v2[0];
    const s2 v11 = v12.p1;
    v2[0] = v12;
    v2[0] = v5;
    const std::vector<s0> v45 = v11.p1;
    const s0 v38 = v45[1];
    const std::vector<std::vector<double>> v42 = v38.p1;
    const std::vector<double> v65 = v42[0];
    const double v81 = v65[0];
    return v81;
  }
  int main() {
    std::vector<s4> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } } }, { { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } }, { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } } } });
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
