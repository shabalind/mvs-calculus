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
    double p1;
    s1(s0 v0, double v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s3(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s1> p0;
    s3 p1;
    s5(std::vector<s1> v0, s3 v1): p0(v0), p1(v1) { }
  };
  double f4(const double &v0, const s3 &v1) {
    const std::vector<s0> v5 = v1.p0;
    const s0 v7 = v5[1];
    const std::vector<std::vector<double>> v2 = v7.p0;
    const std::vector<double> v11 = v2[1];
    const double v22 = v11[0];
    return v22;
  }
  __attribute__((noinline))
  double f0(const s5 &v0, const double &v1) {
    const s3 v2 = v0.p1;
    const double v14 = f4(v1, v2);
    const double v17 = f4(v14, v2);
    const double v15 = f4(v17, v2);
    const double v19 = f4(v15, v2);
    return v19;
  }
  int main() {
    s5 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, 4.0 } }, { { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 }, { 12.0 } } }, { { { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 } } } }, { { { { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } } } });
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
