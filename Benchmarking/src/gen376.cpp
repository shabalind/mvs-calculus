  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    std::vector<s0> p1;
    s3(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s3>> &v0, const double &v1) {
    const std::vector<s3> v6 = v0[1];
    std::vector<std::vector<s3>> v5 = v0;
    const s3 v8 = v6[0];
    const std::vector<s3> v2 = v5[1];
    v5[0] = v2;
    const std::vector<s3> v14 = v5[0];
    std::vector<std::vector<s3>> v10 = v5;
    const s3 v3 = v14[0];
    v10[1] = v14;
    const std::vector<s0> v12 = v3.p1;
    const std::vector<s3> v18 = v0[1];
    v10[1] = v2;
    v5 = v10;
    v5[0] = v2;
    const s0 v30 = v12[1];
    const std::vector<std::vector<double>> v21 = v30.p1;
    v10[1] = v2;
    const std::vector<double> v37 = v21[0];
    v10 = v0;
    std::vector<double> v44 = v37;
    v10[0] = v2;
    v5[0] = v6;
    v5[1] = v14;
    v10 = v0;
    const double v43 = v44[0];
    double v118 = v43;
    v5[0] = v18;
    std::vector<s3> v82 = v18;
    std::vector<s3> v110 = v82;
    v110[0] = v8;
    const double v223 = v37[0];
    const double v187 = v223 / v118;
    v10[0] = v110;
    return v187;
  }
  int main() {
    std::vector<std::vector<s3>> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } } } }, { { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } }, { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } } } } });
    double v1(24.0);
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
