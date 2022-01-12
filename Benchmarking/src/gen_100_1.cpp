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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s1> p1;
    s2(s1 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    double p1;
    s3(s2 v0, double v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s3>> &v0, const double &v1) {
    const std::vector<s3> v5 = v0[0];
    const s3 v4 = v5[0];
    const std::vector<s3> v3 = v0[0];
    s3 v6 = v4;
    const s3 v8 = v3[0];
    const s3 v7 = v3[0];
    const s2 v10 = v8.p0;
    v6.p1 = v1;
    v6.p0 = v10;
    v6 = v7;
    const s3 v23 = v3[0];
    const double v17 = v1 * v1;
    v6 = v23;
    s3 v32 = v6;
    v6.p0 = v10;
    double v30 = v1;
    v32.p0 = v10;
    v6.p0 = v10;
    v6.p1 = v1;
    v30 = v17;
    const double v41 = v32.p1;
    const double v87 = v30 * v41;
    return v87;
  }
  int main() {
    std::vector<std::vector<s3>> v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } } }, 18.0 } } });
    double v1(19.0);
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
