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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s1 p0;
    std::vector<s1> p1;
    std::vector<std::vector<s0>> p2;
    s5(s1 v0, std::vector<s1> v1, std::vector<std::vector<s0>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  double f43(const double &v0) {
    double v3 = v0;
    double v7 = v0;
    const std::vector<double> v6 { v0, v0, v7, v3, v3, v0 };
    std::vector<double> v2 = v6;
    const double v9 = v2[1];
    return v9;
  }
  double f9(const double &v0) {
    double v12 = v0;
    double v8 = v12;
    return v8;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const s5 &v1, const double &v2) {
    double v11 = v2;
    double v48 = v2;
    const double v28 = f9(v11);
    double v29 = v11;
    const double v39 = f9(v28);
    const double v70 = f43(v39);
    const double v56 = v48 - v70;
    v11 = v29;
    return v56;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 } }, { { 1.0 } } }, { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } } } }, { { { { { 6.0 } }, { { 7.0 } } }, { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } } } } });
    s5 v1({ { { { { 12.0 } }, { { 13.0 } } }, { { { { 14.0 } }, { { 15.0 } } }, { { { 16.0 } }, { { 17.0 } } } } }, { { { { { 18.0 } }, { { 19.0 } } }, { { { { 20.0 } }, { { 21.0 } } }, { { { 22.0 } }, { { 23.0 } } } } } }, { { { { { 24.0 } }, { { 25.0 } } } }, { { { { 26.0 } }, { { 27.0 } } } } } });
    double v2(28.0);
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
