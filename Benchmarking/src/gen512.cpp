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
    s1(std::vector<s0> v0): p0(v0) { }
  };
  struct s4 {
    std::vector<s1> p0;
    s0 p1;
    s4(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s4> p0;
    s4 p1;
    s5(std::vector<s4> v0, s4 v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s5 p0;
    std::vector<s1> p1;
    s9(s5 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s9 &v0, const double &v1) {
    const std::vector<double> v7 { v1, v1, v1, v1, v1 };
    const double v8 = v7[3];
    std::vector<double> v16 = v7;
    const double v21 = v7[2];
    const double v25 = v16[3];
    const double v15 = v25 * v21;
    const double v17 = v25 / v25;
    double v79 = v8;
    v16[4] = v15;
    v16[2] = v21;
    v16[1] = v79;
    return v17;
  }
  int main() {
    s9 v0({ { { { { { { { { { 0.0 } }, { { 1.0 } } } } }, { { { { { 2.0 } }, { { 3.0 } } } } } }, { { { 4.0 } }, { { 5.0 } } } }, { { { { { { { 6.0 } }, { { 7.0 } } } } }, { { { { { 8.0 } }, { { 9.0 } } } } } }, { { { 10.0 } }, { { 11.0 } } } } }, { { { { { { { 12.0 } }, { { 13.0 } } } } }, { { { { { 14.0 } }, { { 15.0 } } } } } }, { { { 16.0 } }, { { 17.0 } } } } }, { { { { { { 18.0 } }, { { 19.0 } } } } }, { { { { { 20.0 } }, { { 21.0 } } } } } } });
    double v1(22.0);
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
