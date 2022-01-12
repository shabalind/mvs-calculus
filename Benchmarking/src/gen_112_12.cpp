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
  struct s2 {
    s0 p0;
    s2(s0 v0): p0(v0) { }
  };
  struct s3 {
    s1 p0;
    std::vector<std::vector<s2>> p1;
    s3(s1 v0, std::vector<std::vector<s2>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const s0 &v1, const double &v2) {
    const std::vector<double> v7 { v2, v2, v2, v2, v2 };
    std::vector<double> v5 = v7;
    const double v9 = v7[2];
    double v11 = v2;
    v5[1] = v9;
    double v12 = v9;
    v5[1] = v11;
    const double v18 = v5[2];
    v5[2] = v18;
    v5[3] = v18;
    v5[3] = v12;
    v5[3] = v12;
    v5[4] = v2;
    const double v46 = v5[0];
    const double v41 = v9 * v11;
    double v50 = v18;
    v5[1] = v41;
    v5[3] = v46;
    v12 = v46;
    return v50;
  }
  int main() {
    std::vector<s3> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } } }, { { { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } } } } } });
    s0 v1({ { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } });
    double v2(16.0);
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
