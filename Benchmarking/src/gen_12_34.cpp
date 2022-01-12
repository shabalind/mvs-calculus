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
  struct s2 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s2(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    double v8 = v1;
    double v5 = v8;
    const double v17 = v8 * v8;
    v8 = v17;
    const double v40 = v8 * v17;
    const std::vector<double> v41 { v1, v40, v1, v1 };
    const double v18 = v8 - v5;
    std::vector<double> v16 = v41;
    v16[3] = v18;
    v16[1] = v18;
    const double v42 = v18 - v8;
    v16[2] = v42;
    v16[0] = v5;
    v16[0] = v42;
    v16[1] = v8;
    v16 = v41;
    v16[3] = v1;
    v16[3] = v1;
    double v65 = v18;
    std::vector<double> v37 = v41;
    v37[2] = v42;
    v37 = v16;
    v16[1] = v17;
    v37[2] = v40;
    v37[0] = v65;
    v37[1] = v8;
    const double v82 = v37[1];
    return v82;
  }
  int main() {
    s2 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 } }, { { 16.0 }, { 17.0 } } }, { { { 18.0 } }, { { 19.0 }, { 20.0 } } } } } });
    double v1(21.0);
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
