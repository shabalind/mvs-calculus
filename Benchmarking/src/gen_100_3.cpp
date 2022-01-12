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
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s1 p1;
    s3(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const double &v0, const s3 &v1) {
    const std::vector<double> v7 { v0, v0 };
    const double v2 = v7[1];
    std::vector<double> v3 = v7;
    const double v5 = v3[1];
    const double v11 = v3[1];
    v3[1] = v11;
    v3[0] = v5;
    v3[1] = v11;
    v3[0] = v11;
    std::vector<double> v47 = v3;
    v3 = v47;
    v3[0] = v11;
    v47[1] = v2;
    const double v137 = v47[1];
    return v137;
  }
  int main() {
    double v0(0.0);
    s3 v1({ { { { { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 }, { 6.0 } } } }, { { { 7.0 }, { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 }, { 12.0 } } } }, { { { { { 13.0 }, { 14.0 }, { 15.0 } }, { { 16.0 }, { 17.0 }, { 18.0 } } } }, { { { 19.0 }, { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } } });
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
