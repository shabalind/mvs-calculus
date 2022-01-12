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
  struct s3 {
    s1 p0;
    s0 p1;
    s3(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f47(const std::vector<s0> &v0) {
    std::vector<s0> v1 = v0;
    const s0 v3 = v0[0];
    const s0 v2 = v1[1];
    const std::vector<std::vector<double>> v4 = v3.p0;
    v1[1] = v2;
    v1[0] = v2;
    v1 = v0;
    v1 = v0;
    std::vector<s0> v5 = v0;
    const std::vector<std::vector<double>> v10 = v3.p1;
    v1[0] = v2;
    v5[0] = v3;
    const std::vector<std::vector<double>> v18 = v3.p0;
    const std::vector<std::vector<double>> v16 = v3.p1;
    const std::vector<std::vector<double>> v22 = v2.p0;
    v5[1] = v3;
    s0 v20 = v2;
    v20.p0 = v18;
    v5[0] = v20;
    const std::vector<std::vector<double>> v46 = v3.p1;
    v20.p1 = v4;
    v20.p1 = v10;
    v1[0] = v3;
    v20.p1 = v10;
    v20.p0 = v22;
    v20.p0 = v46;
    const std::vector<std::vector<double>> v34 = v3.p1;
    v1[1] = v20;
    v20.p0 = v34;
    s0 v41 = v3;
    v41.p0 = v22;
    v1 = v5;
    s0 v78 = v20;
    v41.p0 = v16;
    std::vector<s0> v53 = v1;
    v53[1] = v78;
    v53[0] = v41;
    return v53;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    const s3 v7 = v0[0];
    const s1 v2 = v7.p0;
    const std::vector<s0> v9 = v2.p0;
    const s0 v21 = v9[0];
    const std::vector<s0> v12 = f47(v9);
    std::vector<s0> v22 = v12;
    v22[1] = v21;
    const s0 v56 = v22[0];
    const std::vector<s0> v44 = v2.p0;
    v22 = v44;
    const std::vector<std::vector<double>> v47 = v56.p1;
    std::vector<std::vector<double>> v63 = v47;
    const std::vector<double> v80 = v63[0];
    const double v146 = v80[0];
    return v146;
  }
  int main() {
    std::vector<s3> v0({ { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 } } } } }, { { { 6.0 } }, { { 7.0 } } } }, { { { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 } } } } }, { { { 14.0 } }, { { 15.0 } } } } });
    double v1(16.0);
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
