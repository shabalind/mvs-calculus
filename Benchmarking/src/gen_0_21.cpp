  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    double p0;
    s0 p1;
    s1(double v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<std::vector<s1>> p1;
    s2(s1 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s0 p1;
    s3(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<s0> &v1, const s2 &v2, const std::vector<s3> &v3, const double &v4) {
    const double v5 = v4 * v4;
    double v15 = v5;
    const std::vector<std::vector<s1>> v6 = v0.p1;
    const double v16 = v5 * v15;
    const std::vector<s1> v27 = v6[0];
    const double v24 = v5 + v16;
    const s1 v14 = v27[0];
    double v34 = v16;
    const double v42 = v5 - v24;
    double v127 = v34;
    const double v102 = v14.p0;
    const double v74 = v102 - v42;
    const double v159 = v127 + v74;
    return v159;
  }
  int main() {
    s2 v0({ { 0.0, { { { 1.0 } }, { { 2.0 } } } }, { { { 3.0, { { { 4.0 } }, { { 5.0 } } } } }, { { 6.0, { { { 7.0 } }, { { 8.0 } } } } } } });
    std::vector<s0> v1({ { { { 9.0 } }, { { 10.0 } } }, { { { 11.0 } }, { { 12.0 } } } });
    s2 v2({ { 13.0, { { { 14.0 } }, { { 15.0 } } } }, { { { 16.0, { { { 17.0 } }, { { 18.0 } } } } }, { { 19.0, { { { 20.0 } }, { { 21.0 } } } } } } });
    std::vector<s3> v3({ { { { 22.0, { { { 23.0 } }, { { 24.0 } } } } }, { { { 25.0 } }, { { 26.0 } } } }, { { { 27.0, { { { 28.0 } }, { { 29.0 } } } } }, { { { 30.0 } }, { { 31.0 } } } }, { { { 32.0, { { { 33.0 } }, { { 34.0 } } } } }, { { { 35.0 } }, { { 36.0 } } } } });
    double v4(37.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
