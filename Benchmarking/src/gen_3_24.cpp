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
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const std::vector<std::vector<s0>> &v1, const double &v2) {
    std::vector<std::vector<s0>> v8 = v1;
    const std::vector<s0> v4 = v8[1];
    const s0 v6 = v4[0];
    const std::vector<s0> v17 = v8[0];
    const std::vector<std::vector<double>> v12 = v6.p0;
    const std::vector<s0> v5 = v1[1];
    const std::vector<double> v14 = v12[0];
    v8[0] = v5;
    v8[1] = v17;
    const double v34 = v14[0];
    v8[1] = v5;
    return v34;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } }, { { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } } });
    std::vector<std::vector<s0>> v1({ { { { { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } });
    double v2(18.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
