  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    double p1;
    s1(std::vector<std::vector<s0>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    double p1;
    s2(std::vector<std::vector<s0>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    std::vector<s1> p0;
    s2 p1;
    s9(std::vector<s1> v0, s2 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s9 &v0, const double &v1) {
    const std::vector<s1> v7 = v0.p0;
    const s1 v24 = v7[0];
    const std::vector<std::vector<s0>> v91 = v24.p0;
    const std::vector<s0> v84 = v91[0];
    const s0 v104 = v84[0];
    const std::vector<std::vector<double>> v49 = v104.p1;
    const std::vector<double> v97 = v49[1];
    const double v307 = v97[0];
    double v122 = v307;
    const double v127 = v122 + v1;
    return v127;
  }
  int main() {
    s9 v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } } }, 3.0 } }, { { { { { { 4.0 } }, { { 5.0 }, { 6.0 } } } }, { { { { 7.0 } }, { { 8.0 }, { 9.0 } } } } }, 10.0 } });
    double v1(11.0);
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
