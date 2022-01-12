  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    s1 p1;
    s4(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s1 f32(const s1 &v0) {
    const s0 v1 = v0.p1;
    const s4 v11(v1, v0);
    const s1 v26 = v11.p1;
    s1 v29 = v26;
    return v29;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s1 v2 = f32(v0);
    const s0 v6 = v2.p0;
    const std::vector<std::vector<double>> v4 = v6.p1;
    const std::vector<double> v10 = v4[0];
    const double v11 = v10[0];
    return v11;
  }
  int main() {
    s1 v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } });
    double v1(8.0);
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
