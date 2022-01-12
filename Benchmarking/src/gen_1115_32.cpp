  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    std::vector<double> p5;
    std::vector<std::vector<double>> p6;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4, std::vector<double> v5, std::vector<std::vector<double>> v6): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    double v7 = v1;
    const std::vector<std::vector<s0>> v6 = v0.p0;
    const std::vector<s0> v15 = v6[0];
    double v31 = v7;
    const std::vector<double> v13 { v31, v1, v31, v1, v1 };
    const s0 v46 = v15[0];
    const std::vector<std::vector<double>> v55 = v46.p2;
    const std::vector<double> v53 = v55[0];
    const double v52 = v13[0];
    const double v74 = v13[4];
    const double v149 = v53[0];
    const double v116 = v53[0];
    double v109 = v52;
    const double v312 = v116 - v74;
    v31 = v149;
    const double v347 = v109 - v312;
    return v347;
  }
  int main() {
    s1 v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 }, { 10.0 } }, { 11.0, 12.0, 13.0 }, { { 14.0 }, { 15.0 } } } } }, { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } }, { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } }, { { 24.0 }, { 25.0 }, { 26.0 } }, { 27.0, 28.0, 29.0 }, { { 30.0 }, { 31.0 } } } });
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
