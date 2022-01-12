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
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    double v4 = v1;
    double v15 = v1;
    const double v12 = v1 * v1;
    double v46 = v1;
    double v32 = v4;
    double v36 = v32;
    const double v165 = v46 / v12;
    double v113 = v165;
    const double v141 = v46 - v36;
    const double v81 = v141 / v15;
    const double v105 = v113 + v81;
    return v105;
  }
  int main() {
    s2 v0({ { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } });
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
