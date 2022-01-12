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
    s0 p0;
    s1 p1;
    s3(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s3 f55(const s3 &v0) {
    const s1 v2 = v0.p1;
    const s0 v6 = v0.p0;
    s0 v15 = v6;
    s3 v5 = v0;
    const s0 v1 = v5.p0;
    const std::vector<std::vector<double>> v7 = v1.p1;
    v15.p0 = v7;
    v5.p0 = v6;
    s0 v9 = v15;
    v5.p1 = v2;
    const s0 v18 = v0.p0;
    s1 v11 = v2;
    s1 v25 = v11;
    const s0 v23 = v11.p1;
    const std::vector<s0> v16 = v25.p0;
    const std::vector<s0> v13 { v23, v15 };
    const s0 v29 = v13[1];
    v15 = v9;
    const std::vector<std::vector<s0>> v27 { v16, v16, v16, v16 };
    const std::vector<s0> v37 = v27[1];
    v11.p1 = v18;
    v11.p0 = v37;
    v5.p1 = v25;
    v5.p0 = v29;
    return v5;
  }
  s3 f31(const s3 &v0, const s3 &v1) {
    const s3 v7 = f55(v1);
    const s1 v5 = v0.p1;
    s1 v19 = v5;
    s3 v24 = v7;
    v24.p1 = v19;
    return v24;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s3 v3 = f31(v0, v0);
    const s1 v6 = v3.p1;
    const s0 v11 = v6.p1;
    const std::vector<std::vector<double>> v22 = v11.p1;
    std::vector<std::vector<double>> v35 = v22;
    const std::vector<double> v62 = v35[0];
    const double v72 = v62[0];
    v35[1] = v62;
    return v72;
  }
  int main() {
    s3 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } } });
    double v1(12.0);
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
