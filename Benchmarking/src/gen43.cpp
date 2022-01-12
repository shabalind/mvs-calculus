  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const double v2 = v1 + v1;
    double v8 = v2;
    const double v6 = v1 + v2;
    const std::vector<double> v18 { v2, v8, v8 };
    const s0 v11 = v0.p0;
    std::vector<double> v16 = v18;
    const std::vector<s0> v15 { v11, v11, v11, v11, v11, v11, v11 };
    v16[2] = v2;
    const double v10 = v16[1];
    const double v17 = v16[0];
    const double v21 = v10 / v17;
    const s0 v24 = v15[2];
    v16[2] = v6;
    v16[0] = v6;
    const std::vector<double> v22 = v24.p1;
    v16[1] = v21;
    v16 = v22;
    return v17;
  }
  int main() {
    s2 v0({ { { { 0.0 }, { 1.0 } }, { 2.0, 3.0, 4.0 } }, { { { { { 5.0 }, { 6.0 } }, { 7.0, 8.0, 9.0 } } }, { { { { 10.0 }, { 11.0 } }, { 12.0, 13.0, 14.0 } }, { { { 15.0 }, { 16.0 } }, { 17.0, 18.0, 19.0 } }, { { { 20.0 }, { 21.0 } }, { 22.0, 23.0, 24.0 } } } } });
    double v1(25.0);
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
