  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s0 p2;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s0> p1;
    s2(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s1 v8 = v0.p0;
    const s0 v2 = v8.p2;
    const std::vector<std::vector<double>> v6 = v2.p0;
    std::vector<std::vector<double>> v4 = v6;
    const std::vector<double> v9 = v4[0];
    const std::vector<double> v14 = v4[0];
    v4[0] = v14;
    const double v21 = v14[0];
    v4[0] = v9;
    const double v23 = v14[0];
    double v19 = v23;
    v4[0] = v9;
    const double v69 = v1 * v23;
    const double v68 = v19 - v69;
    v4[0] = v14;
    const std::vector<double> v71 { v69, v68, v21 };
    std::vector<double> v144 = v71;
    const double v280 = v144[0];
    return v280;
  }
  int main() {
    s2 v0({ { { { { { 0.0 } } }, { { { 1.0 } } }, { { { 2.0 } } } }, { { { { { 3.0 } } } } }, { { { 4.0 } } } }, { { { { 5.0 } } } } });
    double v1(6.0);
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
