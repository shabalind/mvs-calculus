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
  struct s4 {
    s1 p0;
    s1 p1;
    s4(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s4 f90(const s4 &v0) {
    s4 v1 = v0;
    s4 v8 = v0;
    const s1 v13 = v1.p0;
    v8.p0 = v13;
    return v8;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const double &v1) {
    const s4 v11 = v0[2];
    const s4 v22 = f90(v11);
    const s1 v16 = v22.p1;
    const s0 v32 = v16.p1;
    const std::vector<std::vector<double>> v36 = v32.p0;
    const std::vector<double> v41 = v36[0];
    const double v190 = v41[0];
    return v190;
  }
  int main() {
    std::vector<s4> v0({ { { { { { { 0.0 } } }, { { { 1.0 } } } }, { { { 2.0 } } } }, { { { { { 3.0 } } }, { { { 4.0 } } } }, { { { 5.0 } } } } }, { { { { { { 6.0 } } }, { { { 7.0 } } } }, { { { 8.0 } } } }, { { { { { 9.0 } } }, { { { 10.0 } } } }, { { { 11.0 } } } } }, { { { { { { 12.0 } } }, { { { 13.0 } } } }, { { { 14.0 } } } }, { { { { { 15.0 } } }, { { { 16.0 } } } }, { { { 17.0 } } } } } });
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
