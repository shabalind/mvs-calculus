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
  struct s3 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s3(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s3 &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v6 = v1.p1;
    const std::vector<double> v11 = v6[0];
    const double v27 = v11[0];
    std::vector<double> v17 = v11;
    v17[0] = v2;
    const double v32 = v11[0];
    const double v33 = v27 * v32;
    v17[0] = v2;
    v17[0] = v32;
    const double v96 = v2 * v33;
    const double v51 = v17[0];
    v17[0] = v32;
    const double v139 = v96 * v51;
    return v139;
  }
  int main() {
    s3 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } } } });
    s0 v1({ { { 24.0 }, { 25.0 } }, { { 26.0 } } });
    double v2(27.0);
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
