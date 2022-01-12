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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    std::vector<std::vector<s0>> p2;
    std::vector<s0> p3;
    std::vector<s1> p4;
    std::vector<std::vector<s0>> p5;
    s2(s0 v0, s0 v1, std::vector<std::vector<s0>> v2, std::vector<s0> v3, std::vector<s1> v4, std::vector<std::vector<s0>> v5): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    double v2 = v1;
    const s0 v7 = v0.p1;
    const std::vector<std::vector<double>> v5 = v7.p1;
    const std::vector<double> v12 = v5[0];
    const double v14 = v12[0];
    const double v8 = v12[0];
    const double v38 = v14 * v8;
    double v36 = v2;
    v2 = v38;
    const double v60 = v36 - v38;
    return v60;
  }
  int main() {
    s2 v0({ { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } }, { { { { { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 } } } } }, { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } } } }, { { { { { { 14.0 } }, { { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 } } } } }, { { { { { 18.0 } }, { { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 } } } } }, { { { { { 22.0 } }, { { 23.0 } } } }, { { { { 24.0 } }, { { 25.0 } } } } } }, { { { { { 26.0 } }, { { 27.0 } } } }, { { { { 28.0 } }, { { 29.0 } } } }, { { { { 30.0 } }, { { 31.0 } } } } } });
    double v1(32.0);
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
