  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f1(const double &v0, const std::vector<s1> &v1) {
    return v0;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const double v4 = f1(v1, v0);
    const std::vector<std::vector<s1>> v6 { v0, v0, v0, v0 };
    double v3 = v4;
    double v9 = v3;
    std::vector<std::vector<s1>> v22 = v6;
    v22[3] = v0;
    v22[0] = v0;
    const double v31 = f1(v9, v0);
    const std::vector<s1> v68 = v22[2];
    std::vector<std::vector<s1>> v43 = v22;
    const double v40 = f1(v31, v68);
    v22 = v43;
    return v40;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } }, { { 4.0 } } }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 } }, { { 9.0 } } }, { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 } }, { { 14.0 } } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } }, { { 24.0 } } }, { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 } }, { { 29.0 } } } } } });
    double v1(30.0);
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
